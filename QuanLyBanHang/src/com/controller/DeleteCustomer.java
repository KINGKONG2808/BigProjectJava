package com.controller;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DeleteCustomer {
    public static boolean deleteCustomer(int maKhachHang){
        int result = 0;
        String sqlDelete = "DELETE FROM KhachHang WHERE maKhachHang = ? ";
        try {
            PreparedStatement ps = ConnectDatabase.getConnection().prepareStatement(sqlDelete);
            ps.setInt(1, maKhachHang);
            result = ps.executeUpdate();
        } catch (Exception e) {e.printStackTrace();}
        return result>0;
    }
}
