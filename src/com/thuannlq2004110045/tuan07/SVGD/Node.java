package com.thuannlq2004110045.tuan07.SVGD;

public class Node {
    //Nội dung
    SVGD data;

    //Liên kết đến nút tiêp theo
    //Tham chiếu 
    Node next;// Biến tham chiếu kiểu Node

    public Node(){}

    public Node(SVGD d){
        data = d;
        next = null;
    }

    public Node(SVGD d, Node n){
        data = d;
        next = n;
    }
}
