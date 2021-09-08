package ru.java.nested.local;

public class Localinner2 {
    public static void main(String[] args) {
        class Slogenie implements Math2 {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }
        Slogenie s = new Slogenie();
        System.out.println(s.doOperation(5, 3));
    }
}

interface Math2 {
    int doOperation(int a, int b);
}
