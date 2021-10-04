package com.thuannlq2004110045.tuan04;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {
    public static void main(String[] args) {
        int[] mang = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("mảng số nguyên: ");
        for(int i=0; i<mang.length; i++){
            System.out.print("Nhập số nguyên thứ " + (i+1) +  ":" + " ");
            mang[i] = scanner.nextInt();
        }

        System.out.println("Mảng sau khi sắp xếp là: ");
        Arrays.sort(mang);
        for (int i=0 ; i<mang.length; i++){
            System.out.println(mang[i]);
        }

        int Min=mang[0];
        for(int i=0; i<mang.length; i++){
        Min = Math.min(Min, mang[i]);
        if(Min>mang[i]){
            Min=mang[i];
        }
        }
        System.out.println("Số nhỏ nhất là: " + Min);

        double s=0;
        double j=0;
        for(int i=0; i <mang.length; i++){
            if(mang[i]%3==0){
                s+=mang[i];
                j+=1;
            }
        }
        System.out.println("s= " + s);
        System.out.println("j= " + j);

        double tbc = s/j;
        System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + tbc);
    }
}
