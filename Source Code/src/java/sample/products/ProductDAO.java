/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.products;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import sample.utils.DBUtils;

/**
 *
 * @author HiGien
 */

public class ProductDAO implements Serializable{
    public ArrayList<ProductDTO> getAll() throws SQLException{
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<ProductDTO> list = new ArrayList<>();
        String sql = "SELECT * FROM Product";
        try {
            con = DBUtils.getConnect();
            if (con != null){
                pstm = con.prepareStatement(sql);
                rs = pstm.executeQuery();
                while (rs.next()){
                    String id = rs.getString("ProductID");
                    String name = rs.getString("ProductName");
                    String description = rs.getString("ProductDescription");
                    double price = rs.getDouble("ProductPrice");
                    String image = rs.getString("ProductImage");
                    
                    ProductDTO product = new ProductDTO(id, name, description, price, image);
                    
                    list.add(product);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null){
                rs.close();
            }
            if (pstm != null){
                pstm.close();
            }
            if (con != null) {
                con.close();
            }
        }
       return list;
    }
    public ProductDTO getDataById(String pid) throws SQLException{
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Product WHERE ProductID=?";
        try {
            con = DBUtils.getConnect();
            if (con != null){
                pstm = con.prepareStatement(sql);
                pstm.setString(1, pid);
                rs = pstm.executeQuery();
                if (rs.next()){
                     String id = rs.getString("ProductID");
                    String name = rs.getString("ProductName");
                    String description = rs.getString("ProductDescription");
                    double price = rs.getDouble("ProductPrice");
                    String image = rs.getString("ProductImage");
                    
                    ProductDTO product = new ProductDTO(id, name, description, price, image);
                    return product;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (rs != null) {
                rs.close();
            }
            
            if (pstm != null){
                pstm.close();
            }
            
            if (con != null){
                con.close();
            }
        }
        return null;
    }
    public boolean deleteProduct(String pid) throws SQLException{
        Connection con = null;
        PreparedStatement pstm = null;
        String sql = "DELETE FROM Product WHERE ProductID=?";
        try {
            con = DBUtils.getConnect();
            if (con != null){
                pstm = con.prepareStatement(sql);
                pstm.setString(1,  pid);
                pstm.executeUpdate();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
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
    
    public boolean createProduct(ProductDTO pd) throws SQLException{
        Connection con = null;
        PreparedStatement pstm = null;
        String sql = "INSERT INTO Product(ProductID, ProductName, ProductDescription, ProductPrice, ProductImage) " + "VALUES (?, ?, ?, ?, ?)";
        try {
            con = DBUtils.getConnect();
            if (con != null){
                pstm = con.prepareStatement(sql);
                pstm.setString(1, pd.getId());
                pstm.setString(2, pd.getName());
                pstm.setString(3, pd.getDescription());
                pstm.setDouble(4, pd.getPrice());
                pstm.setString(5, pd.getImage());
                pstm.executeUpdate();
                return true;
            }
        }  finally {
            if (pstm != null){
                pstm.close();
            }
            if (con != null){
                con.close();
            }
        }
        return false;
    }
    public boolean updateProduct(ProductDTO pd) throws SQLException{
 Connection con = null;
        PreparedStatement pstm = null;
        String sql = "UPDATE Product SET ProductName=?, ProductDescription=?, ProductPrice=?, ProductImage=? WHERE ProductID=?";
        try {
            con = DBUtils.getConnect();
            if (con != null){
                pstm = con.prepareStatement(sql);
            
                pstm.setString(1, pd.getName());
                pstm.setString(2, pd.getDescription());
                pstm.setDouble(3, pd.getPrice());
                pstm.setString(4, pd.getImage());
                pstm.setString(5, pd.getId());
                pstm.executeUpdate();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
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
}


