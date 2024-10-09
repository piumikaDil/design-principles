package org.example.open_close_principle;

public class ComfortMode implements DrivingMode{
    @Override
    public int getPower() {
        return 400;
    }

    @Override
    public int getSuspensionHeight() {
        return 20;
    }
}
