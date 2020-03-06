package com.harsh.designpattern.behavirol.iterator.example;

import java.util.ArrayList;
import java.util.List;

public class CollectionImpl implements Collection {

    List<Notification> notificationList;

    public CollectionImpl() {
        notificationList = new ArrayList<Notification>();
    }

    @Override
    public void add(Notification s) {
        this.notificationList.add(s);
    }

    @Override
    public void remove(Notification c) {
        this.notificationList.remove(c);
    }

    @Override
    public Iterator iterator() {
        return new NotificationIterator(this.notificationList);
    }

    private class NotificationIterator implements Iterator {

        private int position;
        private List<Notification> list;

        public NotificationIterator(List<Notification> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            if (position < list.size()) {

                return true;
            }
            return false;
        }

        @Override
        public Notification next() {
            Notification notification = list.get(position);
            position++;
            return notification;
        }
    }
}
