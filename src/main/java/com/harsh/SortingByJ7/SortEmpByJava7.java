package com.harsh.SortingByJ7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmpByJava7 {
    public static void main(String[] args) {

        ArrayList<Employee> al=new ArrayList<Employee>();
        al.add(new Employee(12,"Harshal"));
        al.add(new Employee(82,"Mayuri"));
        al.add(new Employee(1,"Suchit"));
        al.add(new Employee(99,"Akshara"));
        al.add(new Employee(34,"Aai-Baba"));

        System.out.println("Without Sorting==>"+al);

       // Collections.sort((List)al);
        System.out.println("By Comparable check compareTo(.) method==>"+al);

         Collections.sort(al,Employee.byEmpName);
        System.out.println("byComparator Sorting chk compare(..) method==>"+al);

        Collections.sort(al,Employee.byEmpID);
        System.out.println("byComparator Sorting chk compare(..) method==>"+al);
    }
}
