package com.thuannlq2004110045.tuan05;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SVGD> list = new ArrayList<SVGD>();

        int luaChon;
        do{
        System.out.println("=============================MENU==========================");
        System.out.println("=  1.Nhập danh sách sinh viên.                            =");
        System.out.println("=  2.Xuất danh sách sinh viên.                            =");
        System.out.println("=  3.Xuất danh sách sinh viên theo khoảng điểm.           =");
        System.out.println("=  4.Tìm sinh viên theo họ tên.                           =");
        System.out.println("=  5.Tìm và sửa sinh viên theo họ tên.                    =");
        System.out.println("=  6.Tìm và xóa theo họ tên.                              =");
        System.out.println("=  7.Kết thúc              .                              =");
        System.out.println("=============================MENU==========================");
        System.out.print("Nhập lựa chọn của bạn: ");
        luaChon = scanner.nextInt();
        scanner.nextLine();

        switch(luaChon){
        case 1: //nhập danh sách sinh viên

        while(true){
            System.out.println("Nhập tên sinh viên: ");
            String tenSinhVien = scanner.nextLine();
            System.out.println("Nhập điểm trung bình: ");
            Double diemTrungBinh = scanner.nextDouble();
            scanner.nextLine();

            SVGD svgd = new SVGD(tenSinhVien, diemTrungBinh);
            list.add(svgd);
            System.out.print("Nhập thêm (Y/N)? ");
            if(scanner.nextLine().equals("N")){
                break;
            }
        }
        break;

        case 2:
        System.out.println("in danh sách sinh viên: ");
        for (SVGD svgd : list){

            svgd.inThongTinSVGD();
        }
        break;


        case 3:
        System.out.print("Nhập khoảng điểm muốn tìm kiếm: ");
        Double h = scanner.nextDouble();
        scanner.nextLine();
        for (SVGD svgd : list){
            if (svgd.diemTrungBinh<h)
            svgd.inThongTinSVGD();
        }
        break;

        case 4:
        System.out.println("Nhập họ tên sinh viên cần tìm: ");
        String y = scanner.nextLine();
        for (SVGD svgd : list){
            if (y.equalsIgnoreCase(svgd.tenSinhVien) == true)
            svgd.inThongTinSVGD();
        }
        break;

        case 5:
        System.out.println("Nhập họ tên sinh viên muốn chỉnh sửa: ");
        String j = scanner.nextLine();
        for (SVGD svgd : list){
            if (j.equalsIgnoreCase(svgd.tenSinhVien) == true){
            svgd.inThongTinSVGD();
            System.out.println("Nhập họ tên sinh viên mới: ");
            String newtenSinhVien = scanner.nextLine();
            svgd.tenSinhVien = newtenSinhVien;
            System.out.println("Nhập điểm mới: ");
            Double newdiemTrungBinh = scanner.nextDouble();
            svgd.diemTrungBinh = newdiemTrungBinh;
            }
        }

        System.out.println("Danh sách sau khi sửa: ");
        for (SVGD svgd : list){

            svgd.inThongTinSVGD();
        }

        break;

        case 6:
        System.out.print("Nhập họ tên sinh viên muốn xóa: ");
        String g = scanner.nextLine();
        for (SVGD svgd : list){
            if (g.equalsIgnoreCase(svgd.tenSinhVien) == true){
            list.remove(svgd);
        }
    }

        System.out.println("Danh sách sau khi xóa: ");
        for (SVGD svgd : list){

            svgd.inThongTinSVGD();
        }
        break;

        case 7:
        break;

        default:
        System.out.println("Sai chức năng, vui lòng chọn lại! ");
        break;
    }
}while(true);
    }
}
