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
public class UpdateOneProduct {
    public static boolean update(Products product){
        int result = 0;
        String sql = "UPDATE HANG SET TenHang =?,Gia = ?,NhaCungCap = ?,SoLuong = ? WHERE MaHang = ?";
        try {
             PreparedStatement ps = JDBCConnection.getConnection().prepareStatement(sql);
             ps.setString(1, product.getTenHang());
             ps.setFloat(2, product.getGia());
             ps.setString(3, product.getNhaCungCap());
             ps.setInt(4,product.getSoLuong());
             ps.setInt(5, product.getMaHang());
             result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result > 0;
    }
}
