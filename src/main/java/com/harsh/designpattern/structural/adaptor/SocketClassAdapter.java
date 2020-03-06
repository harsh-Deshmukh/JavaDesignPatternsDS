package com.harsh.designpattern.structural.adaptor;

public class SocketClassAdapter extends Socket implements SocketAdapter {
    @Override
    public Volt get3Volt() {
        return getVolt(get120Volt().getVolts(), 40);
    }

    @Override
    public Volt get120Volt() {
        return new Volt(120);
    }

    @Override
    public Volt get10Volt() {
        return getVolt(get120Volt().getVolts(), 12);
    }

}
