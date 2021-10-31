package com.thuannlq2004110045.tuan08;

public class Node {
    //Nội dung
    Student data;

    //Liên kết đến nút tiêp theo
    //Tham chiếu 
    Node next;// Biến tham chiếu kiểu Node

    public Node(){}

    public Node(Student d){
        data = d;
        next = null;
    }

    public Node(Student d, Node n){
        data = d;
        next = n;
    }
}
