package com.thuannlq2004110045.tuan04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Lab3Bai5_SinhVienTestDrive {
    public static void main(String[] args) {
        //Tạo danh sách sinh viên

        SinhVien[] danhSachSinhVien = new SinhVien[2];
        //nhập danh sách sinh vien từ bàn phím
        Scanner bienNhap = new Scanner(System.in);
        
        System.out.println("Nhập vào danh sách sinh viên: ");

        for(int i=0; i< danhSachSinhVien.length; i++){
            System.out.println("Nhập sinh viên thứ: " + (i+1));
            System.out.print("Nhập MSSV: ");
            String mssv = bienNhap.nextLine();
            System.out.print("Tên sinh viên: ");
            String hoTen = bienNhap.nextLine();
            System.out.print("Tuổi: ");
            int tuoi = bienNhap.nextInt();
            bienNhap.nextLine();//nhận vào phím enter
            System.out.print("Nhập quê quán của sinh viên: ");
            String queQuan = bienNhap.nextLine();
            danhSachSinhVien[i] = new SinhVien(mssv, hoTen ,tuoi, queQuan);
        }

        //in danh sách sinh viên
        System.out.println("in danh sách sinh viên sau khi nhập");
        for (SinhVien sinhvien : danhSachSinhVien){

            sinhvien.inThongTinSinhVien();
        }

        List list = Arrays.asList(danhSachSinhVien);

        Comparator comparator = new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2){

                return Integer.compare(o1.tuoi, o2.tuoi);
            }

        };

        list.sort(comparator);   /* truyền vào đây đối số cần thiết để so sánh*/     

        //in danh sách sinh viên
        System.out.println("in danh sách sinh viên sau khi so sánh");
        for (SinhVien sinhvien : danhSachSinhVien){

            sinhvien.inThongTinSinhVien();
        }
}
}