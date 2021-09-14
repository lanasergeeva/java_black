package ru.java.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Lana", lock);
        new Employee("Max", lock);
        new Employee("Valera", lock);
        Thread.sleep(5000);
        new Employee("Oleg", lock);
        new Employee("Petr", lock);
    }
}

class Employee extends Thread {
    private final String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
                //System.out.println(name + " is waiting");
                //lock.lock();
                System.out.println(name + " is using bank");
                Thread.sleep(2000);
                System.out.println(name + " finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " can't wait");
        }
    }
}
