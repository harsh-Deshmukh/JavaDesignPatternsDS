package com.harsh.dataStructure.linkedList;

public class TestLinkedList {

    public  static void main(String[] args){
        LinkedList li=new LinkedList();

        li.insertAtBegin(new ListNode(12));
        li.insertAtBegin(new ListNode(13));
        li.insertAtBegin(new ListNode(18));
        System.out.println("AllInserted at beginning=>"+li.getHead());
        li.insertAtEnd(new ListNode(14));
        System.out.println("After adding at End=>"+li.getHead());

        li.insertAtPosition(20,2);
        System.out.println("Insert at 2 position=>"+li.getHead());

        li.insertAtMiddle(24);
        li.insertAtMiddle(25);
        li.insertAtMiddle(27);
        System.out.println("Insert at Middle for length "+li.length()+"=> "+li);

        System.out.println(li.getHead()+" and size is "+li.length());
        //li.removeFirst();
        //System.out.println(li.getHead()+" and size is "+li.length());
        li.removeAtPostion(90);

        System.out.println(li.getHead()+" and size is "+li.length());

        LinkedList li1=new LinkedList();

        li1.insertAtMiddle(19);
        li1.insertAtMiddle(11);
        li1.insertAtMiddle(13);
        li1.insertAtMiddle(12);

        System.out.println("New NOde Opertaion-"+li1.getHead());

       li1.removeMatch(li1.getHead());
        //System.out.println("New NOde Opertaion remo-"+li1.getHead());

    }
}
