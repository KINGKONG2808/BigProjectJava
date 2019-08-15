package com.controller;

import com.model.Customer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GetListCustomer {
    public static ArrayList<Customer> getListCustomer(){
        ArrayList<Customer> listCustomer = new ArrayList<>();
        String sql = "SELECT * FROM KhachHang";
        try {
            PreparedStatement s = ConnectDatabase.getConnection().prepareStatement(sql);
            ResultSet rs = s.executeQuery();
            while(rs.next()){
                Customer customer = new Customer();
                customer.setMaKhachHang(rs.getInt(1));
                customer.setTenKhachHang(rs.getString(2));
                customer.setDiaChi(rs.getString(3));
                customer.setSoDienThoai(rs.getString(4));
                customer.setGioiTinh(rs.getString(5));
                listCustomer.add(customer);
            }
        } catch (Exception e) {e.printStackTrace();}
        return listCustomer;
    }
//    public static void printListCustomer(ArrayList<Customer> customer){
//        System.out.printf("%20s%20s%20s%20s%20s%n", "Ma KH", "Ten KH", "Dia Chi", "SDT", "Gioi Tinh");
//        for (int i = 0; i < customer.size(); i++) {
//            System.out.printf("%20d%20s%20s%20s%20s%n", 
//                    customer.get(i).getMaKhachHang(), 
//                    customer.get(i).getTenKhachHang(),
//                    customer.get(i).getDiaChi(),
//                    customer.get(i).getSoDienThoai(),
//                    customer.get(i).getGioiTinh());
//        }
//    }
//    public static void displayAllOfList(){
//        ArrayList<Customer> cs = GetListCustomer.getListCustomer();
//        GetListCustomer.printListCustomer(cs);
//    }
}
