package ru.java.max.park;

public class BigCar implements Vehicle {
    private int size;

    public BigCar(int size) {
        this.size = size;
    }

    @Override
    public int sizeVehicle() {
        return size;
    }
}
