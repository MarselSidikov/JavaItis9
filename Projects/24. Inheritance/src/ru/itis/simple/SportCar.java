package ru.itis.simple;

/**
 * 12.03.2019
 * SportCar
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class SportCar extends Car {
    private double nitrousOxideConsumption;
    private double nitrousOxideAmount;

    public SportCar(String model, int mileage, double fuelConsumption, double fuelAmount, double nitrousOxideConsumption, double nitrousOxideAmount) {
        super(model, mileage, fuelConsumption, fuelAmount);
        this.nitrousOxideConsumption = nitrousOxideConsumption;
        this.nitrousOxideAmount = nitrousOxideAmount;
    }

    public void go(int km) {
        this.fuelAmount -= this.fuelConsumption * (km / 100.0);
        this.nitrousOxideAmount -= this.nitrousOxideConsumption * (km / 100.0);
    }

    public double getNitrousOxideConsumption() {
        return nitrousOxideConsumption;
    }

    public double getNitrousOxideAmount() {
        return nitrousOxideAmount;
    }
}
