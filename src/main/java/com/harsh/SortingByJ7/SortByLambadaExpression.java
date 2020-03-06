package com.harsh.SortingByJ7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByLambadaExpression {
    public static void main(String[] args) {
        List<Person> pList = new ArrayList<Person>();
        pList.add(new Person(12, "HarshpList"));
        pList.add(new Person(82, "Mayuri"));
        pList.add(new Person(1, "Suchit"));
        pList.add(new Person(99, "Akshara"));
        pList.add(new Person(34, "Aai-Baba"));
        System.out.println("Before Sorted=>"+pList);
        pList = pList.stream().sorted(Comparator.comparing(Person::getpName)).collect(Collectors.toList());
        System.out.println("After Sort=>"+pList);

    }
}