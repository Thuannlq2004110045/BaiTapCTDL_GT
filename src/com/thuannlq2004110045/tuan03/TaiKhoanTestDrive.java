package com.thuannlq2004110045.tuan03;

public class TaiKhoanTestDrive {
    public static void main(String[] args) {
        TaiKhoan taiKhoan = new TaiKhoan("Nguyễn Văn C","123456789",999999999);
        System.out.println("Tên chủ tài khoản: " + taiKhoan.tenChuTaiKhoan);
        System.out.println("Số tài khoản: " + taiKhoan.soTaiKhoan);
        System.out.println("Số dư trong tài khoản: " + taiKhoan.soDuTaiKhoan);
    }
}
