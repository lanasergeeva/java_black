package ru.java.collection.setinterface;

import java.util.Iterator;

public class IterForIter<I extends Number, T extends Iterator<I>> implements Iterator {
    private T[] iterators;
    private int index = 0;

    public IterForIter(T[] object) {
        this.iterators = object;
    }

    /**
     * КАЖДЫЙ РАЗ ВОЗВРАЩАЕТ КАКОЙ-ТО ИЗ ЭЛЕМЕНТОВ МАССИВА
     *
     * @return элеметн из массива
     */
    @Override
    public boolean hasNext() {
        return iterators[index].hasNext() || !lastIterator();
    }

    private boolean lastIterator() {
        return !(index + 1 < iterators.length);
    }

    @Override
    public I next() {
        if (iterators[index].hasNext()) {
            return iterators[index].next();
        } else {
            return iterators[++index].next();
        }
    }

    public static void main(String[] args) {
        TestIterator<Integer> i1 = new TestIterator<>(new Integer[]{1, 2, 3});
        TestIterator<Integer> i2 = new TestIterator<>(new Integer[]{7, 8, 9});
        IterForIter<Integer, Iterator<Integer>> iT =
                new IterForIter<>(new TestIterator[]{i1, i2});
        while (iT.hasNext()) {
            Integer i = iT.next();
            System.out.println(i);
        }
    }
}


