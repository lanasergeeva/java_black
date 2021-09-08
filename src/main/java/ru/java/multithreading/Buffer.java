package ru.java.multithreading;

public class Buffer {
    private StringBuilder buffer = new StringBuilder();

    public void add() {
        synchronized (this) {
            System.out.println("lana");
            buffer.append("lana");
        }
    }

    @Override
    public String toString() {
        synchronized (this) {
            System.out.println("string");
            return buffer.toString();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R3());
        Thread thread2 = new Thread(new R4());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}

class R3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            new Buffer().add();
        }
    }
}

class R4 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            new Buffer().toString();
        }
    }
}
