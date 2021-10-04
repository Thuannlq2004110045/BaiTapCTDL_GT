package com.thuannlq2004110045.tuan04;

public class MayTinh {
    String nhaSanXuat;
    String namSanXuat;
    String heDieuHanh;
    String ram;
    String cpu;
    double gia;
    String namBaoHanh;

    MayTinh(){};

    MayTinh(String nSX, String naSX, String hDH, String r, String cp, double g, String nBH){
        nhaSanXuat = nSX;
        namSanXuat = naSX;
        heDieuHanh = hDH;
        ram = r;
        cpu = cp;
        gia = g;
        namBaoHanh = nBH;
    }

    void inThongTinMayTinh(){
        System.out.println("Nhà sản xuất: " + nhaSanXuat);
        System.out.println("Năm sản xuất: " + namSanXuat);
        System.out.println("Hệ điều hành: " + heDieuHanh);
        System.out.println("Ram: " + ram);
        System.out.println("CPU: " + cpu);
        System.out.println("Giá: " + gia);
        System.out.println("Năm bảo hành: " + namBaoHanh);
    }
}
