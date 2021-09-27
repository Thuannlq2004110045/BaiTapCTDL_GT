package com.thuannlq2004110045.tuan03;

public class SachTestDrive {
    public static void main(String[] args){
        Sach sach = new Sach(100000,"Kim ĐỒng","1945");
        System.out.println("Giá: " + sach.gia);
        System.out.println("Nhà Xuất Bản: " + sach.nhaXuatBan);
        System.out.println("Năm xuất bản: " + sach.namXuatBan);

        sach = new Sach(120000,50,"Trinh thám");
        System.out.println("Giá bán: " + sach.giaBan);
        System.out.println("Số lượng: " + sach.soLuong);
        System.out.println("Loại: " + sach.loai);
        
    }
}
