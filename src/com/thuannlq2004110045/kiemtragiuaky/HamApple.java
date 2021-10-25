package com.thuannlq2004110045.kiemtragiuaky;

import java.util.Scanner;

public class HamApple {
    Node head = null;// DANH SÁCH RỖNG
    Node tail = null;
    int sL;

    HamApple(int sl) {
        sL = sl;
    }

    public HamApple(){}

    
    void add(Apple data){

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

    void nhap() {
        Scanner scanner = new Scanner(System.in);
        head = null;
        tail = null;
        for (int i = 0; i < sL; i++) {
            System.out.println("Táo thứ " + (i + 1) + ": ");
            System.out.print("Mã táo: ");
            int maTao = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Khối lượng:");
            Double khoiLuong  = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Màu sắc: ");
            String mauSac = scanner.nextLine();

            add(new Apple(maTao,khoiLuong,mauSac));
        }
    }

    void adddauDS(Apple data){
        Node newNode = new Node(data);
        if (head == null) {// thêm 1 nút vào danh sách
            head = newNode;
            tail = newNode;
        } else {// danh sách không rỗng // thêm vào đầu danh sách
            newNode.next = head;
            head = newNode;
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

    void find(int tim){
        Node current = head;
        if(head == null){
            System.out.println("Danh sách rỗng");
        }else

        while(current != null){
            if(current.data.maTao == tim){
                    current.data.inThongTinTao();
                    return;
            }
            current = current.next;
        }
    }

    void removecuoiDS(){
        Node previous = head;
        Node current = previous.next;
        if(previous.next == null){
            head = head.next;
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

}
