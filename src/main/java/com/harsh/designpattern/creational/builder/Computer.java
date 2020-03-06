package com.harsh.designpattern.creational.builder;

/**
 * This pattern overcome the problem of factory & abstract factory pattern.
 * because when we use this pattern we need to pass all the parameter even if those are optional
 * parameter.@refer factory & abstract pkgs.
 *
 * those pattern are good when there is not much complexity in object creation
 * by passing minimum no. of param
 *
 *in Builder pattern we call the method of chain and returning this object as return type
 * so by that way we are passing required param after we are calling setter method and finally
 * the constructor of parent classing getting called like below
 *
 * where Computer is parent class and ComputerBuilder is inner static class where
 * we are setting required param throuh constructor and option through setter and finally
 * in build() method calling
 */
 public class Computer {

     //required param
    private String hdd;
    private String ram;

    //optional param
    private boolean isGraphicsEnabled;
    private boolean isServer;

    @Override
    public String toString() {
        return "Computer{" +
                "hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                ", isGraphicsEnabled=" + isGraphicsEnabled +
                ", isServer=" + isServer +
                '}';
    }

    private Computer(ComputerBuilder builder){
        this.hdd=builder.hdd;
        this.ram=builder.ram;
        this.isGraphicsEnabled=builder.isGraphicsEnabled;
        this.isServer=builder.isServer;
    }

public static class ComputerBuilder{
    private String hdd;
    private String ram;

    private boolean isGraphicsEnabled;
    private boolean isServer;

    public ComputerBuilder(String hdd,String ram){
        this.hdd=hdd;
        this.ram=ram;
    }

    public ComputerBuilder setIsGraphicsEnabled(boolean isGraphicsEnabled) {
        this.isGraphicsEnabled = isGraphicsEnabled;
        return this;
    }

    public ComputerBuilder setIsServer(boolean isServer) {
        this.isServer = isServer;
        return this;
    }
    public Computer build(){
        return new Computer(this);
    }
}

}
