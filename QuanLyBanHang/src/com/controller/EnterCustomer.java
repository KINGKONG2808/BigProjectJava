package com.controller;

import com.model.Customer;
import java.util.Scanner;

public class EnterCustomer {
    public static Customer enterCustomer(){
        Customer customer = new Customer();
        Scanner input = new Scanner(System.in);
        System.out.print("Ma khach hang: ");
        int maKhachHang = input.nextInt();
        customer.setMaKhachHang(maKhachHang);
        input.nextLine();
        System.out.print("Ten khach hang: ");
        String tenKhachHang = input.nextLine();
        customer.setTenKhachHang(tenKhachHang);
        System.out.print("Dia chi khach hang: ");
        String diaChi = input.nextLine();
        customer.setDiaChi(diaChi);
        System.out.print("So dien thoai: ");
        String soDienThoai = input.nextLine();
        customer.setSoDienThoai(soDienThoai);
        System.out.print("Gioi tinh: ");
        String gioiTinh = input.nextLine();
        customer.setGioiTinh(gioiTinh);
        return customer;
    }
}
