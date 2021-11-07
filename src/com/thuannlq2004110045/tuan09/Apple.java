package com.thuannlq2004110045.tuan09;

public class Apple {
    public int maTao;
    public Double khoiLuong;
    public String mauSac;
    public int soTao;

    public Apple(){};

    public Apple(int mT, Double kL, String mS){
        maTao = mT;
        khoiLuong = kL;
        mauSac = mS;
    }

    public Apple(int n){
        soTao = n;
    }

    void inThongTinTao(){
        System.out.println("=====================================");
        System.out.println("Mã táo: " + maTao);
        System.out.println("Khối lượng: " + khoiLuong);
        System.out.println("Màu sắc: " + mauSac);
        System.out.println("=====================================");
    }
}
