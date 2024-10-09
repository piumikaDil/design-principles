package org.example.SRP;

public class FuelManager {

    private final int maxFuel;
    private int remainingFuel;

    public FuelManager(final int maxFuel) {
        this.maxFuel = maxFuel;
        this.remainingFuel = maxFuel;
    }

    public void refuel() {
        remainingFuel = maxFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void consumeFuel() {
        if (remainingFuel > 0) {
            remainingFuel--;
        } else {
            System.out.println("No fuel left!");
        }
    }
}