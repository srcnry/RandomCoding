package com.missingartifacts;

import java.util.Stack;

public class MyQueue<I extends Number> {

    public static Stack<Integer> stackIn;
    public static Stack<Integer> stackOut;

    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void enqueue(Integer value){
        if(stackIn != null) {
            stackIn.add(value);
        } else {
            System.out.println("Stack initialization failed!");
        }
    }

    public void dequeue(){
        if(!(stackIn.isEmpty() && stackOut.isEmpty())) {
            if(stackOut.isEmpty()) {
                while(!stackIn.isEmpty()) {
                    stackOut.add(stackIn.pop());
                }
            }
            stackOut.pop();
        } else {
            System.out.println("Stacks are both empty!");
        }
    }

    public Integer peek(){
        if(!stackOut.isEmpty()) {
            return stackOut.peek();
        } else {
            return  stackIn.firstElement();
        }
    }
}
