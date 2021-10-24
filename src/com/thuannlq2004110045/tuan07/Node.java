package com.thuannlq2004110045.tuan07;

public class Node {
    //Nội dung
    int data;

    //Liên kết đến nút tiêp theo
    //Tham chiếu 
    Node next;// Biến tham chiếu kiểu Node

    public Node(){}

    public Node(int d){
        data = d;
        next = null;
    }

    public Node(int d, Node n){
        data = d;
        next = n;
    }
}
