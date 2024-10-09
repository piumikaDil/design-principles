package org.example.open_close_principle;

import org.example.open_close_principle.DrivingMode;
import org.example.open_close_principle.Vehicle;

public class EventHandler {
    public Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(final DrivingMode drivingMode) {
        vehicle.setPower(drivingMode.getPower());
        vehicle.setSuspensionHeight(drivingMode.getSuspensionHeight());
    }
}
