package com.thuannlq2004110045.tuan02;

public class Sach {
    double gia;
    String nhaXuatBan;
    String namXuatBan;
    double giaBan;
    int soLuong;
    String loai;

    Sach(){

    }

    Sach(double g, String nhXB, String naXB){
        gia = g;
        nhaXuatBan = nhXB;
        namXuatBan = naXB;
    }

    Sach(double gb, int sL, String L){
        giaBan = gb;
        soLuong = sL;
        loai = L;
    }
}
