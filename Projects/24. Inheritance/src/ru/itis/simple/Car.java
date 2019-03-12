package ru.itis.simple;

/**
 * 12.03.2019
 * Car
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Car {
    private String model;
    private int mileage;
    protected double fuelConsumption;
    protected double fuelAmount;

    public Car(String model, int mileage, double fuelConsumption, double fuelAmount) {
        this.model = model;
        this.mileage = mileage;
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
    }

    public void go(int km) {
        this.fuelAmount -= this.fuelConsumption * (km / 100.0);
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }
}
