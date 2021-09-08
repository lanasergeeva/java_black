package ru.java.collection.queue;

import java.util.PriorityQueue;

public class ProiorityQueueEx1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(4);
        pq.add(1);
        pq.add(7);
        pq.add(10);
        pq.add(8);

        System.out.println(pq.peek());
    }
}
