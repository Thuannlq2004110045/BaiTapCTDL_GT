package com.thuannlq2004110045.tuan09;

import java.util.Scanner;

public class AppleTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Khởi tạo danh sách đầu tiên");
        System.out.print("Nhập số lượng táo có sẵn: ");
        int n = scanner.nextInt();
        HamApple listTao = new HamApple(n);
        listTao.nhapApple();
        int luaChon;
        do {
            System.out.println("===================Menu===================");
            System.out.println("   1.Nhập thêm táo vào danh sách.        =");
            System.out.println("   2.In danh sách táo.                   =");
            System.out.println("   3.Sắp xếp táo tăng dần.               =");
            System.out.println("   4.Sắp xếp táo giảm dần.               =");
            System.out.println("   5.Tìm táo theo mã                     =");
            System.out.println("   6.Tìm táo theo màu                     =");
            System.out.println("   7.Tìm táo theo khoảng khối lượng      =");
            System.out.println("   8.Kết thúc                            =");
            System.out.println("==========================================");
            System.out.print("Lựa chọn:");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            switch (luaChon) {
                case 1:
                    listTao.nhapApple();
                case 2:
                    listTao.print();
                    break;
                case 3: 
                    listTao.selectionSort_tangdan();
                    break;
                case 4:
                    listTao.bubbleSort_giamdan();
                    break;
                case 5:
                    System.out.print("Nhập mã apple cần tìm: ");
                    int tim = scanner.nextInt();
                    scanner.nextLine();
                    boolean u = listTao.search(tim);
                    if (u == true){
                    System.out.println("Đã tìm thấy ");
                    }
                    else{
                        System.out.println("không tìm thấy");
                    }
                    break;
                case 6:
                    System.out.print("Nhập màu táo cần tìm: ");
                    String timMau = scanner.nextLine();
                    listTao.findvsMau(timMau); 
                    break;
                case 7:
                    listTao.findvsCanNang();
                    break;
                case 8: System.exit(0);
                }
    
            } while (luaChon != 8);
        }
}
