package ru.itis.simple;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Лада Седан", 300000, 8, 60);
        car.go(55);
        System.out.println(car.getFuelAmount());

        SportCar sportCar = new SportCar("Бугатти Вейрон", 1000, 40, 100,
                50, 10);

        sportCar.go(55);
        System.out.println(sportCar.getFuelAmount());
        System.out.println(sportCar.getNitrousOxideAmount());
    }
}
