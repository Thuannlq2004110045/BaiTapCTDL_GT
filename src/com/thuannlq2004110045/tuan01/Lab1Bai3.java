package com.thuannlq2004110045.tuan01;

import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh khối lập phương: ");
        double Canh = scanner.nextDouble();
        double TheTich = Math.pow(Canh,3);
        System.out.println("Thể tích khối lập phương: " + TheTich);
    }
}
