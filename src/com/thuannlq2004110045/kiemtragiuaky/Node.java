package com.thuannlq2004110045.kiemtragiuaky;

public class Node {
    //Nội dung
    Apple data;

    //Liên kết đến nút tiêp theo
    //Tham chiếu 
    Node next;// Biến tham chiếu kiểu Node

    public Node(){}

    public Node(Apple d){
        data = d;
        next = null;
    }

    public Node(Apple d, Node n){
        data = d;
        next = n;
    }
}
