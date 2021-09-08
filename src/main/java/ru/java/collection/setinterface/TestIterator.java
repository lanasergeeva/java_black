package ru.java.collection.setinterface;

import java.util.Iterator;

public class TestIterator<T extends Number> implements Iterator {
    private T[] object;
    private int index = 0;

    public TestIterator(final T[] object) {
        this.object = object;
    }

    /**
     * КАЖДЫЙ РАЗ ВОЗВРАЩАЕТ КАКОЙ-ТО ИЗ ЭЛЕМЕНТОВ МАССИВА
     *
     * @return элеметн из массива
     */
    @Override
    public boolean hasNext() {
        return index < object.length;
    }

    @Override
    public Object next() {
        return object[index++];
    }

    public static void main(String[] args) {
        Integer[] array = {1, 3, 4, 5};
        TestIterator ti = new TestIterator(array);

        while (ti.hasNext()) {
            Integer i = (Integer) ti.next();
            System.out.println(i);
        }
    }
}
