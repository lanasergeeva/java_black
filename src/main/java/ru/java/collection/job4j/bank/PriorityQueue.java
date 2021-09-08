package ru.java.collection.job4j.bank;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task2> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     */
    public void put(Task2 task) {
        int index = 0;
        for (Task2 element : tasks) {
            if (element.getPriority() > task.getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
    }

    public Task2 take() {
        return tasks.poll();
    }
}
