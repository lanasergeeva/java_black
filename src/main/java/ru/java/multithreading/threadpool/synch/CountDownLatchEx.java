package ru.java.multithreading.threadpool.synch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLat = new CountDownLatch(3);

    private static void marketStaffOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLat.countDown();
        System.out.println("countDownLatch = " + countDownLat.getCount());
    }

    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Ready. Let's do shopping!");
        countDownLat.countDown();
        System.out.println("countDownLatch = " + countDownLat.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        countDownLat.countDown();
        System.out.println("countDownLatch = " + countDownLat.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friends("Lana", countDownLat);
        new Friends("Max", countDownLat);
        new Friends("Oleg", countDownLat);
        new Friends("Misha", countDownLat);
        new Friends("Egor", countDownLat);

        marketStaffOnPlace();
        everythingIsReady();
        openMarket();
    }
}

class Friends extends Thread {
    private String name;
    private CountDownLatch countDownLatch;

    public Friends(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " is going shopping");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}