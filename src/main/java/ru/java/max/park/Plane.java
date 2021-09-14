package ru.java.max.park;

public class Plane implements Vehicle {
    private int size;
    private String company;

    public Plane(int size, String company) {
        this.size = size;
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public int sizeVehicle() {
        return size;
    }
}
