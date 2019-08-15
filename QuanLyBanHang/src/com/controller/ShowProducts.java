/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.Products;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ShowProducts {
    public static ArrayList<Products> getListProducts(){
        Connection con = JDBCConnection.getConnection();
        String sql = "select * from Hang";
        ArrayList<Products> listProducts = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            //System.out.printf("%18s%18s%18s%18s%18s","Ma Hang","Ten Hang","Gia","NhaCC","So Luong");
            while(rs.next()){
                Products product = new Products();
                product.setMaHang(rs.getInt(1));
                product.setTenHang(rs.getString(2));
                product.setGia(rs.getFloat(3));
                product.setNhaCungCap(rs.getString(4));
                product.setSoLuong(rs.getInt(5));
                listProducts.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProducts;
    }
}
