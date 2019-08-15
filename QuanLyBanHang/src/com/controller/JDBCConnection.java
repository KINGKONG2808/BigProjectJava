/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class JDBCConnection {
    public static Connection getConnection(){
        Connection con = null;
        
        String url = "jdbc:sqlserver://localhost:1433;databaseName = QuanLyBanHang;";
        String userName = "sa";
        String userPass = "1234";
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerConnection");
            con = DriverManager.getConnection(url,userName,userPass);
            System.out.println("ket noi thanh cong!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
