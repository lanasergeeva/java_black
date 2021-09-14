package ru.java.max.store;

public class User {
    private int id;
    private String name;
    private String phoneNumb;

    public User(int id, String name, String phoneNumb) {
        this.id = id;
        this.name = name;
        this.phoneNumb = phoneNumb;
    }

    public int getId() {
        return id;
    }
}
