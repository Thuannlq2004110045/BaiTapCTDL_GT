package com.thuannlq2004110045.tuan08.Book;

public class Node {
    //Nội dung
    Book data;

    //Liên kết đến nút tiêp theo
    //Tham chiếu 
    Node next;// Biến tham chiếu kiểu Node

    public Node(){}

    public Node(Book d){
        data = d;
        next = null;
    }

    public Node(Book d, Node n){
        data = d;
        next = n;
    }
}
