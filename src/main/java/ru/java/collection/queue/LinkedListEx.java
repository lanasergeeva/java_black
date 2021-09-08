package ru.java.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Lana");
        queue.add("Oleg");
        queue.add("Mari");
        queue.add("Igor");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
    }
}
