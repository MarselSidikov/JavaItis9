package ru.itis.hard;

/**
 * 12.03.2019
 * Square
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Square extends Rectangle {
    public Square(double x, double y, int weight) {
        super(x, y, weight, weight);
    }

    public double calcInnerCircle() {
        return (Math.sqrt(2) / 4 * getWeight());
    }
}
