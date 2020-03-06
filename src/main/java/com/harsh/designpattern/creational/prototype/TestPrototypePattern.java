package com.harsh.designpattern.creational.prototype;

public class TestPrototypePattern {
    public static void main(String[] args){
        PrototypePattern obj1=new PrototypePattern();
        obj1.loadData();
        System.out.println(obj1.getAr());
        PrototypePattern obj2= null;
        try {
            obj2 = obj1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        obj2.getAr().add("Deshmukh");
        System.out.println("New Obj After Cloning:"+obj2.getAr());
        System.out.println("old Obj after Modification on new cloning abject:"+obj1.getAr());

    }
}
