package com.harsh.immutable;

import java.util.*;

public class Immutable {

    /*When we decide varibale as final then we can can not crete setter method
    else compile time exception occoured*/
    private final int i;
    private final Date birthdate;
    private final ArrayList<String> al;


    public Immutable(int i, Date bd, List<String> al) {
        this.i = i;
        birthdate = bd;

        ArrayList<String> temp = new ArrayList<String>();
        Iterator it = al.iterator();
        while (it.hasNext()) {
            temp.add((String) it.next());
            System.out.println("jj");
        }
        this.al =temp;
    }

    public int getI() {
        return i;
    }

    public ArrayList<String> getAl() {
       //return (ArrayList<String>)Collections.unmodifiableList(al);
        return (ArrayList)al.clone();
    }

    public Date getBirthdate() {
        return (Date)birthdate.clone();
    }

}
