package com.harsh.designpattern.behavirol.iterator.example;

public class NotificationIterationPatternTest {
    public static  void main(String[] args){
        Collection notificationList=populateNotification();
        Iterator iterator=notificationList.iterator();
        while(iterator.hasNext()){
            Notification n=iterator.next();
            System.out.println(n);
        }
    }

    private static Collection populateNotification() {
        CollectionImpl collection=new CollectionImpl();
        collection.add(new Notification("Order Received"));
        collection.add(new Notification("Order Confirmed"));
        collection.add(new Notification("Order Packed"));
        collection.add(new Notification("Order shift"));
        collection.add(new Notification("Order delivered"));
        return collection;
    }
}
