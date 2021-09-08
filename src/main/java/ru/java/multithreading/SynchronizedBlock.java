package ru.java.multithreading;

public class SynchronizedBlock {
    public static void main(String[] args) {
        MyRun2 run2 = new MyRun2();
        Thread thread1 = new Thread(run2);
        Thread thread2 = new Thread(run2);
        Thread thread3 = new Thread(run2);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Counter2 {
    static int count = 0;
}

class MyRun2 implements Runnable {

    private void dowork2() {
        System.out.println("dowork2");
    }

    public void dowork1() {
        dowork2();
        synchronized (this) {
            Counter.count++;
            System.out.println(Counter.count + " ");
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            dowork1();
        }
    }
}
