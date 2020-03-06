package com.harsh.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class MapType1 {
    public static void main(String[] args) {
        MapType1 map = new MapType1();
        map.hashMap();
        map.linkedHashMap();
    }

    private void hashMap() {
        HashMap hm = new HashMap();
        hm.put("1", "Harshal");
        hm.put("7", "Harshal");
        hm.put("1", "sumit");
        System.out.println("HasMap" + hm);
    }

    //Overided equals and hashcode
    private void linkedHashMap() {
        LinkedHashMap lhm = new LinkedHashMap();
        User e = new User(1, "user");

        lhm.put(e, "Harshal");
        lhm.put(new User(1, "Employee"), "Harshal");
        lhm.put(new User(1, "user"), "Harshal");
        lhm.put(e, "Sumit");

        System.out.println(lhm);
        lhm.putIfAbsent(new User(2,"Harshal"),"Added new val");
        lhm.putIfAbsent(new User(2,"Harshal"),"Added new val");

        lhm.keySet().removeIf(key->((User)key).equals(new User(2,"Harshal")));
        System.out.println(lhm);
    }
}
