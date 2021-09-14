package ru.java.multithreading;

import java.util.concurrent.ArrayBlockingQueue;

public class ABQEx1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
    }
}
