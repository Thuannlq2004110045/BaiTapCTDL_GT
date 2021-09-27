package com.thuannlq2004110045.tuan03;

public class NhanVienTestDrive {
    public static void main(String[] args){
        NhanVien nhanVien = new NhanVien("Nguyễn Văn A",15000000);
        System.out.println("Tên nhân viên: " + nhanVien.tenNhanVien);
        System.out.println("Lương: " + nhanVien.luong);

        nhanVien = new NhanVien("50, Hoàng Văn Thụ, Phú Nhuận","Chủ tịch hội đồng","16/10/1975");
        System.out.println("Địa chỉ: " + nhanVien.diaChi);
        System.out.println("Bộ phận làm việc: " + nhanVien.boPhanLamViec);
        System.out.println("Ngày Sinh: " + nhanVien.ngaySinh);
    }
    
}
