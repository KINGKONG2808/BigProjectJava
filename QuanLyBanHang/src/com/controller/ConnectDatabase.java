package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDatabase {
    public static Connection getConnection(){
        Connection connect = null;
        String url = "jdbc:sqlserver://localhost:1433;databasename=QuanLyBanHang";
        String user = "sa";
        String password = "1234";
        try {
            connect = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {e.printStackTrace();}
        return connect;
    }
}
