package com.thuannlq2004110045.tuan01;

import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chiều dài: ");
        double CD = scanner.nextDouble();
        System.out.print("Chiều rộng: ");
        double CR = scanner.nextDouble();
        double Chuvi = (CD + CR)*2;
        double DienTich = CD*CR;
        double CanhNhoNhat = Math.min(CD,CR);
        System.out.println("Chu vi HCN: " + Chuvi);
        System.out.println("Diện tích HCN: " + DienTich);
        System.out.println("Cạnh nhỏ nhất của HCN: " + CanhNhoNhat);
    }
}
