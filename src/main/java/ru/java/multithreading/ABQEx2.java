package ru.java.multithreading;

import java.util.concurrent.ArrayBlockingQueue;

public class ABQEx2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue
                = new ArrayBlockingQueue<>(4);
        //Producer
        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    queue.put(++i);
                    System.out.println("Add number " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        //Consumer
        new Thread(() -> {
            int i = 0;
            while (true) {
                try {
                    Integer j = queue.take();
                    System.out.println("Take number " + j);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
