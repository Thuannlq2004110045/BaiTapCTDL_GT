package com.thuannlq2004110045.kiemtragiuaky;

import java.util.Scanner;

public class AppleLinkedListTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Khởi tạo danh sách đầu tiên");
        System.out.print("Nhập số lượng táo có sẵn: ");
        int n = scanner.nextInt();
        HamApple listTao = new HamApple(n);
        listTao.nhap();
        int luaChon;
        do {
            System.out.println("===================Menu===================");
            System.out.println("   1.Nhập thêm táo vào đầu danh sách.    =");
            System.out.println("   2.Nhập thêm táo vào cuối danh sách.   =");
            System.out.println("   3.Tìm táo theo mã.                    =");
            System.out.println("   4.In danh sách táo.                   =");
            System.out.println("   6.Xóa 1 táo cuối danh sách            =");
            System.out.println("   7.Kết thúc                            =");
            System.out.println("==========================================");
            System.out.print("Lựa chọn:");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    listTao.adddauDS(data);
                    break;
                case 2:
                    System.out.print("Nhập số lượng táo: ");
                    n = scanner.nextInt();
                    listTao = new HamApple(n);
                    listTao.nhap();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Nhập mã táo cần tìm: ");
                    int tim = scanner.nextInt();
                    scanner.nextLine();
                    listTao.find(tim);
                    break;
                case 4:
                    System.out.println("========================Danh sách Apple========================");
                    listTao.print();
                    break;
                case 5:
                    listTao.removecuoiDS();
                    break;
                case 6: System.exit(0);
            }

        } while (luaChon != 6);
    }
    }
