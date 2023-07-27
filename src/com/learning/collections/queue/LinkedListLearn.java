package com.learning.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListLearn {

    public static void main(String args[]){

        /*
         queue is first in first out
         front-remove
         rear-add
         you can implement queue either by array and linked list
         queue is a interface
         */

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);// adds the new element at first
        queue.offer(34);
        queue.offer(54);

        System.out.println(queue);

        System.out.println(queue.poll());//removes the first element, if queue is empty returns null

        System.out.println(queue);

        System.out.println(queue.peek());//displays the pointed element, if queue is empty returns null

        /*  queue.add(); It adds new element but throws exception if unsuccessful
            queue.element(); It returns the pointed element/head element but throws exception if queue is empty
            queue.remove(); It removes the element but throws exception if queue is empty
         */
    }
}
