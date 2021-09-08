package ru.java.multithreading;

public class Ex10 {
    public static void main(String[] args) {
        MyRun run = new MyRun();
        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        Thread thread3 = new Thread(run);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Counter {
    static int count = 0;
}

class MyRun implements Runnable {
    public synchronized void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            increment();
        }
    }
}
