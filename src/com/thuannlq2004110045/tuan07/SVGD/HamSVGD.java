package com.thuannlq2004110045.tuan07.SVGD;

import java.util.Scanner;

public class HamSVGD {
    Node head = null;// DANH SÁCH RỖNG
    Node tail = null;
    int sL;

    HamSVGD(int sl) {
        sL = sl;
    }

    public HamSVGD(){}

    
    void add(SVGD data){

        //Tạo 1 Node mới
        Node newNode = new Node(data);

        if(head == null){//thêm 1 nút vào ds rỗng
            head = newNode;
            tail = newNode;
        }else{//ds không rỗng// thêm vào đuổi danh sách
            tail.next = newNode;
            tail = newNode;
        }

    }

    String xetHocLuc(float diem) {
        if (diem >= 9) {
            return "Xuất sắc";
        } else if (diem >= 7.5) {
            return "Giỏi";
        } else if (diem >= 6.5) {
            return "Khá";
        } else if (diem >= 5) {
            return "Trung Bình";
        } else
            return "Yếu";
    }

    void nhapDSSV() {
        Scanner scanner = new Scanner(System.in);
        head = null;
        tail = null;
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
            String hocluc = xetHocLuc(diem);

            add(new SVGD(maSV,queQuan, hoTen, ngaySinh, diem, hocluc));

        }
    }

    void adddauDS(SVGD data){
        Node newNode = new Node(data);
        if (head == null) {// thêm 1 nút vào danh sách
            head = newNode;
            tail = newNode;
        } else {// danh sách không rỗng // thêm vào đuôi danh sách
            newNode.next = head;
            head = newNode;
        }

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

    void removedauDS(){
        head = head.next;
    }

    void removegiuaDS(String delete){
        if(head.data.hoTen.equals(delete)){
            removedauDS();
            return;
        }
        if(tail.data.hoTen.equals(delete)){
            removecuoiDS();
            return;
        }

        Node previous = head;
        Node current = previous.next;
        Node after = current.next;

        while(after != null){
            if(current.data.hoTen.equals(delete)){
                previous.next = after;
                return;
            }
            previous = previous.next;
            current = previous.next;
            after = current.next;
        }
    }


    void print(){
        Node current = head;

        if(head == null){
            System.out.println("Danh sách rỗng!!!");
            return;
        }
        System.out.println("Các sinh viên trong danh sách:");
        while(current != null){
            current.data.inThongTinSVGD();
            current = current.next;

        }


    }

    void find(String tim){
        Node current = head;
        if(head == null){
            System.out.println("Danh sách rỗng");
        }else

        while(current != null){
            if(current.data.hoTen.equals(tim)){
                    current.data.inThongTinSVGD();
                    return;
            }
            current = current.next;
        }
    }

    void sua(String suaten) {
        Scanner scanner = new Scanner(System.in);
        Node current = head;
        if (current == null) {
            System.out.println("Danh sách rỗng");
            return;
        } else
            while (current != null) {
                if (current.data.hoTen.equals(suaten)) {
                        System.out.print("Nhập mã số mới:");
                        int newMaSV = scanner.nextInt();
                        scanner.nextLine();
                        current.data.maSV = newMaSV;
                        System.out.print("Nhập quê quán mới:");
                        String newQueQuan = scanner.nextLine();
                        current.data.queQuan = newQueQuan;
                        System.out.print("Nhập họ tên mới:");
                        String newHoTen = scanner.nextLine();
                        current.data.hoTen = newHoTen;
                        System.out.print("Nhập ngày sinh mới :");
                        String newNS = scanner.nextLine();
                        current.data.ngaySinh = newNS;
                        System.out.print("Nhập điểm mới:");
                        Float newDiem = scanner.nextFloat();
                        scanner.nextLine();
                        current.data.diem = newDiem;
                        current.data.hocLuc = xetHocLuc(newDiem);
                    return;
                }
                current = current.next;
            }
        System.out.println("Tên nhập vào  không tồn tại");
    }
}
