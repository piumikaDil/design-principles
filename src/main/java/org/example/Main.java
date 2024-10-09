package org.example;

import org.example.SRP.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(100);

        System.out.println("Initial Fuel level: " + vehicle.getRemainingFuel() + "/" + vehicle.getMaxFuel());

        vehicle.accelerate();
        vehicle.accelerate();
        System.out.println("Fuel after accelerating twice: " + vehicle.getRemainingFuel() + "/" + vehicle.getMaxFuel());

        vehicle.refuel();
        System.out.println("Fuel after refueling: " + vehicle.getRemainingFuel() + "/" + vehicle.getMaxFuel());
    }
}






