/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.Products;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class InputProduct {
    
           public  static Products input(){
                    Scanner sc = new Scanner(System.in);
                    Products product = new Products();
                    System.out.println("nhap vao ma san pham");
                    product.setMaHang(sc.nextInt());
                    sc.nextLine();
                    System.out.println("nhap vao ten san pham");
                    product.setTenHang(sc.nextLine());
                    System.out.println("nhap vao gia san pham");
                    product.setGia(sc.nextFloat());
                    sc.nextLine();
                    System.out.println("nhap vao nha cung cap");
                    product.setNhaCungCap(sc.nextLine());
                    System.out.println("nhap vao so luong");
                    product.setSoLuong(sc.nextInt());
                    return product;
            }
}
