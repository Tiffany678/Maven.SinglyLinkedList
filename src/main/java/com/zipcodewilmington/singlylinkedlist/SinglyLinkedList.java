package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Node head;
    Node tail;
    public SinglyLinkedList() {
        head = null;
        tail = null;
    }
    // Node Class
    class Node
    {
        int data;
        Node next;

        // Constructor to create
        // a new node
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void add(int element){
        Node newNode = new Node(element);
        //check if the lined list is empty/null;
        if(head==null) {
            head = newNode;
        }
        if(tail==null){
            tail=newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void remove(int elementIndex){
        Node temp = head;

        for(int i=0; i<elementIndex-1; i++){
            temp = temp.next;
        }
        if(temp.next!=null) {
            temp.next = temp.next.next;
        }
    }
    public boolean contain(int element){
        Node temp = head;
        while (temp!=null){
            if(temp.data == element) {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public int find(int element){
        Node temp = head;
        int counter=0;
        while (temp!=null && temp.next!=null){
            if(temp.data == element) {
                return counter;
            }
            counter++;
        }
        return -1;
    }
    public int size(){
        Node temp= head;
        int counter =0;
        while(temp!=null){
            counter++;
            temp=temp.next;
        }
        return counter;
    }



}
