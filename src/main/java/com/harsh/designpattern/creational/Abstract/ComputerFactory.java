package com.harsh.designpattern.creational.Abstract;

public class ComputerFactory{

    public static Computer getComputer(AbstractComputerFactory factory){

        return factory.getComputer();
    }

}
