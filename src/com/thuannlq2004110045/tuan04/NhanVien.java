package com.thuannlq2004110045.tuan04;

public class NhanVien {
    String tenNhanVien;
    double luong;
    String diaChi;
    String boPhanLamViec;
    String ngaySinh;

    NhanVien(){};

    NhanVien(String teNV, double lg, String dC, String bPLV, String nS){
        tenNhanVien = teNV;
        luong = lg;
        diaChi = dC;
        boPhanLamViec = bPLV;
        ngaySinh = nS;
    }

    void inThongTinNhanVien(){
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("lương: " + luong);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Bộ phận làm việc: " + boPhanLamViec);
        System.out.println("Ngày sinh: " + ngaySinh);
    }
}
