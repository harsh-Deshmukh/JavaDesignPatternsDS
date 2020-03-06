package com.harsh.designpattern.structural.adaptor;

public interface SocketAdapter {

    public Volt get3Volt();
    public Volt get120Volt();
    public Volt get10Volt();
default Volt getVolt(int actual,int needed ){
    return  new Volt(actual/needed);
}
}
