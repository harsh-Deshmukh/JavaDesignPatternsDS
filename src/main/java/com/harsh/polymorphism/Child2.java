package com.harsh.polymorphism;

public class Child2 extends Child1 {

    Child2() {
        super(1);
    }

    public void welcome() {
        System.out.println("I am Child2 welcome()");
    }

    public void print() {
        System.out.println("I am Child2 print()");
    }

    public void parentMthod() {
        System.out.println("I am child2 parentMthod");
    }
}
