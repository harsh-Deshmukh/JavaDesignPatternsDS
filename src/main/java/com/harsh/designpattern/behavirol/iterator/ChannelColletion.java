package com.harsh.designpattern.behavirol.iterator;

public interface ChannelColletion {
    public void addChnnel(Channel c);
    public void removeChannel(Channel c);
    public ChannelIterator iterator(ChannelEnumType type);
}
