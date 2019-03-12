package ru.itis.hard;

/**
 * 12.03.2019
 * Shape
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public abstract class Shape {

    private double x;
    private double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calcArea();

//    public abstract double calcPerimeter();
}
