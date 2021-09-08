package ru.java.generics;

public class ParametrizedClass {
    public static void main(String[] args) {
        /*Info<String> info1 = new Info<>("Lana");
        System.out.println(info1);
        String s = info1.getValue();*/

        Info<Integer> info2 = new Info<>(21);
        System.out.println(info2);
        Integer i = info2.getValue();

        Info<Double> info21 = new Info<>(3.14);
        System.out.println(info21);
        Double di = info21.getValue();

        /*Info<Bus> info3 = new Info<>(new Bus());
        System.out.println(info3);
        Bus b1 = info3.getValue();*/
    }
}

class Info<T extends Number> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}

class Bus {

}
