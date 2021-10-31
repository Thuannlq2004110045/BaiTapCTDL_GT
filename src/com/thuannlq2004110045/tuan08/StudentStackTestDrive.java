package com.thuannlq2004110045.tuan08;

import java.util.Scanner;

public class StudentStackTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Khởi tạo danh sách đầu tiên");
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        HamStudent listStudent = new HamStudent(n);
        listStudent.nhapStudent();
        int luaChon;
        do {
            System.out.println("======================Menu======================");
            System.out.println("  1.Nhập thêm 1 sinh viên vào cuối danh sách.  =");
            System.out.println("  2.In danh sách sinh viên                     =");
            System.out.println("  3.Lấy 1 sinh viên ở cuối danh sách           =");
            System.out.println("  4.Xoá sinh viên cuối danh sách               =");
            System.out.println("  5.Kết thúc                                   =");
            System.out.println("================================================");
            System.out.print("Lựa chọn:");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    listStudent.themVaoCuoi();
                    break;
                case 2:
                    System.out.println("========================Danh sách Student========================");
                    listStudent.print();
                    break;
                case 3:
                    listStudent.getcuoiDS();
                    break;
                case 4:
                    listStudent.removecuoiDS();
                case 5: 
                    System.exit(0);
            }

        } while (luaChon != 5);
    }
}
