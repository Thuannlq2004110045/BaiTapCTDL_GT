package com.thuannlq2004110045.tuan04;

public class SinhVien {
    String mssv;

    String hoTen;

    int tuoi;

    String queQuan;

    SinhVien(){};

    SinhVien(String ms, String h, int t, String q){
        hoTen = h;
        tuoi = t;
        mssv = ms;
        queQuan = q;
    }

    void inThongTinSinhVien(){
        System.out.println("MSSV: " + mssv + "\n" + "Họ Tên: " + hoTen + "\n" + "Tuổi: " + tuoi + "\n" + "Quê quán: "+ queQuan);
    }
}
