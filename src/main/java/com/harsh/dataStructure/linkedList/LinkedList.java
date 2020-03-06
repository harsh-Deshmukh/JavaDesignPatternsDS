package com.harsh.dataStructure.linkedList;
public class LinkedList {
    public ListNode getHead() {
        return head;
    }

    private ListNode head;
    private int length = 0;

    public LinkedList() {
        length = 0;
    }

    public synchronized void insertAtBegin(ListNode node) {
        node.setNext(head);
        head = node;
        length++;
    }

    public synchronized void insertAtEnd(ListNode node) {
        if (head == null) {
            head = node;
        } else {
            ListNode p=head, q;
            //for (p = head; (q = p.getNext()) != null; p = q);
            while(p.getNext()!=null){
                p=p.getNext();
            }
            p.setNext(node);

            length++;
        }
    }

    public int length() {
        return length;
    }

    public synchronized void insertAtPosition(int data, int position) {
        if (head == null) {
            head = new ListNode(data);
            length++;
            return;
        }
        if (position < 0 || position == 0) {
            ListNode node = new ListNode(data);
            node.setNext(head);
            head = node;
            length++;
            return;
        }
        if (position > length) {
            insertAtEnd(new ListNode(data));
        } else if (position == 1) {
            insertAtBegin(new ListNode(data));
        } else {

            ListNode temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.getNext();
            }
            ListNode newNode = new ListNode(data);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            length++;
        }
    }

    public synchronized void insertAtMiddle(int data) {
        ListNode node = new ListNode(data);
        insertAtPosition(data, length / 2);
    }

    public synchronized void removeFirst() {
        if (head != null) {
            if (length > 0) {
                ListNode temp = head.getNext();
                head = temp;
            }
            length--;
        }
    }

    public synchronized void removeAtPostion(int position) {
        if (length != 0) {
            if (position == 0 || position == 1) {
                removeFirst();
            } else {
                if (position > length) {
                    position = length;
                }
                ListNode temp = head;
                for (int i = 1; i < position - 1; i++) {
                    temp = temp.getNext();

                }
                temp.setNext(temp.getNext().getNext());
                System.out.println(temp);
                length--;
            }
        }
    }
    public  synchronized  void removeMatch(ListNode node){
        if(head==null){
            return;
        }
        ListNode temp=head;
        while((temp=temp.getNext())!=null){
            if(temp.equals(node)){
                temp=temp;
            }
        }
       temp.setNext(temp.getNext());
    }
}
