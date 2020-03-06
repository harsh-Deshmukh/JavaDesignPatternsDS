package com.harsh.designpattern.creational.Factory;

public  abstract class Computer {

    public abstract String getRam();

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + getRam() + '\'' +
                ", hdd='" + getHdd() + '\'' +
                ", cpu='" + getCpu() + '\'' +
                '}';
    }

    public abstract String getHdd() ;
    public abstract String getCpu();



   }
