package com.harsh.designpattern.behavirol.iterator.example;

public interface Collection {
    public void add(Notification s);
    public void remove(Notification e);
    public Iterator iterator();
}
