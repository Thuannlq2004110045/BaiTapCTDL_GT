package com.thuannlq2004110045.tuan07.SVGD;

public class SVGD {
    public int maSV;
    public String queQuan;
    public String hoTen;
    public String ngaySinh;
    public float diem;
    public String hocLuc;
    public int soSV;

    public SVGD(int mSV,String qQ, String hT, String nS,float d,String hL){
        maSV = mSV;
        queQuan = qQ;
        hoTen = hT;
        ngaySinh = nS;
        diem = d;
        hocLuc = hL;

    }
    public SVGD(int n){
        soSV = n;
    }
    void inThongTinSVGD(){
        System.out.println("=====================================");
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Quê quán: " + queQuan);
        System.out.println("Tên sinh viên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Điểm: " + diem);
        System.out.println("Học lực: " + hocLuc);
        System.out.println("=====================================");
    }
}
