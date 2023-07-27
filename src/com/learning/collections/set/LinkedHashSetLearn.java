package com.learning.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashSetLearn {
    /*
    Almost same as Hash Set
    Order will be one by one it means order will be same as we added
    all properties of hashset and linked hash set will be same
     */
    public static void main(String args[]){

        Set<Integer> set = new LinkedHashSet<>();
        set.add(32);//add element in set
        set.add(45);
        set.add(98);
        set.add(33);
        set.add(45);

        System.out.println(set);

        set.remove(98);//remove a element in set
        System.out.println(set);

        System.out.println(set.contains(45));//check if element is in set
        System.out.println(set.contains(44));

        System.out.println(set.isEmpty());//check if set is empty

        System.out.println(set.size());//returns the size of set

        set.clear();//clears the set fully
        System.out.println(set);

    }
}
