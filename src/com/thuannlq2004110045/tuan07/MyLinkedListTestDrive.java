package com.thuannlq2004110045.tuan07;

import java.util.Scanner;

public class MyLinkedListTestDrive {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
            Scanner scanner = new Scanner(System.in);
            int luaChon;
            do{
            System.out.println("=============================MENU==========================");
            System.out.println("=  1.thêm một số vào danh sách.                           =");
            System.out.println("=  2.tìm một số trong danh sách.                          =");
            System.out.println("=  3.Thêm 1 số vào đầu danh sách.                         =");
            System.out.println("=  4.Thêm 1 số vào trước 1 phần tử trong danh sách.       =");
            System.out.println("=  5.Thêm 1 số vào cuối danh sách.                        =");
            System.out.println("=  6.Xoá 1 số đầu danh sách.                              =");
            System.out.println("=  7.Xoá 1 số cuối danh sách.                             =");
            System.out.println("=  8.Xoá 1 số bất kì giữa danh sách.                      =");
            System.out.println("=  9.Sửa 1 số trong danh sách.                            =");
            System.out.println("=  10.In danh sách số.                                    =");
            System.out.println("=  11.Kết thúc.                                           =");
            System.out.println("=============================MENU==========================");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();
    
            switch(luaChon){
            case 1:
            System.out.println("Nhập số cần thêm vào danh sách: ");
            int data = scanner.nextInt();
            scanner.nextLine();
            myLinkedList.add(data);
            break;

            case 2:
            System.out.println("Nhập số cần tìm vào danh sách: ");
            int data1 = scanner.nextInt();
            scanner.nextLine();
            myLinkedList.find(data1);
            break;

            case 3:
            System.out.println("Nhập số cần chèn vào đầu danh sách: ");
            int data2 = scanner.nextInt();
            scanner.nextLine();
            myLinkedList.adddauDS(data2);
            break;

            case 4:
            System.out.println("Nhập số cần chèn trước nó: ");
            int data3 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập số sẽ chèn vào: ");
            int data4 = scanner.nextInt();
            scanner.nextLine();
            myLinkedList.addgiuaDS(data3, data4);
            break;

            case 5:
            System.out.println("Nhập số cần thêm vào cuối danh sách: ");
            int data5 = scanner.nextInt();
            scanner.nextLine();
            myLinkedList.add(data5);
            break;

            case 6:
            System.out.println("Nhập số đầu danh sách muốn xoá: ");
            int data6 = scanner.nextInt();
            scanner.nextLine();
            myLinkedList.removedauDS(data6);
            break;

            case 7:
            System.out.println("Nhập số cuối danh sách muốn xoá: ");
            int data7 = scanner.nextInt();
            scanner.nextLine();
            myLinkedList.removecuoiDS(data7);
            break;

            case 8:
            System.out.println("Nhập số muốn xoá: ");
            int data8 = scanner.nextInt();
            scanner.nextLine();
            myLinkedList.removegiuaDS(data8);
            System.out.println("Đã xoá " + data8 + " trong danh sách");
            break;

            case 9:
            System.out.println("Nhập số muốn sửa: ");
            int data9 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập giá trị mới: ");
            int data10 = scanner.nextInt();
            scanner.nextLine();
            myLinkedList.suaDS(data9, data10);
            break;

            case 10:
            System.out.println("======== In danh sách ======= ");
            myLinkedList.print();
            break;

            case 11:
            System.exit(0);

            }
        }while(true);
    }
}
