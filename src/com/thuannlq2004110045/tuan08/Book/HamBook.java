package com.thuannlq2004110045.tuan08.Book;

import java.util.Scanner;

public class HamBook {
    Node head = null;// DANH SÁCH RỖNG
    Node tail = null;
    int sL;

    HamBook(int sl) {
        sL = sl;
    }

    public HamBook(){}

    
    void addTail(Book data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;

        }
    }

    void nhapBook(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < sL; i++) {
            System.out.println("Book " + (i + 1) + ": ");
            System.out.print("Giá: ");
            Double gia = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Nhà xuất bản:");
            String nhaXuatBan  = scanner.nextLine();
            System.out.print("Năm xuất bản: ");
            String namXuatBan = scanner.nextLine();
            System.out.print("Giá bán: ");
            Double giaBan = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Số lượng: ");
            int soLuong = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Loại: ");
            String loai = scanner.nextLine();
            addTail(new Book(gia, nhaXuatBan, namXuatBan, giaBan, soLuong, loai));
        }
    }

    void themVaoCuoi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin Book thêm vào cuối :");
        System.out.print("Giá: ");
            Double gia = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Nhà xuất bản:");
            String nhaXuatBan  = scanner.nextLine();
            System.out.print("Năm xuất bản: ");
            String namXuatBan = scanner.nextLine();
            System.out.print("Giá bán: ");
            Double giaBan = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Số lượng: ");
            int soLuong = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Loại: ");
            String loai = scanner.nextLine();
            addTail(new Book(gia, nhaXuatBan, namXuatBan, giaBan, soLuong, loai));
    }

    void print(){
        Node current = head;

        if(head == null){
            System.out.println("Danh sách rỗng!!!");
            return;
        }
        System.out.println("Các sinh viên cuối danh sách:");
        while(current != null){
            current.data.inThongTinBook();
            current = current.next;
        }
    }

    void removedauDS(){
        head = head.next;
    }

    void getdauDS(){
        removedauDS();
        System.out.println("Book lấy ra là: ");
        head.data.inThongTinBook();
    }



}
