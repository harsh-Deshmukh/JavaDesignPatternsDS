package com.harsh.designpattern.creational.builder;

public class TestComputerBuilder {

    public static void main(String[] args){

        Computer computer=new Computer.ComputerBuilder("500GB","32GB")
                                      .setIsGraphicsEnabled(true)
                                      .setIsServer(true)
                                      .build();
        System.out.println(computer);

    }
}
