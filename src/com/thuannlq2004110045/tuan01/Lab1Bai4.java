package com.thuannlq2004110045.tuan01;

import java.util.Scanner;

public class Lab1Bai4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        double Delta = Math.pow(b,2)-4*a*c;
        double CanDelta = Math.sqrt(Delta);
        System.out.println("Delta : " + Delta);
        System.out.println("Căn bậc 2 của Delta : " + CanDelta);
    }
}
