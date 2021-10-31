package com.thuannlq2004110045.tuan08;

public class Student {
    public int maSV;
    public String queQuan;
    public String hoTen;
    public String ngaySinh;
    public float diem;
    public int soSV;

    public Student(int mSV,String qQ, String hT, String nS,float d){
        maSV = mSV;
        queQuan = qQ;
        hoTen = hT;
        ngaySinh = nS;
        diem = d;

    }
    public Student(int n){
        soSV = n;
    }
    void inThongTinStudent(){
        System.out.println("=====================================");
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Quê quán: " + queQuan);
        System.out.println("Tên sinh viên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm: " + diem);
        System.out.println("=====================================");
    }
}
