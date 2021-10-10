package com.thuannlq2004110045.tuan05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            ArrayList<Double> list = new ArrayList<Double>();
            while(true){
                System.out.println("Nhập số thực: ");
                Double x = scanner.nextDouble();
                scanner.nextLine();
                list.add(x);
    
                System.out.print("Nhập thêm (Y/N)? ");
                if(scanner.nextLine().equals("N")){
                    break;
                }
            }
    
            //in danh sách số thực
            System.out.println("in danh sách số thực");
            for (Double x : list){
    
                System.out.println(x);
            }
        }
}
