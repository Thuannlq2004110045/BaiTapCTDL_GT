package com.thuannlq2004110045.tuan04;

import java.util.Scanner;

public class TaiKhoanTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tài khoản cần lưu trữ");
        int m = scanner.nextInt();
        scanner.nextLine();
        TaiKhoan[] danhSachtaikhoan = new TaiKhoan[m];
        int n = danhSachtaikhoan.length;
        System.out.println("Nhập vào danh sách tài khoản");
        
        for(int i=0; i<danhSachtaikhoan.length;i++){
            System.out.println("Nhập tài khoản thứ " +(i+1));
            System.out.print("Nhập tên chủ tài khoản: ");
            String tenChuTaiKhoan = scanner.nextLine();

            System.out.print("Nhập số tài khoản: ");
            String soTaiKhoan = scanner.nextLine();

            System.out.print("Nhập số dư tài khoản: ");
            double soDuTaiKhoan = scanner.nextDouble();

            danhSachtaikhoan[i] = new TaiKhoan(tenChuTaiKhoan, soTaiKhoan, soDuTaiKhoan);
        }

        System.out.println("Danh sách tài khoản sau khi nhập");
        int k=0;
        for(TaiKhoan taikhoan : danhSachtaikhoan){
            System.out.println("Thông tin tài khoản thứ " +(k+1));

            taikhoan.inThongTinTaiKhoan();
            k+=1;
        }
// thêm tài khoản
        TaiKhoan newdanhSachtaikhoan[] = new TaiKhoan[n+1];
        for(int i=0; i<n;i++){
            newdanhSachtaikhoan[i]= danhSachtaikhoan[i];
        }
        System.out.println("Nhập tài khoản muốn thêm ");
        System.out.print("Nhập tên chủ tài khoản: ");
            String tenChuTaiKhoan = scanner.nextLine();

            System.out.print("Nhập số tài khoản: ");
            String soTaiKhoan = scanner.nextLine();

            System.out.print("Nhập số dư tài khoản: ");
            double soDuTaiKhoan = scanner.nextDouble();
            scanner.nextLine();


        newdanhSachtaikhoan[n] = new TaiKhoan(tenChuTaiKhoan, soTaiKhoan, soDuTaiKhoan);


        System.out.println("In danh sách sau khi thêm ");
        int h=0;
        for(TaiKhoan x : newdanhSachtaikhoan){
            System.out.println("Thông tin tài khoản thứ " + (h+1));
            
            x.inThongTinTaiKhoan();
            h+=1;
        }

        //Xóa tài khoản
        System.out.println("Nhập tài khoản muốn xóa");
        int xoa = scanner.nextInt();
        TaiKhoan danhSachxoa[] = new TaiKhoan[n];
        int dem=0;
        for (int i=0; i<= n; i++){
            if(i==(xoa-1)){
                continue;
            }
            danhSachxoa[dem]= newdanhSachtaikhoan[i];
            dem++;
        }
        System.out.println("danh sách tài khoản sau khi xóa");
        int tam = 0;
        for(int i=0; i<n; i++){
            if(tam == (xoa-1))
            tam+=1;
            System.out.println("Xe " + (tam + 1));
            danhSachxoa[i].inThongTinTaiKhoan();
            tam++;
        }
    }
}
