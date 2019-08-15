package com.controller;

import com.model.Customer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateCustomer {
    public static boolean updateCustomer(Customer customer){
        int result = 0;
        String sqlUpdate = "UPDATE KhachHang SET TenKhachHang=?, DiaChi=?, SoDienThoai=?, GioiTinh=? WHERE MaKhachHang=?";
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement(sqlUpdate);
            ps.setInt(5, customer.getMaKhachHang());
            ps.setString(1, customer.getTenKhachHang());
            ps.setString(2, customer.getDiaChi());
            ps.setString(3, customer.getSoDienThoai());
            ps.setString(4, customer.getGioiTinh());
            result = ps.executeUpdate();
          
        } catch (Exception e) {e.printStackTrace();}
        return result > 0;
    }
}
