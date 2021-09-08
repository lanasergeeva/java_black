package ru.java.collection.queue;

import java.util.Deque;

public class ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new java.util.ArrayDeque<>();
        dq.addFirst(3);
        dq.addFirst(5);
        dq.addLast(7);
        dq.offerFirst(1);
        dq.offerLast(8);
        System.out.println(dq);
        System.out.println("**************");
        System.out.println(dq.removeFirst());
        System.out.println(dq);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq.removeLast());
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq);
        System.out.println(dq.removeLast());
        System.out.println(dq);

    }
}
