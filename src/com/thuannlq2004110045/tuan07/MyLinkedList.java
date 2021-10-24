package com.thuannlq2004110045.tuan07;

public class MyLinkedList {
    Node head = null;// DANH SÁCH RỖNG
    Node tail = null;


    public MyLinkedList(){}

    
    void add(int data){

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

    void adddauDS(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

    }

    void addgiuaDS(int data,int data2){
        Node newNode = new Node(data2);
        Node current = head;
        Node previous = head;
        Node vitrithem = find(data);
        while(current.next != null && current.data != data){
            previous = current;
            current = current.next;
        }
            if(vitrithem.data == data){
                previous.next = newNode;
                newNode.next = current;
                return;
            }
    }

    void suaDS(int data, int data2){
        Node current = head;
        if (current == null) {
            System.out.println("Danh sách rỗng");
            return;
        } else
            while (current != null) {
                if(current.data == data){
                    current.data = data2;
                    return;
                }
                current = current.next;
            } 
    }

    void removecuoiDS(int data){
        Node current = head;
        Node previous = head;
        if(head == null){
            System.out.println("k xóa được");
            return;
        }

        while(current.next != null && current.data != data){
            previous = current;
            current = current.next;
        }
            if(current.data == data){
                previous.next = previous.next.next;
                return;
            }
    }

    void removedauDS(int data){
        Node delete = head;

        if(head == null){
            System.out.println("k xóa được");
            return;
        }

        while(head != null){
            if(delete == head){
                head = head.next;
                delete.next = null;
                delete = null;
                return;
            }
            return;
        }
    }

    void removegiuaDS(int data){
        Node current = head;
        Node delete = find(data);
        Node previous = head;
        if(head == null){
            System.out.println("k xóa được");
            return;
        }

        while(current.next != null && current.data != data){
            previous = current;
            current = current.next;
        }
            if(delete.data == data){
                previous.next = previous.next.next;
                return;
            }
    }


    void print(){
        Node current = head;

        if(head == null){
            System.out.println("Danh sách rỗng!!!");
            return;
        }

        System.out.println("Các nút trong danh sách:");
        while(current != null){
            System.out.println(current.data);
            current = current.next;

        }


    }

    Node find(int data){
        Node current = head;
        Node result =null;
        if(head == null){
            System.out.println("k tìm được");
        }

        while(current != null){
            if(data == current.data){
                System.out.println("tìm thấy " + current.data + " trong danh sách.");
                result = current;
            }
            current = current.next;
        }
        return result;
    }
}
