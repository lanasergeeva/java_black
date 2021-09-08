package ru.java.multithreading;

public class Ex12 {
    static final Object LOCK = new Object();

    void mobileCall() {
        synchronized (LOCK) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

    void skypeCall() {
        synchronized (LOCK) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call ends");
        }
    }

    void waCall() {
        synchronized (LOCK) {
            System.out.println("wa call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("wa call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunMobileCall());
        Thread thread2 = new Thread(new RunSkypeCall());
        Thread thread3 = new Thread(new RunWaCall());
        thread1.start();
        thread2.start();
        thread3.start();


    }
}

class RunMobileCall implements Runnable {
    public void run() {
        new Ex12().mobileCall();
    }
}

class RunSkypeCall implements Runnable {
    public void run() {
        new Ex12().skypeCall();
    }
}

class RunWaCall implements Runnable {
    public void run() {
        new Ex12().waCall();
    }
}

class Car {

}