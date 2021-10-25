package com.thuannlq2004110045.kiemtragiuaky;

import java.util.ArrayList;
import java.util.Scanner;

public class AppleArrayListTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Apple> list = new ArrayList<Apple>();
        System.out.println("khởi tạo danh sách táo ");
        System.out.print("Nhập số lượng táo: ");
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
        System.out.println("nhập thông tin táo thứ "+(i+1));
        System.out.println("Nhập mã táo: ");
        int maTao = scanner.nextInt();
        System.out.println("Nhập khối lượng: ");
        Double khoiLuong = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập màu sắc: ");
        String mauSac= scanner.nextLine();
        Apple apple = new Apple(maTao, khoiLuong, mauSac);
        list.add(apple);
        }
        int luaChon;
        do{
        System.out.println("=============================MENU==========================");
        System.out.println("=  1.Thêm danh sách táo.                                  =");
        System.out.println("=  2.Tìm táo theo tên.                                    =");
        System.out.println("=  3.Xuất danh sách táo.                                  =");
        System.out.println("=  4.Kết thúc.                                            =");
        System.out.println("=============================MENU==========================");
        System.out.print("Nhập lựa chọn của bạn: ");
        luaChon = scanner.nextInt();
        scanner.nextLine();

        switch(luaChon){
        case 1:

        while(true){
            System.out.println("Nhập mã táo: ");
            int maTao = scanner.nextInt();
            System.out.println("Nhập khối lượng: ");
            Double khoiLuong = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Nhập màu sắc: ");
            String mauSac= scanner.nextLine();

            Apple apple = new Apple(maTao,khoiLuong,mauSac);
            list.add(apple);
            System.out.print("Nhập thêm (Y/N)? ");
            if(scanner.nextLine().equals("N")){
                break;
            }
        }
        break;

        case 2: 
            System.out.println("Nhập màu sắc của táo cần tìm: ");
            String y = scanner.nextLine();
            for (Apple apple : list){
            if (y.equalsIgnoreCase(apple.mauSac) == true)
            apple.inThongTinTao();
        }
        break;

        case 3:
        System.out.println("in danh sách táo: ");
        for (Apple apple : list){

            apple.inThongTinTao();
        }
        break;
}
    }while(true);
}
}
