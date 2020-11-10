/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.users;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import sample.products.ProductDTO;
import sample.utils.DBUtils;

/**
 *
 * @author HiGien
 */
public class UserDAO implements Serializable {

    private UserDTO user;
    
    public boolean createUser(UserDTO user) throws SQLException{
        Connection con = null;
        PreparedStatement pstm = null;
        String sql = "INSERT INTO [User](username, password, name, role) " + "VALUES (?, ?, ?, ?)";
        try {
            con = DBUtils.getConnect();
            if (con != null){
                pstm = con.prepareStatement(sql);
                pstm.setString(1, user.getUsername());
                pstm.setString(2, user.getPassword());
                pstm.setString(3, user.getName());
                pstm.setBoolean(4, user.isRole());
                pstm.executeUpdate();
                return true;
            }
        } finally {
            if (pstm != null){
                pstm.close();
            }
            if (con != null){
                con.close();
            }
        }
        return false;
    }

    public boolean checkLogin(String username, String password) throws SQLException {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM [User] WHERE username=? AND password=?";
        try {
            con = DBUtils.getConnect();
            if (con != null) {

                pstm = con.prepareStatement(sql);

                pstm.setString(1, username);
                pstm.setString(2, password);

                rs = pstm.executeQuery();
                if (rs.next()) {
                    String name = rs.getString("name");
                    Boolean role = rs.getBoolean("role");

                    this.user = new UserDTO(username, password, name, role);
                    return true;
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
        return false;
    }

    public UserDTO getUser() {
        return user;
    }
}
