package com.thuannlq2004110045.tuan05;

public class SVGD {
    public String tenSinhVien;

    public Double diemTrungBinh;


    public SVGD(){};

    public SVGD(String tSV, Double dTB){
        tenSinhVien = tSV;
        diemTrungBinh = dTB;
    }

    void inThongTinSVGD(){
        System.out.println("Tên sinh viên: " + tenSinhVien);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
    }
}
