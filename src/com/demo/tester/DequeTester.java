package com.demo.tester;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTester {
    public static void main(String[] args) {
        stackImplimentation();
        queueImplementation();
    }

    static void queueImplementation(){
        Deque<Integer> stack = new ArrayDeque<>();
        stack.offer(11);
        stack.offer(43);
        stack.offer(9);
        stack.offer(21);
        stack.offer(34);

        System.out.println(stack);
//        System.out.println(stack.peekFirst());
//        System.out.println(stack.peekLast());

        stack.poll();
        System.out.println(stack);
        stack.poll();
        System.out.println(stack);
    }

    static void stackImplimentation(){
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(11);
        stack.push(43);
        stack.push(9);
        stack.push(21);
        stack.push(34);

        System.out.println(stack);
//        System.out.println(stack.peekFirst());
//        System.out.println(stack.peekLast());

        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
