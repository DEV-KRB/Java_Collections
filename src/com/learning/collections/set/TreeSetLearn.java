package com.learning.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLearn {
    /*
    Inherit all properties of set and linked hashset
    It do everything behind the scene in sorted form
    implements sorted form like binary search tree
     */

    public static void main(String args[]) {
        Set<Integer> set = new TreeSet<>();
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
