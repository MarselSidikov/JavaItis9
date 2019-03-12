package ru.itis.hard;

/**
 * 12.03.2019
 * Rectangle
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Rectangle extends Shape {
    private double height;
    private double weight;

    public Rectangle(double x, double y, double height, double weight) {
        super(x, y);
        this.height = height;
        this.weight = weight;
    }

    public double calcArea() {
        return this.height * this.weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
