package com.thuannlq2004110045.tuan04;

import java.util.Scanner;

public class XeTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số xe cần lưu trữ");
        int m = scanner.nextInt();
        scanner.nextLine();
        Xe[] danhSachxe = new Xe[m];
        int n = danhSachxe.length;
        System.out.println("Nhập vào danh sách xe");
        
        for(int i=0; i<danhSachxe.length;i++){
            System.out.println("Nhập xe thứ " +(i+1));
            System.out.print("Nhập tên chủ xe: ");
            String tenChuXe = scanner.nextLine();

            System.out.print("Nhập hãng sản xuất: ");
            String hangSanXuat = scanner.nextLine();

            System.out.print("Nhập dòng xe: ");
            String dong = scanner.nextLine();

            System.out.print("Nhập giấy phép: ");
            String giayPhep = scanner.nextLine();

            System.out.print("Nhập dung tích xăng: ");
            String dungTichXang = scanner.nextLine();

            danhSachxe[i] = new Xe(tenChuXe, hangSanXuat, dong, giayPhep, dungTichXang);
        }

        System.out.println("Danh sách xe sau khi nhập");
        int k=0;
        for(Xe xe : danhSachxe){
            System.out.println("Thông tin sách thứ " +(k+1));

            xe.inThongTinXe();
            k+=1;
        }
// thêm xe
        Xe newdanhSachxe[] = new Xe[n+1];
        for(int i=0; i<n;i++){
            newdanhSachxe[i]= danhSachxe[i];
        }
        System.out.println("Nhập xe muốn thêm ");
        System.out.print("Nhập tên chủ xe: ");
        String tenChuXe = scanner.nextLine();

        System.out.print("Nhập hãng sản xuất: ");
        String hangSanXuat = scanner.nextLine();

        System.out.print("Nhập dòng xe: ");
        String dong = scanner.nextLine();

        System.out.print("Nhập giấy phép: ");
        String giayPhep = scanner.nextLine();

        System.out.print("Nhập dung tích xăng: ");
        String dungTichXang = scanner.nextLine();
        newdanhSachxe[n] = new Xe(tenChuXe, hangSanXuat, dong, giayPhep, dungTichXang);


        System.out.println("In danh sách sau khi thêm ");
        int h=0;
        for(Xe x : newdanhSachxe){
            System.out.println("Thông tin xe thứ " + (h+1));
            
            x.inThongTinXe();
            h+=1;
        }

        //Xóa xe
        System.out.println("Nhập xe muốn xóa");
        int xoa = scanner.nextInt();
        Xe danhSachxoa[] = new Xe[n];
        int dem=0;
        for (int i=0; i<= n; i++){
            if(i==(xoa-1)){
                continue;
            }
            danhSachxoa[dem]= newdanhSachxe[i];
            dem++;
        }
        System.out.println("danh sách xe sau khi xóa");
        int tam = 0;
        for(int i=0; i<n; i++){
            if(tam == (xoa-1))
            tam+=1;
            System.out.println("Xe " + (tam + 1));
            danhSachxoa[i].inThongTinXe();
            tam++;
        }
    }
}

