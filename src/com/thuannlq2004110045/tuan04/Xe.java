package com.thuannlq2004110045.tuan04;

public class Xe {
    String tenChuXe;
    String hangSanXuat;
    String dong;
    String giayPhep;
    String dungTichXang;

    Xe(){};

    Xe(String teCX, String haSX, String dg, String gP, String dTX){
        tenChuXe = teCX;
        hangSanXuat = haSX;
        dong = dg;
        giayPhep = gP;
        dungTichXang = dTX;
    }

    void inThongTinXe(){
        System.out.println("Tên chủ xe: " + tenChuXe);
        System.out.println("Hãng sản xuất: " + hangSanXuat);
        System.out.println("dòng: " + dong);
        System.out.println("Giấy phép: " + giayPhep);
        System.out.println("Dung tích xăng: " + dungTichXang);
    }
}
