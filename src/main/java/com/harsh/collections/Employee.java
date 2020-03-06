package com.harsh.collections;

public class Employee implements Comparable{

    private int eid;
    private String name;

    public Employee(int i, String name) {
        this.eid=i;
        this.name=name;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        System.out.println("Calling compareTo(.)");
        return this.getEid()-((Employee)o).getEid();
    }

    @Override
    public String toString() {
        return "["+getEid()+","+getName()+"]";
    }
}
