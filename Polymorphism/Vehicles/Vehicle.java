package Polymorphism.Vehicles;

import java.text.DecimalFormat;

public class Vehicle implements IVehicle{
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.setFuelConsumption(fuelConsumption);
        this.setTankCapacity(tankCapacity);

    }

    @Override
    public String drive(double distance){
        double fuelNeeded = distance*this.fuelConsumption;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = "needs refueling";

        if (this.fuelQuantity>= fuelNeeded){
            result = String.format("travelled %s km",decimalFormat.format(distance));
            this.fuelQuantity-=fuelNeeded;
        }
        return result;
    }

    @Override
    public void refuel(double liters) {
        if (liters<=0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (this.fuelQuantity+liters>this.tankCapacity){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity+=liters;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
}
