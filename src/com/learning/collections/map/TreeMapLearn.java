package com.learning.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapLearn {

    //print as we inserted not randomly
    public static void main(String[] args) {

        //sort on basis of key i.e alphabetic order

        Map<String, Integer> tm = new TreeMap<>();
        tm.put("One", 1);
        tm.put("Two", 2);
        tm.put("Three", 3);
        tm.put("Four", 4);
        tm.put("Five", 5);
        tm.put("Six", 6);

        System.out.println(tm);
        tm.remove("Three");

        System.out.println(tm.containsKey("One"));//checks if key is there or not
        System.out.println(tm.containsValue(6));//checks if value is there of not

        tm.putIfAbsent("Two", 56);//override value of key if not there

        System.out.println(tm.isEmpty());//check if map is empty
        tm.clear();//clear the map

    }
}
