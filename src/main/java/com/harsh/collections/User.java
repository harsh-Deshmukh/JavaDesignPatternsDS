package com.harsh.collections;

public class User {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public User(int i, String name) {
        this.i = i;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        User user=(User) obj;
        if(this==obj){
            System.out.println("referring same");
            return  true;
        }
        if(this.getI()==user.getI() && this.getName().equals(user.getName()))
        {
            System.out.println("state same->"+user);
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        System.out.println("in User hashCOde() ");
        return 1;
    }

    @Override
    public String toString() {
        return "["+getI()+","+getName()+"]";
    }
}
