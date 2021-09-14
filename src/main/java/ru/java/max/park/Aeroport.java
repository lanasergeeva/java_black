package ru.java.max.park;

import java.util.LinkedList;
import java.util.List;

public class Aeroport implements Place {
    private final List<Vehicle> planes = new LinkedList<>();

    @Override
    public boolean sort(Vehicle vehicle) {
        boolean rsl = false;
        if (vehicle.sizeVehicle() > 5) {
            planes.add(vehicle);
        }
        return false;
    }
}
