package com.learning.collections.list;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListLearn {

    public static void main(String args[]) {
       /* ArrayList<String> studentName = new ArrayList<>();
        studentName.add("Rakesh");
        System.out.println(studentName);
       */

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);

        list.add(1, 23);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(213);
        newList.add(332);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(2));

        List<Integer> updateList = new ArrayList<>();
        updateList.add(11);
        updateList.add(111);
        updateList.add(112);
        updateList.add(12);
        updateList.add(13);
        updateList.add(113);
        updateList.add(114);
        updateList.add(14);
        updateList.add(15);
        updateList.add(115);
        updateList.add(16);
        updateList.add(123);

        updateList.set(2, 2000);//will update the value given from index
        updateList.remove(11);//remove value from particular index
        updateList.remove(Integer.valueOf(16)); //remove direct value
        System.out.println(updateList.contains(500));//check if the element is there or not
        //updateList.clear();
        System.out.println(updateList);
        for(int i=0; i<list.size();i++){
            System.out.println(updateList.get(i));
        }

        for(Integer element:updateList){

            System.out.println("foreach element is: "+ element);
        }

        Iterator<Integer> it = updateList.iterator();
        while(it.hasNext()){
            System.out.println("iterator" + it.next());//access the next value
        }
    }
}
