package com.learning.collections.list;

import java.util.Stack;

public class stackLearn {

    /* Last in First out
        the element which we put at last it will be removed first
        three functions--push(), peek(), pop().
     */

    public static void main(String args[]){
        Stack<String> animals = new Stack<>();
        animals.push("cat");
        animals.push("lion");
        animals.push("dog");//add the element in stack

        System.out.println("Stack is" +animals);

        System.out.println(animals.peek());// displays which element is at top

        animals.pop();//remove the element at top

        System.out.println("new stack is" + animals);
        System.out.println(animals.peek());
    }
}
