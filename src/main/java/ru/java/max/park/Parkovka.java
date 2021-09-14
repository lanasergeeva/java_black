package ru.java.max.park;

public class Parkovka implements Place {
    private final Vehicle[] allVechicle;
    private int placeCar;
    private int placeBigCar;
    private int index = 0;
    private int indexCar = 0;
    private int indexBigCar = 0;

    public Parkovka(int placeCar, int placeBigCar) {
        this.placeCar = placeCar;
        this.placeBigCar = placeBigCar;
        this.allVechicle = new Vehicle[placeCar + placeBigCar];
    }

    @Override
    public boolean sort(Vehicle vehicle) {
        boolean result = false;
        if (vehicle.sizeVehicle() == 1 && indexCar < placeCar) {
            allVechicle[index] = vehicle;
            index++;
            indexCar++;
            result = true;
        } else if (vehicle.sizeVehicle() > 1 && indexBigCar < placeBigCar) {
            allVechicle[index] = vehicle;
            index++;
            indexBigCar++;
            result = true;
        } else if (allVechicle.length - index >= vehicle.sizeVehicle()) {
            indexBigCar++;
            for (int i = 0; i < vehicle.sizeVehicle(); i++) {
                allVechicle[index] = vehicle;
                placeCar--;
            }
            result = true;
        }
        return result;
    }
}
