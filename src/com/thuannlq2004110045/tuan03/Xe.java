package com.thuannlq2004110045.tuan03;

public class Xe {
    String tenChuXe;
    String hangSanXuat;
    String dong;
    String giayPhep;
    String dungTichXang;

    Xe(){

    }

    Xe(String teCX, String haSX, String dg){
        tenChuXe = teCX;
        hangSanXuat = haSX;
        dong = dg;
    }

    Xe(String gP, String dTX){
        giayPhep = gP;
        dungTichXang = dTX;
    }
}
