package com.thuannlq2004110045.tuan02;

import java.util.Scanner;

public class Lab2Bai2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        if(a==0){
        if(b==0){
            if(c==0){
                System.out.println("Phương trình có vô số nghiệm");
            }
        else{
            System.out.println("Phương trình vô nghiệm");
        }
        }
    else{
        double x = -c/b;
        System.out.println("Nghiệm x = " + x);
    }
}
    else{
        double Delta = Math.pow(b,2)-4*a*c;
        if(Delta<0){
            System.out.println("Phương trình vô nghiệm");
        }
        else if(Delta == 0){
            double x = -b/(2*a);
            System.out.println("Phương trình có nghiệm kép x=" + x);
        }
        else{
            double X1 = (-b+Math.sqrt(Delta))/(2*a);
            double X2 = (-b-Math.sqrt(Delta))/(2*a);
            System.out.println("Phương trình có 2 nghiệm phân biệt X1 = " + X1 + "X2 = " +X2);
        }
    }
}
}
