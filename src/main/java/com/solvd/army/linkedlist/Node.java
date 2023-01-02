package com.solvd.army.linkedlist;

public class Node<T> {
    protected T data;
    protected Node<T> next;
    Node(T data){
        this.data = data;
        this.next = null;
    }
}
