package com.harsh.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class ListType {

    public static void main(String[] args) {
        ListType li = new ListType();
        li.arrayList();
        li.linkedList();

    }

    private ArrayList arrayList() {
        ArrayList al = new ArrayList();
        al.add("Harshal");
        al.add("sumit");
        al.add("Pragat");
        al.add("Try");
        al.removeIf(n -> n.equals("Sumit"));

        System.out.println("Full ArrayList->" + al);
        int upto = 2;
        Iterator it = al.listIterator(2);
        while (it.hasNext()) {
            System.out.println("Up to " + upto + " position->" + it.next());
        }
        return al;
    }

    private LinkedList linkedList() {
        LinkedList li = new LinkedList();
        li.add("Harshal");
        li.add("Akshara");
        li.add("Mayuri");
        li.add("Suchit");
        li.getFirst();
        /*al.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).compareTo((String) o2);
            }
        });*/
        Iterator it = li.descendingIterator();

        while (it.hasNext()) {
            System.out.println("linked List:" + it.next());
        }
        System.out.println("Adding lintlist elemnt in AL->"+arrayList().add(li));
        return li;
    }


}
