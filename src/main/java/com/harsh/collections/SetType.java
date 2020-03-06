package com.harsh.collections;

import java.util.*;

public class SetType {

    public static void main(String[] args) {
        SetType set = new SetType();
        set.hashSet();
        set.linkedHashSet();
        set.treeSet();
    }

    private void hashSet() {
        HashSet hs = new HashSet();

        hs.add("Harshal");
        hs.add("summit");
        hs.add("prgat");
        hs.add("Harshal");
        System.out.print("HashSet main random order -->" + hs);
    }

    //Maintain insertion order
    private Set linkedHashSet() {
        Set lhs = new LinkedHashSet();
/*
Sorting not possible in LHS so passed it to TS and it will sort it auto if it is wrapper class/String& if it
   contain Object as element then we need to override compareTo method in that element class
*/
        lhs.add(new Employee(10, "Harshal"));
        lhs.add(new Employee(12, "Mayuri"));
        lhs.add(new Employee(13, "Akshara"));
        lhs.add(new Employee(0, "Suchit"));
        System.out.println("LinkedHS before passed to Treeset->" + lhs);

        return lhs;
    }

    private void treeSet() {
        TreeSet ts = new TreeSet();
        /*sorting done by default by Comparable compareTo() Method present inside
        Wrapper + String class  here in STring class */
        ts.add("Harshal");
        ts.add("Mayur");
        ts.add("Suchit");
        ts.add("Akshara");
        System.out.println("Treeset->" + ts);

        /*We doing sorting by Comparator if want by Comparable need to override
        copareTo() in Employee class;*/

        ts = new TreeSet(comparatorById);
        System.out.println("Storing object in TS... ");
        ts.addAll(linkedHashSet());
        System.out.println("Sorted TS->" + ts);
        System.out.println(" ceiling() Gretest / equal element->"+ts.ceiling(new Employee(10, "Harshal")));
        System.out.println("floor() Lowest / equal element->"+ts.floor(new Employee(10, "Harshal")));
        System.out.println("heigher() greatest element->"+ts.higher(new Employee(10, "Harshal")));
        System.out.println("lower() Lowest element->"+ts.lower(new Employee(10, "Harshal")));
        System.out.println("headSet() return less than given element->"+ts.headSet(new Employee(10, "Harshal")));
        System.out.println("headset(..) return less than given element with inclusion of same->"+ts.headSet(new Employee(10, "Harshal"),true));
   ts.clear();
   ts.addAll(arrayList());
Iterator it=ts.descendingIterator();
while(it.hasNext()) {
    System.out.print(it.next() + ",");

}
    }

    private Comparator comparatorById = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Employee) o1).getEid() - ((Employee) o2).getEid();
        }
    };
    private ArrayList arrayList() {
        ArrayList al = new ArrayList();
        al.add(new Employee(10,"Harshal"));
        al.add(new Employee(14,"sumit"));
        al.add(new Employee(15,"Pragat"));
        al.add(new Employee(18,"Try"));
        return al;
    }
}
