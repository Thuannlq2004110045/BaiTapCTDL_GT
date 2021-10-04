package com.thuannlq2004110045.tuan04;

import java.util.Scanner;

public class Lab3Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên: ");
        int N = scanner.nextInt();
        boolean ok = true;
        for(int i=2 ; i<N-1 ; i++){
            if(N%i==0){
                ok=false;
                break;
            }
            i++;
        }
        if(ok==true)
        System.out.println("Số đã nhập là số nguyên tố: ");
        else 
        System.out.println("Số đã nhập không phải là số nguyên tố");
    }
}
