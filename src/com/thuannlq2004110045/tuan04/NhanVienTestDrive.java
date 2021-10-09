package com.thuannlq2004110045.tuan04;

import java.util.Scanner;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số nhân viên cần lưu trữ");
        int m = scanner.nextInt();
        scanner.nextLine();
        NhanVien[] danhSachnhanvien = new NhanVien[m];
        int n = danhSachnhanvien.length;
        System.out.println("Nhập danh sách nhân viên");

        for(int i=0; i< danhSachnhanvien.length; i++){
            System.out.println("Nhập nhân viên thứ " +(i+1));            
            System.out.print("Nhập tên nhân viên: ");   
            String tenNhanVien = scanner.nextLine();

            System.out.print("Nhập lương: ");            
            double luong  = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Nhập địa chỉ: ");            
            String diaChi  = scanner.nextLine();

            System.out.print("Nhập bộ phận làm việc: ");            
            String boPhanLamViec = scanner.nextLine();

            System.out.print("Nhập ngày sinh: ");            
            String ngaySinh = scanner.nextLine();
            danhSachnhanvien[i] = new NhanVien(tenNhanVien, luong, diaChi, boPhanLamViec, ngaySinh);
        }

        System.out.println("danh sách nhân viên sau khi nhập");

        int k =0;
        for(NhanVien nhanvien: danhSachnhanvien){
            
            System.out.println("nhân viên thứ " + (k+1));
            nhanvien.inThongTinNhanVien();
            k+=1;
        }

        // thêm nhân viên
        NhanVien newdanhSachnhanvien[] = new NhanVien[n+1];
        for(int i=0; i<n;i++){
            newdanhSachnhanvien[i] = danhSachnhanvien[i];
        }
        System.out.println("Nhập nhân viên thêm ");
        System.out.print("Nhập tên nhân viên: ");   
            String tenNhanVien = scanner.nextLine();

            System.out.print("Nhập lương: ");            
            double luong  = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Nhập địa chỉ: ");            
            String diaChi  = scanner.nextLine();

            System.out.print("Nhập bộ phận làm việc: ");            
            String boPhanLamViec = scanner.nextLine();

            System.out.print("Nhập ngày sinh: ");            
            String ngaySinh = scanner.nextLine();
        newdanhSachnhanvien[n] = new NhanVien(tenNhanVien, luong, diaChi, boPhanLamViec, ngaySinh);


        System.out.println("In danh sách sau khi thêm ");
        int h=0;
        for(NhanVien x : newdanhSachnhanvien){
            System.out.println("Thông tin nhân viên thứ " + (h+1));
            
            x.inThongTinNhanVien();
            h+=1;
        }

        //Xóa nhân viên
        System.out.println("Nhập nhân viên muốn xóa");
        int xoa = scanner.nextInt();
        NhanVien danhSachxoa[] = new NhanVien[n];
        int dem=0;
        for (int i=0; i<= n; i++){
            if(i==(xoa-1)){
                continue;
            }
            danhSachxoa[dem]= newdanhSachnhanvien[i];
            dem++;
        }
        System.out.println("danh sách nhân viên sau khi xóa");
        int tam = 0;
        for(int i=0; i<n; i++){
            if(tam == (xoa-1))
            tam+=1;
            System.out.println("Nhân viên " + (tam + 1));
            danhSachxoa[i].inThongTinNhanVien();
            tam++;
        }
    }
}
