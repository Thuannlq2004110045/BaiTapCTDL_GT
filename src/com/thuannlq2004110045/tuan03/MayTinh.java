package com.thuannlq2004110045.tuan03;

public class MayTinh {
    String nhaSanXuat;
    String namSanXuat;
    String heDieuHanh;
    String ram;
    String cpu;
    double gia;
    String namBaoHanh;

    MayTinh(){

    }

    MayTinh(String nSX, String naSX, String hDH){
        nhaSanXuat = nSX;
        namSanXuat = naSX;
        heDieuHanh = hDH;
    }

    MayTinh(String r, String cp, double g, String nBH){
        ram = r;
        cpu = cp;
        gia = g;
        namBaoHanh = nBH;
    }
}
