package com.thuannlq2004110045.tuan04;

public class TaiKhoan {
    String tenChuTaiKhoan;
    String soTaiKhoan;
    double soDuTaiKhoan;

    TaiKhoan(){};

    TaiKhoan(String teCTK,String sTK, double sdTK){
        tenChuTaiKhoan = teCTK;
        soTaiKhoan = sTK;
        soDuTaiKhoan = sdTK;
    }

    void inThongTinTaiKhoan(){
        System.out.println("Tên chủ tài khoản: " + tenChuTaiKhoan);
        System.out.println("Số tài khoản: " + soTaiKhoan);
        System.out.println("Số dư trong tài khoản: " + soDuTaiKhoan);
    }
}
