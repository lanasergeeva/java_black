package ru.java.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
   // private static int counter = 0;
    private static AtomicInteger counter = new AtomicInteger(0);

    public synchronized static void increment() {
       // counter++;
        counter.addAndGet(5);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new RunAtInt());
        Thread thread2 = new Thread(new RunAtInt());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class RunAtInt implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            AtomicIntegerExample.increment();
        }
    }
}