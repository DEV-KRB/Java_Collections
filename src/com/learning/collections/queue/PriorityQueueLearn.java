package com.learning.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueLearn {

    public static void main(String args[]){

        /*
        Whenever we want to implement queue but wants to give priority to a particular queue

         */

        Queue<Integer> pq = new PriorityQueue<>();//will give priority to minimum element by default
        pq.offer(329);
        pq.offer(58);
        pq.offer(617);

        System.out.println(pq);//displays the minimum number at first
        System.out.println(pq.peek());// element which is pointed at and is going to remove will be displayed
        pq.poll();// that element will remove whose priority is much it means which is minimum
        System.out.println(pq);

        Queue<Integer> maxpq = new PriorityQueue<>(Comparator.reverseOrder());//will give priority to maximum element
        maxpq.offer(85);
        maxpq.offer(788);
        maxpq.offer(23);

        System.out.println(maxpq);
        System.out.println(maxpq.peek());
        maxpq.poll();
        System.out.println("The Queue is: " +maxpq);
    }
}
