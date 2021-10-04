package com.thuannlq2004110045.tuan04;

import java.util.Scanner;

public class Lab3Bai4 {
    public static void main(String[] args) {
        Scanner soLuong = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên: ");
        int soluongSV = soLuong.nextInt();

        String[] hoTen = new String[soluongSV];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh sách sinh viên");
        for(int i=0; i<hoTen.length; i++){
            System.out.print("Nhập họ tên sinh viên thứ " + (i+1) + ": ");
            hoTen[i] = scanner.nextLine();
        }

        double[] Diem = new double[soluongSV];
        Scanner diem = new Scanner(System.in);
        System.out.println("Danh sách điểm");
        for(int i=0; i<Diem.length; i++){
            System.out.print("Nhập điểm sinh viên thứ " + (i+1) + ": ");
            Diem[i] = diem.nextDouble();
        }

        System.out.println("Danh sách sinh viên vừa nhập");
        for(int i=0; i<hoTen.length; i++){
            System.out.println("Sinh viên thứ  " +(i+1) + ": " + hoTen[i] + "\nĐiểm: " + Diem[i] );
            if(Diem[i]<5){
                System.out.println("Học lực yếu");
            }
            else if(5<=Diem[i] && Diem[i]<6.5){
                System.out.println("Học lực trung bình");
            }
            else if(6.5<=Diem[i]&&Diem[i]<7.5){
                System.out.println("Học lực khá");
            }
            else if(7.5<=Diem[i]&&Diem[i]<9){
                System.out.println("Học lực giỏi");
            }
            else if(Diem[i]>=9){
                System.out.println("Học lực xuất sắc");
            }
        }
    }
}
