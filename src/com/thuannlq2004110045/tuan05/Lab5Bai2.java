package com.thuannlq2004110045.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab5Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        int luaChon;
        do{
        System.out.println("=====================MENU====================");
        System.out.println("=  1.Nhập danh sách họ tên.                 =");
        System.out.println("=  2.Xuất danh sách họ tên.                 =");
        System.out.println("=  3.Xuất danh sách ngẫu nhiên.             =");
        System.out.println("=  4.Sắp xếp giảm dần và xuất danh sách.    =");
        System.out.println("=  5.Tìm và xóa họ tên nhập từ bàn phím.    =");
        System.out.println("=  6.Kết thúc.                              =");
        System.out.println("=====================MENU====================");
        System.out.print("Nhập lựa chọn của bạn: ");
        luaChon = scanner.nextInt();
        scanner.nextLine();

        switch(luaChon){
        case 1: //nhập họ tên
        while(true){
            System.out.println("Nhập họ tên: ");
            String x = scanner.nextLine();
            list.add(x);

            System.out.print("Nhập thêm (Y/N)? ");
            if(scanner.nextLine().equals("N")){
                break;
            }
        }
        break;

        case 2:
        //in danh sách họ tên
        System.out.println("in danh sách họ tên ");
        for (String x : list){

            System.out.println(x);
        }

        break;

        case 3: //Sắp xếp họ tên ngẫu nhiên
        Collections.shuffle(list);
        //in danh sách họ tên
        System.out.println("in danh sách họ tên ngẫu nhiên");
        for (String x : list){
            System.out.println(x);
        }
        break;

        case 4: //in danh sách họ tên giảm dần
        System.out.println("in danh sách họ tên giảm dần");
        Collections.sort(list);
        Collections.reverse(list);
        for (String x : list){
            System.out.println(x);
        }
        break;

        case 5:// tìm và xóa họ tên
        System.out.print("Nhập họ tên cần xóa: ");
        String y = scanner.nextLine();
        for (String x : list){
            if (y.equalsIgnoreCase(x) == true){
            list.remove(x);
        }
    }

        System.out.println("Danh sách sau khi xóa: ");
        for (String x : list){

            System.out.println(x);
        }
        break;

        case 6://kết thúc
        break;

        default:
        System.out.println("Sai chức năng, vui lòng chọn lại! ");
        break;
    }
} while(true);
    }
}
    

