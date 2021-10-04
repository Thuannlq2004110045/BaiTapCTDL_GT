package com.thuannlq2004110045.tuan04;

import java.util.Scanner;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số máy tính cần lưu trữ");
        int m = scanner.nextInt();
        scanner.nextLine();
        MayTinh[] danhSachmaytinh = new MayTinh[m];
        int n = danhSachmaytinh.length;
        System.out.println("Nhập vào danh sách máy tính");
        
        for(int i=0; i<danhSachmaytinh.length;i++){
            System.out.println("Nhập máy tính thứ " +(i+1));
            System.out.print("Nhập nhà sản xuất: ");
            String nhaSanXuat = scanner.nextLine();

            System.out.print("Nhập năm sản xuất: ");
            String namSanXuat = scanner.nextLine();

            System.out.print("Nhập hệ điều hành: ");
            String heDieuHanh = scanner.nextLine();

            System.out.print("Nhập ram: ");
            String ram = scanner.nextLine();

            System.out.print("Nhập cpu: ");
            String cpu = scanner.nextLine();

            System.out.print("Nhập giá: ");
            double gia = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Nhập năm bảo hành: ");
            String namBaoHanh = scanner.nextLine();

            danhSachmaytinh[i] = new MayTinh(nhaSanXuat, namSanXuat, heDieuHanh, ram, cpu, gia, namBaoHanh);
        }

        System.out.println("Danh sách máy tính sau khi nhập");
        int k=0;
        for(MayTinh maytinh : danhSachmaytinh){
            System.out.println("Thông tin máy tính thứ " +(k+1));

            maytinh.inThongTinMayTinh();
            k+=1;
        }
// thêm xe
        MayTinh newdanhSachmaytinh[] = new MayTinh[n+1];
        for(int i=0; i<n;i++){
            newdanhSachmaytinh[i]= danhSachmaytinh[i];
        }
        System.out.println("Nhập máy tính muốn thêm ");
        System.out.print("Nhập nhà sản xuất: ");
            String nhaSanXuat = scanner.nextLine();

            System.out.print("Nhập năm sản xuất: ");
            String namSanXuat = scanner.nextLine();

            System.out.print("Nhập hệ điều hành: ");
            String heDieuHanh = scanner.nextLine();

            System.out.print("Nhập ram: ");
            String ram = scanner.nextLine();

            System.out.print("Nhập cpu: ");
            String cpu = scanner.nextLine();

            System.out.print("Nhập giá: ");
            double gia = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Nhập năm bảo hành: ");
            String namBaoHanh = scanner.nextLine();

        newdanhSachmaytinh[n] = new MayTinh(nhaSanXuat, namSanXuat, heDieuHanh, ram, cpu, gia, namBaoHanh);


        System.out.println("In danh sách sau khi thêm ");
        int h=0;
        for(MayTinh x : newdanhSachmaytinh){
            System.out.println("Thông tin máy tính thứ " + (h+1));
            
            x.inThongTinMayTinh();
            h+=1;
        }

        //Xóa máy tính
        System.out.println("Nhập máy tính muốn xóa");
        int xoa = scanner.nextInt();
        MayTinh danhSachxoa[] = new MayTinh[n];
        int dem=0;
        for (int i=0; i<= n; i++){
            if(i==(xoa-1)){
                continue;
            }
            danhSachxoa[dem]= newdanhSachmaytinh[i];
            dem++;
        }
        System.out.println("danh sách máy tính sau khi xóa");
        int tam = 0;
        for(int i=0; i<n; i++){
            if(tam == (xoa-1))
            tam+=1;
            System.out.println("Máy tính " + (tam + 1));
            danhSachxoa[i].inThongTinMayTinh();
            tam++;
        }

    }
}
