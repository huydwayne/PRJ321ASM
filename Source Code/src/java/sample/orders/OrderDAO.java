/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sample.products.ProductDTO;
import sample.utils.DBUtils;

/**
 *
 * @author HiGien
 */
public class OrderDAO {

    public boolean createOrder(String username, double total) throws SQLException {
        Connection con = null;
        PreparedStatement pstm = null;
        String sql = "INSERT INTO [Order](Username, Total) " + "VALUES (?, ?)";
        try {
            con = DBUtils.getConnect();
            if (con != null) {
                pstm = con.prepareStatement(sql);
                pstm.setString(1, username);
                pstm.setDouble(2, total);
                pstm.executeUpdate();
                return true;
            }
        } finally {
            if (pstm != null) {
                pstm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

    public int getLastOrderID() throws SQLException {
        ResultSet rs = null;
        Connection con = null;
        PreparedStatement pstm = null;
        String sql = "SELECT max(OrderID) as last from [Order]";
        try {
            con = DBUtils.getConnect();
            if (con != null) {
                pstm = con.prepareStatement(sql);
                rs = pstm.executeQuery();
                if (rs.next()) {
                    int id = rs.getInt("last");
                    return id;
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            
            if (pstm != null) {
                pstm.close();
            }
            if (con != null) {
                con.close();
            }

        }
        return -1;
    }
    
        public boolean createOrderLine(int OrderID, String id, int quantity) throws SQLException {
        Connection con = null;
        PreparedStatement pstm = null;
        String sql = "INSERT INTO OrderLine(OrderID, ProductID, Quantity) " + "VALUES (?, ?, ?)";
        try {
            con = DBUtils.getConnect();
            if (con != null) {
                pstm = con.prepareStatement(sql);
                pstm.setInt(1, OrderID);
                pstm.setString(2, id);
                pstm.setInt(3, quantity);
                pstm.executeUpdate();
                return true;
            }
        } finally {
            if (pstm != null) {
                pstm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
}
