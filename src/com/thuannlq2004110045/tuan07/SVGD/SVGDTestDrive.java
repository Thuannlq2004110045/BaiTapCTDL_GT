package com.thuannlq2004110045.tuan07.SVGD;

import java.util.Scanner;


public class SVGDTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Khởi tạo danh sách đầu tiên");
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        HamSVGD listSinhVien = new HamSVGD(n);
        listSinhVien.nhapDSSV();
        int luaChon;
        do {
            System.out.println("===================Menu===================");
            System.out.println("   1.Nhập thêm sinh viên vào danh sách.  =");
            System.out.println("   2.Xuất danh sách sinh viên            =");
            System.out.println("   3.Tìm sinh viên theo tên              =");
            System.out.println("   4.Sửa thông tin sinh viên             =");
            System.out.println("   5.Xóa sinh viên theo tên              =");
            System.out.println("   6.Kết thúc                            =");
            System.out.println("==========================================");
            System.out.print("Lựa chọn:");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên: ");
                    n = scanner.nextInt();
                    listSinhVien = new HamSVGD(n);
                    listSinhVien.nhapDSSV();
                    break;
                case 2:
                    System.out.println("========================Danh sách SVGD========================");
                    listSinhVien.print();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Nhập tên sinh viên cần tìm : ");
                    String tim = scanner.nextLine();
                    listSinhVien.find(tim);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("Nhập tên sinh viên cần Sửa : ");
                    String sua = scanner.nextLine();
                    listSinhVien.sua(sua);
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.print("Nhập tên sinh viên cần xóa : ");
                    String delete = scanner.nextLine();
                    listSinhVien.removegiuaDS(delete);
                    break;
                case 6: System.exit(0);
            }

        } while (luaChon != 6);
    }
}
