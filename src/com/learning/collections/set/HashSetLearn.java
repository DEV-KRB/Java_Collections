package com.learning.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetLearn {

    /*
    Set does not allow duplicate element
    order of element is random
    Its like a bag in which we are placing items
     */
    public static void main(String args[]){

        Set<Integer> set = new HashSet<>();
        set.add(32); //add element in set
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
