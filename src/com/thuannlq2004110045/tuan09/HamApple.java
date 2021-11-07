package com.thuannlq2004110045.tuan09;

import java.util.Scanner;

public class HamApple {
    Node head = null;// DANH SÁCH RỖNG
    Node tail = null;
    int sL;

    HamApple(int sl) {
        sL = sl;
    }

    public HamApple(){}

    
    void addTail(Apple data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;

        }
    }

    void nhapApple(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < sL; i++) {
            System.out.println("Táo thứ  " + (i + 1) + ": ");
            System.out.print("Mã táo: ");
            int maTao = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Khối lượng: ");
            Double khoiLuong  = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Màu sắc: ");
            String mauSac = scanner.nextLine();
            addTail(new Apple(maTao, khoiLuong, mauSac));
        }
    }

    void print(){
        Node current = head;

        if(head == null){
            System.out.println("Danh sách rỗng!!!");
            return;
        }
        System.out.println("Thông tin táo trong danh sách:");
        while(current != null){
            current.data.inThongTinTao();
            current = current.next;

        }
    }

    void copyData(Apple a, Apple b) {
        a.khoiLuong = b.khoiLuong;
        a.maTao = b.maTao;
        a.mauSac = b.mauSac;
    }

    void selectionSort_tangdan(){
        Node current = head;
        Node after;
        Node smaller = new Node(new Apple(0, 0.0, "0"));

        int check;

        while (current != null) {
            check = 0;
            after = current.next;
            copyData(smaller.data, current.data);
            while (after != null) {
                if (after.data.khoiLuong <= smaller.data.khoiLuong) {
                    copyData(smaller.data, after.data);
                    check = 1;
                }
                after = after.next;
            }
            if (check == 1) {
                Node local = head;

                while (local != null) {
                    if (local.data.maTao == smaller.data.maTao) {
                        copyData(local.data, current.data);
                    }
                    local = local.next;
                }
                copyData(current.data, smaller.data);
            }

            current = current.next;
        }
    }

    void bubbleSort_giamdan(){
        Node current ;
        Node after ;
        int number = 0;
        Node temp = new Node(new Apple(0, 0.0, "0"));
        while (number <= sL - 2) {
            current = head;
            after = current.next;
            for (int i = 0; i < sL - 1 - number; i++) {
                if (current.data.khoiLuong < after.data.khoiLuong) {
                    copyData(temp.data, current.data);
                    copyData(current.data, after.data);
                    copyData(after.data, temp.data);
                }
                current = current.next;
                after = current.next;
            }
            number++;
        }
    }

    boolean search(int tim)
    {
        for(Node current = head ; current != null ; current = current.next)
        {
            if(current.data.maTao == tim)
            {
            current.data.inThongTinTao();
            return true;
            }
        }
        return false;
    }

    void findvsMau(String mau){
        Node current  = head;
        System.out.println("======Danh sách táo theo màu "+mau+"==========");
        while(current != null){
            if(current.data.mauSac.equals(mau)){
                current.data.inThongTinTao();
            }
            current = current.next;
        }
    }

    void findvsCanNang(){
        Scanner sc = new Scanner(System.in);
        Node current  = head;
        System.out.println("=====Nhập khoảng khối lượng cần tìm====");
        System.out.print("Khối lượng lớn hơn: ");
        Double kL = sc.nextDouble();
        sc.nextLine();
        System.out.print("Khối lượng bé hơn: ");
        Double kL2 = sc.nextDouble();
        sc.nextLine();
        while(current != null){
            if(current.data.khoiLuong > kL && current.data.khoiLuong < kL2 ){
                current.data.inThongTinTao();
            }
            current = current.next;
            
        }
    }
}
