/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.NhanVien;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hung Nguyen
 */
public class NhanVienDao {
    
    private Connection connect = null;
    
    public NhanVienDao() throws SQLException{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanHang","sa","1234");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NhanVienDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<NhanVien> getList() {
        ArrayList<NhanVien> list = new ArrayList<>();
        String sql = "select* from NhanVien";
        try {
            PreparedStatement pstm = connect.prepareStatement(sql);
            ResultSet result = pstm.executeQuery();
            while(result.next()){
                NhanVien nhanvien = new NhanVien();
                nhanvien.setMaNhanVien(result.getInt(1));
                nhanvien.setTenNhanVien(result.getString(2));
                nhanvien.setTuoi(result.getInt(3));
                nhanvien.setGioiTinh(result.getString(4));
                nhanvien.setQueQuan(result.getString(5));
                nhanvien.setNgaySinh(result.getDate(6));
                nhanvien.setLuong(result.getInt(7));
                
                list.add(nhanvien);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    
    public boolean themNhanVien(NhanVien nhanvien){
        int result = 0;
        String query = "insert into NhanVien values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = connect.prepareStatement(query);
            pstm.setInt(1, nhanvien.getMaNhanVien());
            pstm.setString(2, nhanvien.getTenNhanVien());
            pstm.setInt(3, nhanvien.getTuoi());
            pstm.setString(4, nhanvien.getGioiTinh());
            pstm.setString(5, nhanvien.getQueQuan());
            pstm.setTimestamp(6, new Timestamp(nhanvien.getNgaySinh().getTime()));
            pstm.setInt(7, nhanvien.getLuong());
            
            result = pstm.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return result > 0;
    }
    
    public boolean updateThongTinNhanVien(NhanVien nhanvien){
        int result = 0;
        String query = "Update dbo.NhanVien Set TenNhanVien = ?, Tuoi = ?, GioiTinh = ?, QueQuan = ?, NgaySinh = ?, Luong = ? Where MaNhanVien = ?";
        try {
            PreparedStatement pstm = connect.prepareStatement(query);
            pstm.setString(1, nhanvien.getTenNhanVien());
            pstm.setInt(2, nhanvien.getTuoi());
            pstm.setString(3, nhanvien.getGioiTinh());
            pstm.setString(4, nhanvien.getQueQuan());
            pstm.setTimestamp(5, new Timestamp(nhanvien.getNgaySinh().getTime()));
            pstm.setInt(6, nhanvien.getLuong());
            pstm.setInt(7, nhanvien.getMaNhanVien());
            
           result =  pstm.executeUpdate();
           
        } catch (Exception e) {
        }
        
         return result > 0;
    }
    
    
//    public boolean xoaNhanVien(int ma){
//        String query = "Delete NhanVien Where MaNhanVien = ?";
//        try {
//            PreparedStatement pstm = connect.prepareStatement(query);
//            pstm.setInt(1, ma);
//            pstm.executeUpdate();
//            return true;
//        } catch (Exception e) {
//        }
//        
//        return false;
//    }
    
    public boolean Delete(int maHang)
    {
        int result = 0;
        String query = "Delete dbo.NhanVien Where MaNhanVien = ?";
        try {
            PreparedStatement pre = connect.prepareStatement(query);
            pre.setInt(1, maHang);
            result = pre.executeUpdate();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return result > 0;
    }
}
