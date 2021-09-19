package ru.java.multithreading.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolSchedule {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);
  /*      for (int i = 0; i < 10; i++) {
            scheduledExecutorService.execute(new RunnableImpl200());
        }*/
        //scheduledExecutorService.schedule(new RunnableImpl200(), 3, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);
        //scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);
        Thread.sleep(20000);

        scheduledExecutorService.shutdown();
    }
}

class RunnableImpl200 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begin work");
   /*     try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println(Thread.currentThread().getName() + " end work");
    }
}
