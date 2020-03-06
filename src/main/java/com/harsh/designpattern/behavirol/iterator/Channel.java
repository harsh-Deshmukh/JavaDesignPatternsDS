package com.harsh.designpattern.behavirol.iterator;

public class Channel {

    private double frequency;
    private ChannelEnumType type;

    public double getFrequency() {
        return frequency;
    }

    public ChannelEnumType getType() {
        return type;
    }

    public Channel(double frequency, ChannelEnumType type) {
        this.frequency = frequency;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "frequency=" + frequency +
                ", type=" + type +
                '}';
    }
}
