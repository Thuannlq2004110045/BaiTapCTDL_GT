package com.thuannlq2004110045.tuan03;

public class XeTestDrive {
    public static void main(String[] args){
        Xe xe = new Xe("Nguyễn Văn B","Lamborghini","Lamborghini Huracan EVO 2020");
        System.out.println("Tên chủ xe: " + xe.tenChuXe);
        System.out.println("Hãng sản xuất: " + xe.hangSanXuat);
        System.out.println("Dòng xe: " + xe.dong);
        
        xe = new Xe("A1","6.948cc");
        System.out.println("Giấy phép xe: " + xe.giayPhep);
        System.out.println("Dung tích xăng: " + xe.dungTichXang);
    }
}
