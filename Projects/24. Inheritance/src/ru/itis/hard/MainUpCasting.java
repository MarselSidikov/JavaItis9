package ru.itis.hard;

/**
 * 12.03.2019
 * MainUpCasting
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainUpCasting {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(0, 0,10, 5);
        Square square = new Square(7, 4, 5);
        
        Circle circle = new Circle(1, 5, 4);
        Ellipse ellipse = new Ellipse(7, 8, 3, 5);

        Rectangle squareAsRectangle = square;
        // System.out.println(squareAsRectangle.calcInnerCircle());
        // нисходящее преобразование
        Square squareAsSquare = (Square)squareAsRectangle;
        System.out.println(squareAsSquare.calcInnerCircle());
    }
}
