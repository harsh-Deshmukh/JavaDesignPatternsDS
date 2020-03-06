package com.harsh.designpattern.structural.adaptor;

public class SocketObjectAdapter implements SocketAdapter {
    Socket socket=new Socket();
    @Override
    public Volt get3Volt() {
        return getVolt(socket.getVolt().getVolts(),40);
    }

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get10Volt() {
        return getVolt(socket.getVolt().getVolts(),12);
    }
}
