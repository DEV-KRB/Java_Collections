package com.learning.collections.map;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class HashMapLearn {

    //print randomly
    public static void main(String[] args) {

        Map<String,Integer> num = new HashMap<>();
        num.put("one", 34);
        num.put("two", 55);
        num.put("one", 15);// it will override the key value
        num.put("three", 95);

        if(!num.containsKey(34)){//check if key is there
            num.put("one", 555);
        }

        System.out.println(num.containsValue(8));//check if value is there

        num.putIfAbsent("Two", 34);//same behavior as put with condition

        System.out.println(num.isEmpty());//check whether map is empty or not
        num.clear();// to clear the map

        System.out.println(num);

        num.put("One", 1);
        num.put("Two", 2);
        num.put("Three", 3);
        num.put("Four", 4);
        num.put("Five", 5);
        num.put("Six", 6);

        for(Map.Entry<String, Integer> e: num.entrySet()){//printing keys and values

            System.out.println(e);//print everything in map
            System.out.println(e.getKey());//print key
            System.out.println(e.getValue());//print value
        }

        for(String key:num.keySet()){//for printing all keys
            System.out.println(key);
        }

        for(Integer value: num.values()){//to print all values
            System.out.println(value);
        }

    }
}
