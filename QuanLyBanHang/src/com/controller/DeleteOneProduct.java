/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.Products;
import java.sql.PreparedStatement;

/**
 *
 * @author Admin
 */
public class DeleteOneProduct {
    
    public static boolean delete(int maHang){
        int result = 0;
        String sql = "DELETE FROM Hang WHERE MaHang=?";
        try {
            PreparedStatement ps = JDBCConnection.getConnection().prepareStatement(sql);
            ps.setInt(1, maHang);
            result = ps.executeUpdate();  
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result > 0;
    }
}
