package com.thuannlq2004110045.tuan08.Book;

public class Book {
    public double gia;
    public String nhaXuatBan;
    public String namXuatBan;
    public double giaBan;
    public int soLuong;
    public String loai;
    public int soBook;

    Book(double g, String nhXB, String naXB, double gb, int sL, String L){
        gia = g;
        nhaXuatBan = nhXB;
        namXuatBan = naXB;
        giaBan = gb;
        soLuong = sL;
        loai = L;
    }

    public Book(int n){
        soBook = n;
    }
    void inThongTinBook(){
        System.out.println("=====================================");
        System.out.println("Giá: " + gia);
        System.out.println("Nhà xuất bản: " + nhaXuatBan);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Loại: " + loai);
        System.out.println("=====================================");
    }
}
