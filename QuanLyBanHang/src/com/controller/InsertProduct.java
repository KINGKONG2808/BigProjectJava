/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.Products;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class InsertProduct {
   //t sửa lai cho đúng MVc nhé,
    //t hk web cac hamf them sua xoa de trong contrller ma
    // t nghĩ phải để trong model chứ
    //model laf lop thực thể ,chỉ chứa thuộc tính của các thực theeeeruwsok t bi^^ết r^^ồi
     public static boolean insert(Products product){
        String sql = "INSERT INTO Hang(maHang,tenHang,gia,nhaCungCap,soLuong) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = JDBCConnection.getConnection().prepareStatement(sql);
            ps.setInt(1,product.getMaHang());
            ps.setString(2, product.getTenHang());
            ps.setFloat(3, product.getGia());
            ps.setString(4, product.getNhaCungCap());
            ps.setInt(5, product.getSoLuong());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
            
}
