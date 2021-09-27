package com.thuannlq2004110045.tuan03;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh mayTinh = new MayTinh("MSI","2021","Windows 10 Home");
        System.out.println("Nhà sản xuất: " + mayTinh.nhaSanXuat);
        System.out.println("Năm sản xuất: " + mayTinh.namSanXuat);
        System.out.println("Hệ điều hành: " + mayTinh.heDieuHanh);
        
        mayTinh = new MayTinh("8GB (8GB x 1) DDR4 3200MHz (2 khe, tối đa 64GB)","Intel Core i7-11800H",27290000,"1 năm");
        System.out.println("Ram: " + mayTinh.ram);
        System.out.println("CPU: " + mayTinh.cpu);
        System.out.println("Giá: " + mayTinh.gia);
        System.out.println("Năm bảo hành: " + mayTinh.namBaoHanh);
    }
}
