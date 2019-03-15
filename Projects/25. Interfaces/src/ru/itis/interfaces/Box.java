package ru.itis.interfaces;

/**
 * 14.03.2019
 * Box
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
// КЛАСС КУБ с разной длиной сторон
public class Box extends Shape implements Scalable {
    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length) {
        super(0, 0, 0);
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public void scale(double value) {
        this.height = this.height * value;
        this.width = this.width * value;
        this.length = this.length * value;
    }
}
