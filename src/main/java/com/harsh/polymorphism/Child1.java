package com.harsh.polymorphism;

public class Child1 extends Parent {

    public Child1(int i) {
        super(1); //this is override by default super() statmet in constructor
    }
    public void print() {
        System.out.println("I am Child1 print");
    }
}
