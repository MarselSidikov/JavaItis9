package ru.itis.interfaces;

/**
 * 14.03.2019
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        Box box = new Box(1, 2, 3);
        Sphere sphere = new Sphere(10, "Red");
        Point point = new Point();

        Shape shapes[] = {box, sphere, point};
//        Scalable scalables[] = {box, sphere, point};
//        Colourable colourables[] = {sphere, box, point};
    }
}
