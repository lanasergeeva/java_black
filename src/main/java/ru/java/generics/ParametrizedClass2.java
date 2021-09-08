package ru.java.generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
       /* Pair<String, Integer> pair = new Pair<>("Lana", 21);
        System.out.println(pair.getValue1() + pair.getValue2());

        OtherPair<String> op = new OtherPair<>("lana", "molodec");
        System.out.println(op.getValue1() + op.getValue2());*/
    }

    /** 'мы не можем создавать перегруженные методы
     * public void abc(Info<String>info) {
        String s = info.getValue();
    }
    public void abc(Info<Integer>info) {
        Integer i = info.getValue();
    }*/
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public void setValue1(V1 value1) {
        this.value1 = value1;
    }

    public V2 getValue2() {
        return value2;
    }

    public void setValue2(V2 value2) {
        this.value2 = value2;
    }
}

class OtherPair<V> { //если используем одиннаковый тип
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public <V> V abc(V val) {
        return val;
    }

    public V getValue1() {
        return value1;
    }

    public void setValue1(V value1) {
        this.value1 = value1;
    }

    public V getValue2() {
        return value2;
    }

    public void setValue2(V value2) {
        this.value2 = value2;
    }
}

/*
class Parent {
    public void abc(Info<String>info) {
        String s = info.getValue();
    }
}

class Child extends Parent {
    public void abc(Info<Integer>info) {
        Integer i = info.getValue();
    }
}
*/


