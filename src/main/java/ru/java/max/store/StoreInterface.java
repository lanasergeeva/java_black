package ru.java.max.store;

public interface StoreInterface {
    User add(User user);
    boolean delId(int id);
    User searchId(int id);

}
