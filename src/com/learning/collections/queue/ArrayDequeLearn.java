package com.learning.collections.queue;

import java.util.ArrayDeque;

public class ArrayDequeLearn {

    public static void main(String args[]){

        /*
        A queue in which you can place element from front and rear
        A queue in which you can remove element from front and rear
        A queue in which you can check element from front and reat
         */

        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);//element will be added normally as queue works
        adq.offerFirst(12);//element will be added at starting
        adq.offer(45);
        adq.offerLast(77);//element will be added at last

        System.out.println(adq);

        System.out.println(adq.peek());//displays element normally as queue works
        System.out.println(adq.peekFirst());//displays first element of queue
        System.out.println(adq.peekLast());//display last element of queue

        System.out.println(adq.poll());//removes element form queue normally
        System.out.println(adq);
        System.out.println(adq.pollFirst());//removes first element from queue
        System.out.println(adq);
        System.out.println(adq.pollLast());//removes last element from queue
        System.out.println(adq);
    }
}
