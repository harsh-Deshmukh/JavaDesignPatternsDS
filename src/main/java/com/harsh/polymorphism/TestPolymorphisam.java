package com.harsh.polymorphism;

public class TestPolymorphisam {

    public static void main(String[] args) {
        Parent p = new Child1(1);

        Parent p1 = new Child2();

        p.print();
        p1.print();


        Parent c2 = new Child2();

       c2.parentMthod();
    }
}
