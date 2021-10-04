package com.thuannlq2004110045.tuan04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SachTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số sách cần lưu trữ");
        int m = scanner.nextInt();
        Sach[] danhSachsach = new Sach[m];
        int n = danhSachsach.length;
        System.out.println("Nhập vào danh sách sách");
        
        for(int i=0; i<danhSachsach.length;i++){
            System.out.println("Nhập sách thứ " +(i+1));
            System.out.print("Nhập giá: ");
            double gia = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Nhập nhà xuất bản: ");
            String nhaXuatBan = scanner.nextLine();

            System.out.print("Nhập năm xuất bản: ");
            String namXuatBan = scanner.nextLine();

            System.out.print("Nhập giá bán: ");
            double giaBan = scanner.nextDouble();

            System.out.print("Nhập số lượng: ");
            int soLuong = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nhập loại sách: ");
            String loai = scanner.nextLine();
            danhSachsach[i] = new Sach(gia, nhaXuatBan, namXuatBan, giaBan, soLuong, loai);
        }

        System.out.println("Danh sách sách sau khi nhập");
        int k=0;
        for(Sach sach : danhSachsach){
            System.out.println("Thông tin sách thứ " +(k+1));

            sach.inThongTinSach();
            k+=1;
        }
// thêm sách
        Sach newdanhSachsach[] = new Sach[n+1];
        for(int i=0; i<n;i++){
            newdanhSachsach[i]= danhSachsach[i];
        }
        System.out.println("Nhập sách muốn thêm ");
        System.out.print("Nhập giá: ");
        double gia = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nhập nhà xuất bản: ");
        String nhaXuatBan = scanner.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        String namXuatBan = scanner.nextLine();

        System.out.print("Nhập giá bán: ");
        double giaBan = scanner.nextDouble();

        System.out.print("Nhập số lượng: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập loại sách: ");
        String loai = scanner.nextLine();
        newdanhSachsach[n] = new Sach(gia, nhaXuatBan, namXuatBan, giaBan, soLuong, loai);


        System.out.println("In danh sách sau khi thêm ");
        int h=0;
        for(Sach x : newdanhSachsach){
            System.out.println("Thông tin sách thứ " + (h+1));
            
            x.inThongTinSach();
            h+=1;
        }

        //Xóa sách
        System.out.println("Nhập sách muốn xóa");
        int xoa = scanner.nextInt();
        Sach danhSachxoa[] = new Sach[n];
        int dem=0;
        for (int i=0; i<= n; i++){
            if(i==(xoa-1)){
                continue;
            }
            danhSachxoa[dem]= newdanhSachsach[i];
            dem++;
        }
        System.out.println("danh sách sách sau khi xóa");
        int tam = 0;
        for(int i=0; i<n; i++){
            if(tam == (xoa-1))
            tam+=1;
            System.out.println("Sách " + (tam + 1));
            danhSachxoa[i].inThongTinSach();
            tam++;
        }
    }
}
