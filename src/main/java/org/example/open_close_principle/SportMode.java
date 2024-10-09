package org.example.open_close_principle;

public class SportMode implements DrivingMode{
    @Override
    public int getPower() {
        return 500;
    }

    @Override
    public int getSuspensionHeight() {
        return 10;
    }
}
