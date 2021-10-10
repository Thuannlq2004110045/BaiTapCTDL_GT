package com.thuannlq2004110045.tuan05.Lab5Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SanPhamTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        int luaChon;
        do{
        System.out.println("=============================MENU==========================");
        System.out.println("=  1.Nhập danh sách sản phẩm.                             =");
        System.out.println("=  2.Sắp xếp giảm dần theo gia và xuất ra màn hình.       =");
        System.out.println("=  3.Tìm và xóa sản phẩm.                                 =");
        System.out.println("=  4.Xuất giá trung bình.                                 =");
        System.out.println("=  5.Kết thúc.                                            =");
        System.out.println("=============================MENU==========================");
        System.out.print("Nhập lựa chọn của bạn: ");
        luaChon = scanner.nextInt();
        scanner.nextLine();

        switch(luaChon){
        case 1: //nhập tên sản phẩm

        while(true){
            System.out.println("Nhập tên sản phẩm: ");
            String tenSanPham = scanner.nextLine();
            System.out.println("Nhập đơn giá: ");
            Double donGia = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("giảm giá: ");
            Double giamGia = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Thuế nhập khẩu: ");
            Double thueNhapKhau = scanner.nextDouble();
            scanner.nextLine();

            SanPham sanpham = new SanPham(tenSanPham, donGia, giamGia, thueNhapKhau);

            list.add(sanpham);
            System.out.print("Nhập thêm (Y/N)? ");
            if(scanner.nextLine().equals("N")){
                break;
            }
        }
        break;

        case 2: //sắp xếp giá giảm dần
        Comparator<SanPham> comp = new Comparator<SanPham>()
        {
            @Override
            public int compare(SanPham o1, SanPham o2){
                return o2.donGia.compareTo(o1.donGia);
            }
        };

        Collections.sort(list, comp);
        System.out.println("in danh sách tên sản phẩm sau khi sắp xếp giảm dần giá: ");
        for (SanPham sanpham : list){

            sanpham.inThongTinSanPham();
        }
        break;

        case 3: //tìm và xóa sản phẩm
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String y = scanner.nextLine();
        for (SanPham sanpham : list){
            if (y.equalsIgnoreCase(sanpham.tenSanPham) == true){
            list.remove(sanpham);
        }
    }

        System.out.println("Danh sách sau khi xóa: ");
        for (SanPham sanpham : list){

            sanpham.inThongTinSanPham();
        }
        break;

        case 4: //giá trung bình
        int s =0;
        for (SanPham sanpham : list){
            s+= sanpham.donGia;
        }
        int gtb = s/ list.size();
        System.out.println("giá trung bình của sản phẩm: " + gtb);
        break;

        case 5: //kết thúc
        break;

        default:
        System.out.println("Sai chức năng, vui lòng chọn lại! ");
        break;
    }
    }while(true);
}
}
