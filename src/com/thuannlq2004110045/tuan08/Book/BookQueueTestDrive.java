package com.thuannlq2004110045.tuan08.Book;

import java.util.Scanner;

public class BookQueueTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Khởi tạo danh sách đầu tiên");
        System.out.print("Nhập số lượng book: ");
        int n = scanner.nextInt();
        HamBook listStudent = new HamBook(n);
        listStudent.nhapBook();
        int luaChon;
        do {
            System.out.println("======================Menu======================");
            System.out.println("  1.Nhập thêm 1 book vào cuối danh sách.       =");
            System.out.println("  2.In danh sách book                          =");
            System.out.println("  3.Lấy 1 book ở đầu danh sách                 =");
            System.out.println("  4.Xoá book ở đầu danh sách                   =");
            System.out.println("  5.Kết thúc                                   =");
            System.out.println("================================================");
            System.out.print("Lựa chọn:");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    listStudent.themVaoCuoi();
                    break;
                case 2:
                    System.out.println("========================Danh sách Book========================");
                    listStudent.print();
                    break;
                case 3:
                    listStudent.getdauDS();
                    break;
                case 4:
                    listStudent.removedauDS();
                case 5: 
                    System.exit(0);
            }

        } while (luaChon != 5);
    }
}
