package com.harsh.designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * This design pattern ensure that the deep/shall copy of old object ino new object
 * by making use of java cloning method.This DP mandate the
 */
public class PrototypePattern implements Cloneable {

    private ArrayList ar;

    public ArrayList getAr() {
        return ar;
    }

    public PrototypePattern() {
        ar = new ArrayList(5);
    }

    public PrototypePattern(ArrayList list) {
        ar = list;
    }

    public ArrayList loadData() {
        ar.add("Harshal");
        ar.add("Rambo");
        ar.add("Akhiliz");
        return ar;
    }

    @Override
    protected PrototypePattern clone() throws CloneNotSupportedException {
        ArrayList temp = new ArrayList(ar.size());
        temp.addAll(ar);
        return new PrototypePattern(temp);
    }
}
