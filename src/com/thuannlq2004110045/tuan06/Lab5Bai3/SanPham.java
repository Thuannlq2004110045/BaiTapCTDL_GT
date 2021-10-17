package com.thuannlq2004110045.tuan06.Lab5Bai3;

public class SanPham {
    public String tenSanPham;

    public Double donGia;

    public Double giamGia;

    public Double thueNhapKhau;


    public SanPham(){};

    public SanPham(String tSP, Double dG, Double gG, Double tNK){
        tenSanPham = tSP;
        donGia = dG;
        giamGia = gG;
        thueNhapKhau = tNK;
    }

    void inThongTinSanPham(){
        System.out.println("=======================================");
        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + thueNhapKhau);
    }
}
