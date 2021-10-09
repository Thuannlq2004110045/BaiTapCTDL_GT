package com.thuannlq2004110045.tuan02;

import java.util.Scanner;

public class Lab2Bai4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("+-------------------------------+");
        System.out.println("1.Giải phương trình bậc 1");
        System.out.println("2.Giải phương trình bậc 2");
        System.out.println("3.Tính tiền điện");
        System.out.println("4.Kết thúc");
        System.out.println("+-------------------------------+");
        System.out.println("Chọn chức năng: ");
        int luaChon = scanner.nextInt();
        switch(luaChon){
            case 1:
            System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        if(a==0){
            if(b==0){
                System.out.println("Phương trình có vô số nghiệm");
            }
        else{
            System.out.println("Phương trình vô nghiệm");
        }
        }
    else{
        double x = -b/a;
        System.out.println("Nghiệm x = " + x);
    }
    break;
            case 2:
            System.out.print("Nhập hệ số a: ");
        double e = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double f = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        if(e==0){
        if(f==0){
            if(c==0){
                System.out.println("Phương trình có vô số nghiệm");
            }
        else{
            System.out.println("Phương trình vô nghiệm");
        }
        }
    else{
        double x = -c/f;
        System.out.println("Nghiệm x = " + x);
    }
}
    else{
        double Delta = Math.pow(f,2)-4*e*c;
        if(Delta<0){
            System.out.println("Phương trình vô nghiệm");
        }
        else if(Delta == 0){
            double x = -f/(2*e);
            System.out.println("Phương trình có nghiệm kép x=" + x);
        }
        else{
            double X1 = (-f+Math.sqrt(Delta))/(2*e);
            double X2 = (-f-Math.sqrt(Delta))/(2*e);
            System.out.println("Phương trình có 2 nghiệm phân biệt X1 = " + X1 + "X2 = " +X2);
        }
    }
            break;
            case 3:
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
            break;
            case 4:
            System.exit(0);
        }
    }
}
