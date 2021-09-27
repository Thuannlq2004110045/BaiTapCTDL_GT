package com.thuannlq2004110045.tuan03;

public class NhanVien {
    String tenNhanVien;
    int luong;
    String diaChi;
    String boPhanLamViec;
    String ngaySinh;

    NhanVien(){

    }

    NhanVien(String teNV, int lg){
        tenNhanVien = teNV;
        luong = lg;
    }

    NhanVien(String dC, String bPLV, String nS){
        diaChi = dC;
        boPhanLamViec = bPLV;
        ngaySinh = nS;
    }
}
