package com.thuannlq2004110045.tuan08;

import java.util.Scanner;

public class HamStudent {
    Node head = null;// DANH SÁCH RỖNG
    Node tail = null;
    int sL;

    HamStudent(int sl) {
        sL = sl;
    }

    public HamStudent(){}

    
    void addTail(Student data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;

        }
    }

    void nhapStudent(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < sL; i++) {
            System.out.println("Sinh viên " + (i + 1) + ": ");
            System.out.print("Mã số sinh viên: ");
            int maSV = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Quê quán:");
            String queQuan  = scanner.nextLine();
            System.out.print("Họ và Tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Ngày sinh: ");
            String ngaySinh = scanner.nextLine();
            System.out.print("Điểm: ");
            float diem = scanner.nextFloat();
            scanner.nextLine();
            addTail(new Student(maSV, queQuan, hoTen, ngaySinh, diem));
        }
    }

    void themVaoCuoi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin sinh viên thêm vào cuối :");
        System.out.print("Mã số sinh viên: ");
            int maSV = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Quê quán:");
            String queQuan  = scanner.nextLine();
            System.out.print("Họ và Tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Ngày sinh: ");
            String ngaySinh = scanner.nextLine();
            System.out.print("Điểm: ");
            float diem = scanner.nextFloat();
            scanner.nextLine();
        addTail(new Student(maSV, queQuan, hoTen, ngaySinh, diem));
    }

    void print(){
        Node current = head;

        if(head == null){
            System.out.println("Danh sách rỗng!!!");
            return;
        }
        System.out.println("Các sinh viên cuối danh sách:");
        while(current != null){
            current.data.inThongTinStudent();
            current = current.next;
        }
    }

    void removedauDS(){
        head = head.next;
    }

    void removecuoiDS(){
        Node previous = head;
        Node current = previous.next;
        if(previous.next == null){
            removedauDS();
            return;
        }

        while(current != null){
            if(current.next == null){
                previous.next = null;
                return;
            }
            previous = previous.next;
            current = previous.next;
        }
    }

    void getcuoiDS(){
        Node previous = head;
        Node current = previous.next;
        if(previous.next == null){
            removedauDS();
            System.out.println("phan tu lay ra la: ");
            previous.data.inThongTinStudent();
            return;
        }

        while(current != null){
            if(current.next == null){
                previous.next = null;
                System.out.println("Phan tu lay ra la: ");
                current.data.inThongTinStudent();
                return;
            }
            previous = previous.next;
            current = previous.next;
        }
    }

}
