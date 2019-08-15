package com.controller;

import com.model.Customer;
import java.sql.PreparedStatement;

public class AddCustomer {
    public static boolean addCustomer(Customer customer){
        String sqlAdd = "INSERT INTO KhachHang(MaKhachHang, TenKhachHang, DiaChi, SoDienThoai, GioiTinh) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement(sqlAdd);
            ps.setInt(1, customer.getMaKhachHang());
            ps.setString(2, customer.getTenKhachHang());
            ps.setString(3, customer.getDiaChi());
            ps.setString(4, customer.getSoDienThoai());
            ps.setString(5, customer.getGioiTinh());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {e.printStackTrace();}
        return false;
    }
}
