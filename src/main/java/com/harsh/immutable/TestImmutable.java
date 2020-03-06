package com.harsh.immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestImmutable {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("harshal");
        al.add("Sumit");

        int i = 12;
        Date date = new Date(System.currentTimeMillis());
        Immutable im = new Immutable(i, date, al);

        System.out.println(im.getI() + " Equality with local var " + (i == im.getI()));
        System.out.println(im.getAl() + " Equality with local var " + al.equals(im.getAl()));
        System.out.println(im.getBirthdate()+" Immutable BD");
        System.out.println("After Modified values of local var........");

        i = 20;
        al.add("Pragat");
        im.getBirthdate().setTime(System.currentTimeMillis()+1000000);

        System.out.println(im.getI() + " Equality " + (i == im.getI()));
        System.out.println(im.getAl() + " Equality " + al.equals(im.getAl()));
        System.out.println(im.getBirthdate()+" Immutable BD");

        System.out.println("Now get ArrayLIst from class and call add method  ");
        im.getAl().add("New Value added");
        System.out.println(im.getAl());


    }
}
