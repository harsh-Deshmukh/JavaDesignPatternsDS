package com.harsh.designpattern.behavirol.iterator;

public class IteratorPatternTest {

    public static void main(String[] args) {
        ChannelColletion colletion = populateChannels();
        ChannelIterator iterator = colletion.iterator(ChannelEnumType.ENGLISH);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    private static ChannelColletion populateChannels() {
        ChannelColletion colletion = new ChannelCollectionImpl();
        colletion.addChnnel(new Channel(67.4, ChannelEnumType.ENGLISH));
        colletion.addChnnel(new Channel(94.5, ChannelEnumType.HINDI));
        colletion.addChnnel(new Channel(33.3, ChannelEnumType.HINDI));
        colletion.addChnnel(new Channel(24.5, ChannelEnumType.ENGLISH));
        colletion.addChnnel(new Channel(98.8, ChannelEnumType.MARATHI));
        colletion.addChnnel(new Channel(78.6, ChannelEnumType.ENGLISH));
        colletion.addChnnel(new Channel(44.8, ChannelEnumType.MARATHI));
        colletion.addChnnel(new Channel(88.55, ChannelEnumType.ENGLISH));
        colletion.addChnnel(new Channel(76.12, ChannelEnumType.HINDI));
        colletion.addChnnel(new Channel(55.1, ChannelEnumType.MARATHI));
        colletion.addChnnel(new Channel(43.6, ChannelEnumType.ENGLISH));
        colletion.addChnnel(new Channel(45.9, ChannelEnumType.MARATHI));
        return colletion;
    }
}
