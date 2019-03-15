package ru.itis.interfaces;

/**
 * 14.03.2019
 * Sphere
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Sphere extends Shape implements Scalable, Colourable {
    private double radius;
    private String color;

    public Sphere(double radius, String color) {
        super(0, 0 , 0);
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void scale(double value) {
        this.radius = this.radius * value;
    }

    @Override
    public void changeColor(String color) {
        this.color = color;
    }
}
