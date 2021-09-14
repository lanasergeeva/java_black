package ru.java.max.park;

public class Car implements Vehicle {
    private int size;

    public Car() {
        this.size = 1;
    }

    @Override
    public int sizeVehicle() {
        return size;
    }
}
