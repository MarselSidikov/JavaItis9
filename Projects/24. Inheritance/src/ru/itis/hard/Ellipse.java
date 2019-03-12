package ru.itis.hard;

/**
 * 12.03.2019
 * Ellipse
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Ellipse extends Shape {
    private double radius1;
    private double radius2;

    public Ellipse(double x, double y, double radius1, double radius2) {
        super(x, y);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    public double calcArea() {
        return Math.PI * radius1 * radius2;
    }

    public double getRadius1() {
        return radius1;
    }

    public double getRadius2() {
        return radius2;
    }
}
