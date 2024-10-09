package org.example.SRP;

public class Vehicle {

    private final FuelManager fuelManager;

    public Vehicle(final int maxFuel) {
        this.fuelManager = new FuelManager(maxFuel);
    }

    public void accelerate() {
        fuelManager.consumeFuel();
    }

    public void refuel() {
        fuelManager.refuel();
    }

    public int getRemainingFuel() {
        return fuelManager.getRemainingFuel();
    }

    public int getMaxFuel() {
        return fuelManager.getMaxFuel();
    }
}
