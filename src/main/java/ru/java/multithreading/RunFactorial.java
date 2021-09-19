package ru.java.multithreading;

import java.util.concurrent.*;

public class RunFactorial {
    static int facRes;


    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
        //executorService.execute(factorial);
        Future future = executorService.submit(factorial);
        executorService.shutdown();
        executorService.awaitTermination(20, TimeUnit.SECONDS);
        System.out.println(future.get());
        System.out.println(facRes);
    }
}

class Factorial implements Runnable {
    private int f;

    public Factorial(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("Wrong number");
            return;
        }
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res *= i;
        }
        RunFactorial.facRes = res;
    }
}

