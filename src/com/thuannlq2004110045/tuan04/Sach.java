package com.thuannlq2004110045.tuan04;

public class Sach {
    double gia;
    String nhaXuatBan;
    String namXuatBan;
    double giaBan;
    int soLuong;
    String loai;

    Sach(){};

    Sach(double g, String nhXB, String naXB,double gb, int sL, String L){
        gia = g;
        nhaXuatBan = nhXB;
        namXuatBan = naXB;
        giaBan = gb;
        soLuong = sL;
        loai = L;
    }
    void inThongTinSach(){
        System.out.println("Giá: " + gia);
        System.out.println("Nhà xuất bản: " + nhaXuatBan);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Loại: " + loai);
    }
}
