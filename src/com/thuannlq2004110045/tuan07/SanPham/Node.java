package com.thuannlq2004110045.tuan07.SanPham;

public class Node {
    //Nội dung
    SanPham data;

    //Liên kết đến nút tiêp theo
    //Tham chiếu 
    Node next;// Biến tham chiếu kiểu Node

    public Node(){}

    public Node(SanPham d){
        data = d;
        next = null;
    }

    public Node(SanPham d, Node n){
        data = d;
        next = n;
    }
}
