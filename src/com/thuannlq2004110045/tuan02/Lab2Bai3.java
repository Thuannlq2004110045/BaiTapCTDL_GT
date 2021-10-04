package com.thuannlq2004110045.tuan02;

import java.util.Scanner;

public class Lab2Bai3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số điện sử dụng của tháng: ");
        int soDien = scanner.nextInt();
        if(0<soDien && soDien<50){
            int tien = soDien*1000;
            System.out.println("Tiền điện tháng này là: " + tien);
        }
        else{
            int tienDien = 50*1000 + (soDien -50)*1200;
            System.out.println("Tiền điện tháng này là: " + tienDien); 
        }
    }
}
