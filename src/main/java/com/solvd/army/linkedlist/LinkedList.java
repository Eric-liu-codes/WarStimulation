package com.solvd.army.linkedlist;
public class LinkedList<T> {


    private Node<T> head;
    private int size = 0;

    public LinkedList() {
        head = new Node(null);
        size = 0;
    }

    public void add(T data) {
        Node aNode = new Node(data);
        Node current = head;
        if (this.head == null) {
            head = aNode;
        }
        else {
            Node<T> tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = aNode;
        }
        size++;
    }

    public void remove(T data){
        Node<T> prev = null;
        prev.next = head;
        Node<T> next = head.next;
        Node<T> temp = head;
        if(head.data == data){
            head = head.next;
        }
        while(temp.next != null){
            if (temp.data == data){
                prev.next = next;
                break;
            }
            prev = temp;
            temp = temp.next;
            next = temp.next;
        }
        if(temp.data == data){
            size--;
        }
    }

    void clear()
    {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        Node<T> tempNode = head;
        String elements = "";
        while (tempNode != null) {
            elements += "[" + String.valueOf(tempNode.data) + "]";
            tempNode = tempNode.next;
        }
        return elements;
    }
}
