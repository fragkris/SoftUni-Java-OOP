package Inheritance.needForSpeed;

public class Car extends Vehicle{
    protected final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
