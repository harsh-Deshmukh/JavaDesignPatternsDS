package com.harsh.designpattern.structural.adaptor;

public class TestAdopterPattern {
    public static void main(String[] args) {
        testSocketClassAdapter();
        testSocketObjectAdapter();
    }

    private static void testSocketClassAdapter() {
        SocketAdapter sca = new SocketClassAdapter();
        System.out.println("V3 volt using adaptor: "+getVolt(sca,3).getVolts());
        System.out.println("V10 volt using adaptor: "+getVolt(sca,10).getVolts());
        System.out.println("V120 volt using adaptor: "+getVolt(sca,120).getVolts());
    }

    private static void testSocketObjectAdapter() {
        SocketAdapter soa = new SocketObjectAdapter();
        System.out.println("V3 volt using adaptor: "+getVolt(soa,3).getVolts());
        System.out.println("V10 volt using adaptor: "+getVolt(soa,10).getVolts());
        System.out.println("V120 volt using adaptor: "+getVolt(soa,120).getVolts());
    }

    public  static Volt getVolt(SocketAdapter soa,int i){
        switch(i){
            case 3: return soa.get3Volt();
            case 10: return  soa.get10Volt();
            case 120:return  soa.get120Volt();
            default:return soa.get120Volt();
        }
    }
}
