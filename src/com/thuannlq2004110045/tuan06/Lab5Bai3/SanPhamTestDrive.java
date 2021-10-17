package com.thuannlq2004110045.tuan06.Lab5Bai3;

import java.util.Scanner;

public class SanPhamTestDrive {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhập số sản phẩm cần lưu trữ");
    int m = scanner.nextInt();
    SanPham[] danhSachsanpham = new SanPham[m];
        int luaChon;
        do{
        System.out.println("=============================MENU==========================");
        System.out.println("=  1.Nhập danh sách sản phẩm.                             =");
        System.out.println("=  2.Sắp xếp giảm dần theo gia và xuất ra màn hình.       =");
        System.out.println("=  3.Tìm và xóa sản phẩm.                                 =");
        System.out.println("=  4.Xuất giá trung bình.                                 =");
        System.out.println("=  5.Thêm sản phẩm.                                       =");
        System.out.println("=  6.Thoát chương trình.                                  =");
        System.out.println("=============================MENU==========================");
        System.out.print("Nhập lựa chọn của bạn: ");
        luaChon = scanner.nextInt();
        scanner.nextLine();

        switch(luaChon){
        case 1:
        nhapDSSanPham(scanner,danhSachsanpham);
        break;

        case 2:
        System.out.println("Danh sách ban đầu: ");
        inDSSanPham(danhSachsanpham);
        sapXepTangDanTheoGia(danhSachsanpham, m);
        System.out.println("Danh sách sau khi giảm dần theo giá: ");
        inDSSanPham(danhSachsanpham);
        break;

        case 3:
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String xoa = scanner.nextLine();
        timSanPhamVaXoa(scanner,xoa, danhSachsanpham, m);
        case 4:
        giaTrungBinh(danhSachsanpham);
        break;
        case 5:
        themSanPham(scanner, m, danhSachsanpham);
        break;

        case 6: 
        System.exit(0);
    }
}while(true);
    }

    static void nhapDSSanPham(Scanner scanner, SanPham[] danhSachsanpham) {
        System.out.println("Nhập vào danh sách sản phẩm");
        for(int i=0; i<danhSachsanpham.length;i++){
            System.out.println("Nhập sản phẩm thứ " +(i+1));
            System.out.print("Nhập tên sản phẩm: ");
            String tenSanPham = scanner.nextLine();

            System.out.print("Nhập đơn giá: ");
            Double donGia = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Giảm giá: ");
            Double giamGia = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Thuế nhập khẩu: ");
            Double thueNhapKhau = scanner.nextDouble();
            scanner.nextLine();

            danhSachsanpham[i] = new SanPham(tenSanPham,donGia,giamGia,thueNhapKhau);
        }
    }

    static void inDSSanPham(SanPham danhSachsanpham[]){
        int k=0;
        for(SanPham sanpham : danhSachsanpham){
            System.out.println("Thông tin sản phẩm thứ " +(k+1));

            sanpham.inThongTinSanPham();
            k+=1;
        }
    }

    static void sapXepTangDanTheoGia(SanPham danhSachsanpham[],int m){// danh sách
        for(int i=0; i<m-1; i++)
        for(int j=i+1; j<m; j++)
        if (danhSachsanpham[i].donGia<danhSachsanpham[j].donGia){
            String tam;
            tam = danhSachsanpham[i].tenSanPham;
            danhSachsanpham[i].tenSanPham = danhSachsanpham[j].tenSanPham;
            danhSachsanpham[j].tenSanPham=tam;
            Double tam1;
            tam1 = danhSachsanpham[i].donGia;
            danhSachsanpham[i].donGia = danhSachsanpham[j].donGia;
            danhSachsanpham[j].donGia=tam1;
        }
    }

    static int timSanPhamVaXoa(Scanner scanner, String xoa,SanPham danhSachsanpham[],int m){
        int viTri = 0;
        int dem = 0;
        SanPham xoaSanPham[] = new SanPham[m - 1];
        scanner.nextLine();
            for (int i = 0; i < m; i++) {
                if (xoa.equals(danhSachsanpham[i].tenSanPham) == true) {
                    viTri = i;
                }
            }
            for (int i = 0; i < m; i++) {
                if (i == viTri) {
                    continue;
                }
                xoaSanPham[dem] = danhSachsanpham[i];
                dem++;
        }
        System.out.println("============Danh sách sản phẩm sau khi xóa==========");
                    for (int i = 0; i < m - 1; i++) {
                        xoaSanPham[i].inThongTinSanPham();
        }

        return dem;
    }

    static void giaTrungBinh(SanPham danhSachsanpham[]){
        int s = 0;
        for (int i = 0; i < danhSachsanpham.length; i++) {
        s += danhSachsanpham[i].donGia;
        }
        int giaTB = s / danhSachsanpham.length;
        System.out.println("Giá trung bình của các sản phẩm là:" + giaTB);
    }

    static void themSanPham(Scanner scanner, int m, SanPham danhSachsanpham[]){
        SanPham[] themSanPham = new SanPham[m + 1];
        System.out.print("Nhập vị trí muốn thêm vào mảng ban đầu: ");
        int viTriThem = scanner.nextInt();
        scanner.nextLine();
        int dem = 0;
        if(viTriThem == danhSachsanpham.length){
        for(int i =0;i<m;i++){
        themSanPham[dem] = danhSachsanpham[i];
        }
        System.out.print("Nhập tên sản phẩm:");
        String tenSanPham = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm:");
        Double donGia = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Giảm giá: ");
        Double giamGia = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Thuế nhập khẩu: ");
        Double thueNhapKhau = scanner.nextDouble();
        scanner.nextLine();
        themSanPham[viTriThem] = new SanPham(tenSanPham,donGia,giamGia,thueNhapKhau);
        }
        for (int i = 0; i < danhSachsanpham.length; i++) {
        if (i == viTriThem) {
        System.out.print("Nhập tên sản phẩm:");
        String tenSanPham = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm:");
        Double donGia = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Giảm giá: ");
        Double giamGia = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Thuế nhập khẩu: ");
        Double thueNhapKhau = scanner.nextDouble();
        scanner.nextLine();
        themSanPham[viTriThem] = new SanPham(tenSanPham, donGia,giamGia,thueNhapKhau);
        dem++;
        }
        themSanPham[dem] = danhSachsanpham[i];
        dem++;
        }
        System.out.println("============Danh sách sản phẩm sau khi thêm==========");
        for (int i = 0; i < themSanPham.length; i++) {
            themSanPham[i].inThongTinSanPham();
        }
    }
}
