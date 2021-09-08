package ru.java.collection.job4j.bank;

import java.util.HashSet;
import java.util.List;

public class Task {
    private String number;
    private String description;

    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }
}

class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task t : list) {
            numbers.add(t.getNumber());
        }
        return numbers;
    }
}
