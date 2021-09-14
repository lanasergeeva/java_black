package ru.java.multithreading;

public class DeadlockEx {
    public static final Object LOCK1 = new Object();
    public static final Object LOCK2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread10: попытка захватить монитор объекта lock1");
        synchronized (DeadlockEx.LOCK1) {
            System.out.println("монитор объекта lock1 захвачен");
            System.out.println("Thread10: попытка захватить монитор объекта lock2");
            synchronized (DeadlockEx.LOCK2) {
                System.out.println("монитор объектов lock1 lock2 захвачен");
            }
        }
    }
}

class Thread20 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread20: попытка захватить монитор объекта lock2");
        synchronized (DeadlockEx.LOCK2) {
            System.out.println("thread20 монитор объекта lock2 захвачен");
            System.out.println("Thread20: попытка захватить монитор объекта lock1");
            synchronized (DeadlockEx.LOCK1) {
                System.out.println("thread 20 монитор объектов lock1 lock2 захвачен");
            }
        }
    }
}
