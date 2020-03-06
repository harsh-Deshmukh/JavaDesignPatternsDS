package com.harsh.dataStructure.linkedList;

public class ListNode {
    private ListNode next;
    private int data;

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "["+getData()+","+getNext()+"]";
    }
}
