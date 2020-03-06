package com.harsh.designpattern.behavirol.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hdeshmukh
 * @since 2019
 *
 * Iterator pattend provide a way to traverse through the elements of aggregate object
 * without exposing internal implementaion of iterator.
 *
 * here we have 2 interfaces 1 for collection method 2 for iterator method and there is
 * 1 class implemntation Collection interface and which has inner private class
 * implementing iterator interface.
 *
 * also refer @see{@link com.harsh.designpattern.behavirol.iterator.example.NotificationIterationPatternTest}
 *
 *
 */
public class ChannelCollectionImpl implements ChannelColletion {

    private List<Channel> channelList;

    public ChannelCollectionImpl() {
        channelList = new ArrayList<Channel>();
    }

    @Override
    public void addChnnel(Channel c) {
        this.channelList.add(c);
    }

    @Override
    public void removeChannel(Channel c) {
        this.channelList.remove(c);
    }

    @Override
    public ChannelIterator iterator(ChannelEnumType type) {
        return new ChannelIteratorImpl(type, this.channelList);
    }

    private class ChannelIteratorImpl implements ChannelIterator {

        private ChannelEnumType type;
        private List<Channel> channels;
        private int position;

        public ChannelIteratorImpl(ChannelEnumType ty, List<Channel> channelList) {
            type = ty;
            channels = channelList;
        }

        @Override
        public boolean hasNext() {
            while (position < channels.size()) {
                Channel c = channels.get(position);
                if (c.getType().equals(type) || type.equals(ChannelEnumType.ALL)) {
                    return true;
                } else
                    position++;
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = channels.get(position);
            position++;
            return c;
        }
    }
}
