package com.harsh.designpattern.behavirol.iterator.example;

public class Notification {

    private String notification;

    public Notification(String notification) {
        this.notification = notification;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notification='" + notification + '\'' +
                '}';
    }

    public String getNotification() {
        return notification;
    }
}
