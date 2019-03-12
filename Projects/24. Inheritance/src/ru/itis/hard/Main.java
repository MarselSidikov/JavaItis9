package ru.itis.hard;

/**
 * 12.03.2019
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        // массив ссылок типа Shape
        // каждая - null
//        Shape shapes[] = new Shape[4];
//        Shape s1 = new Rectangle(10, 5);
//        Shape s2 = new Square(5);
//        Shape s3 = new Circle(4);
//        Shape s4 = new Ellipse(3, 5);
//
//        shapes[0] = s1;
//        shapes[1] = s2;
//        shapes[2] = s3;
//        shapes[3] = s4;

        Rectangle rectangle = new Rectangle(1, 1, 10, 5);
        Square square = new Square(2, 2,5);

        Circle circle = new Circle(3, 3,4);
        Ellipse ellipse = new Ellipse(4, 4,3, 5);

        Shape shapes[] = {rectangle, square, circle, ellipse};

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].calcArea());
        }

//        Shape shape = new Shape();
    }
}
