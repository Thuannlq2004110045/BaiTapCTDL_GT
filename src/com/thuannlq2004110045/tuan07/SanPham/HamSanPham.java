package com.thuannlq2004110045.tuan07.SanPham;

import java.util.Scanner;


public class HamSanPham {
    Node head = null;// DANH SÁCH RỖNG
    Node tail = null;
    int sL;

    HamSanPham(int sl) {
        sL = sl;
    }

    public HamSanPham(){}

    
    void add(SanPham data){

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

    void nhapDSSP() {
        Scanner scanner = new Scanner(System.in);
        head = null;
        tail = null;
        for (int i = 0; i < sL; i++) {
            System.out.println("Sản phẩm " + (i + 1) + ": ");
            System.out.print("Tên sản phẩm:");
            String tenSanPham  = scanner.nextLine();
            System.out.print("Đơn giá: ");
            Double donGia = scanner.nextDouble();
            System.out.print("Giảm giá: ");
            Double giamGia = scanner.nextDouble();
            System.out.print("Thuế nhập khẩu: ");
            Double thueNhapKhau = scanner.nextDouble();
            scanner.nextLine();

            add(new SanPham(tenSanPham, donGia, giamGia, thueNhapKhau));

        }
    }

    void adddauDS(SanPham data){
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
        if(head.data.tenSanPham.equals(delete)){
            removedauDS();
            return;
        }
        if(tail.data.tenSanPham.equals(delete)){
            removecuoiDS();
            return;
        }

        Node previous = head;
        Node current = previous.next;
        Node after = current.next;

        while(after != null){
            if(current.data.tenSanPham.equals(delete)){
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
        System.out.println("Các sản phẩm trong danh sách:");
        while(current != null){
            current.data.inThongTinSP();
            current = current.next;

        }


    }

    void find(String tim){
        Node current = head;
        if(head == null){
            System.out.println("Danh sách rỗng");
        }else

        while(current != null){
            if(current.data.tenSanPham.equals(tim)){
                    current.data.inThongTinSP();
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
                if (current.data.tenSanPham.equals(suaten)) {
                        System.out.print("Nhập tên sản phẩm mới:");
                        String newtSP = scanner.nextLine();
                        current.data.tenSanPham = newtSP;
                        System.out.print("Nhập đơn giá mới:");
                        Double newdG = scanner.nextDouble();
                        scanner.nextLine();
                        current.data.donGia = newdG;
                        System.out.print("giảm giá:");
                        Double newgG = scanner.nextDouble();
                        scanner.nextLine();
                        current.data.giamGia = newgG;
                        System.out.print("Thuế nhập khẩu :");
                        Double newtNK = scanner.nextDouble();
                        scanner.nextLine();
                        current.data.thueNhapKhau = newtNK;
                    return;
                }
                current = current.next;
            }
        System.out.println("Tên nhập vào  không tồn tại");
    }
}
