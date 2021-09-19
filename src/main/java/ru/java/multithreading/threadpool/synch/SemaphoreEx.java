package ru.java.multithreading.threadpool.synch;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Lana", callBox);
        new Person("Ira", callBox);
        new Person("Oleg", callBox);
        new Person("Petr", callBox);
        new Person("Sasha", callBox);
    }
}

class Person extends Thread {
    private String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    public void run() {
        try {
            System.out.println(name + " is waiting");
            callBox.acquire();
            System.out.println(name + " is using phone");
            sleep(2000);
            System.out.println(name + " finish");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }
}
