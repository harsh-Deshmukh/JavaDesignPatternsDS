package com.harsh.designpattern.creational.Abstract;

public class TestAbstractComputerFactory {

    public static void main(String[] args){
        Computer comp=ComputerFactory.getComputer(new PCFactory("4GB","1TB","I8"));

        System.out.println("Computer is instance of "+comp.getClass().getName());
        System.out.println("with configuration : "+comp);

        Computer comp2=ComputerFactory.getComputer(new ServerFactory("40GB","600TB","I8"));

        System.out.println("Computer is instance of "+comp2.getClass().getName());
        System.out.println("with configuration : "+comp2);



    }
}
