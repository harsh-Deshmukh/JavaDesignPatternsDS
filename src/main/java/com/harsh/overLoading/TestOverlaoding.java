package com.harsh.overLoading;

public class TestOverlaoding {
/*Compile time error in Overloading :- Throw if Method name is same with different
            return type and access specifier with no argument*/

/*
    private  float print(int ) {
        System.out.println("I am StringBuffer print()");
        return 0;
    }

    private String print() {
        System.out.println("I am String print()");
        return null;
    }*/

    public String print(int k) {
        System.out.println("I am String print() :"+k);
        return null;
    }

    public StringBuffer print(float k) {
        System.out.println("I am StringBuffer print():"+k);
        return null;
    }

    public static void main(String[] args) {
        TestOverlaoding chk = new TestOverlaoding();
       // chk.print(new Integer(90));
        chk.print((float)0.0);
    }
}
