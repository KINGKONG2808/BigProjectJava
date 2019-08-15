/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.views;
//
//import com.controller.DeleteProduct;
//import com.controller.InputProduct;
//import com.controller.InsertProduct;
//import com.controller.JDBCConnection;
//import com.controller.ShowProducts;
//import com.controller.UpdateProduct;
//import com.model.Products;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args){
//        int chon;
//        Scanner sc = new Scanner(System.in);
//        
//         ArrayList<Products> listPro;// ShowProducts.getListProducts();
//       
//        do{
//            System.out.println("1.hien thi danh sach san pham");
//            System.out.println("2.them san pham");
//            System.out.println("3.cap nhat san pham");
//            System.out.println("4.xoa san pham");
//            System.out.println("5.thoat");
//            
//            System.out.println("moi nhap vao lua chon");
//            chon = sc.nextInt();
//            switch(chon){
//                case 1:
//                    System.out.println("--DANH SACH SAN PHAM---");
//                    listPro = ShowProducts.getListProducts();
//                    ShowProducts.xuat(listPro);
//                    
//                   break;
//                case 2:
//                   System.out.println("add sp");
//                   Products x = new InputProduct().input();
//                   InsertProduct.insert(x);
//                   ShowProducts.getListProducts();
//                   //ShowProducts.display(listPro); có thể gán key =1 hoặc viees lại hàm như trên
//                   
//                   break;
//                case 3:
//                    System.out.println("update");
//                    System.out.println("nhap vao ma hang can update");
//                    int maHang = sc.nextInt();
//                    UpdateProduct.update(maHang);
//                   // ShowProducts.display(listPro);
//                 
//                    break;
//                case 4:
//                    System.out.println("delete");
//                    System.out.println("nhap vao ma hang muon xoa");
//                    int maHang1 = sc.nextInt();
//                    DeleteProduct.delete(maHang1);
//                   //ShowProducts.xuat(listPro);
//                    // cái này xem:v vdd
//                    listPro= ShowProducts.getListProducts();
//                    ShowProducts.xuat(listPro);
//                    
//                    break;
//            }
//        }while(chon!=5);
//    }
//}
