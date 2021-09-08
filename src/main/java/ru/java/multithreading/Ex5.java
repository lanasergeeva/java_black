package ru.java.multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 my = new MyThread5();
        my.setName("potok1");
        my.setPriority(8);
        System.out.println("Name of my = " + my.getName()
                + " Priority of my = " + my.getPriority());
        MyThread5 my1 = new MyThread5();
        my1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Name of my = " + my1.getName()
                + " Priority of my = " + my1.getPriority());
    }
}

class MyThread5 extends Thread {
    @Override
    public void run() {
        System.out.println("privet");
    }
}