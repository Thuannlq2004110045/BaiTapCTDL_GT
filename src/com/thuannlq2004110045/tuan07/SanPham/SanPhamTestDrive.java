package com.thuannlq2004110045.tuan07.SanPham;

import java.util.Scanner;

public class SanPhamTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Khởi tạo danh sách đầu tiên");
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = scanner.nextInt();
        HamSanPham listSanPham = new HamSanPham(n);
        listSanPham.nhapDSSP();
        int luaChon;
        int luaChon1;
        do {
            System.out.println("===================Menu===================");
            System.out.println("   1.Nhập thêm sản phẩm vào danh sách.   =");
            System.out.println("   2.Xuất danh sách sản phẩm             =");
            System.out.println("   3.Tìm sản phẩm theo tên               =");
            System.out.println("   4.Sửa thông tin sản phẩm              =");
            System.out.println("   5.Xóa sản phẩm theo tên               =");
            System.out.println("   6.Kết thúc                            =");
            System.out.println("==========================================");
            System.out.print("Lựa chọn:");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.print("Nhập số lượng sản phẩm: ");
                    n = scanner.nextInt();
                    listSanPham = new HamSanPham(n);
                    listSanPham.nhapDSSP();
                    break;
                case 2:
                    System.out.println("========================Danh sách Sản Phẩm========================");
                    listSanPham.print();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm cần tìm : ");
                    String tim = scanner.nextLine();
                    listSanPham.find(tim);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm cần Sửa : ");
                    String sua = scanner.nextLine();
                        listSanPham.sua(sua);
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm cần xóa : ");
                    String delete = scanner.nextLine();
                    listSanPham.removegiuaDS(delete);
                    break;
                case 6:
                System.exit(0);
            }

        } while (luaChon != 6);
    }
}
