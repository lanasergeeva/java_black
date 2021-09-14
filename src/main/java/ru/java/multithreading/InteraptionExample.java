package ru.java.multithreading;

public class InteraptionExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        IntThread thread = new IntThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

        thread.join();
        System.out.println("main ends");
    }
}

class IntThread extends Thread {
    private double sqrSum = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 1000000; i++) {
            if (isInterrupted()) {
                System.out.println("Potok nado prervat");
                System.out.println("Vse ok. Preruvaem");
                return;
            }
            sqrSum += Math.sqrt(i);
            try {
                sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Poto hotyt prervat vo vremya sna");
                System.out.println(sqrSum);
                return;
            }
        }
    }
}
