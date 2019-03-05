package ru.itis;

/**
 * 05.03.2019
 * User
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class User {
    // поля - fields
    String name;
    int age;
    double height;

    // конструктор, constructor
    User() {
        name = "DEFAULT_NAME";
        age = 1;
        height = 0.1;
    }

    // конструктор с параметрами
    User(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // методы - methods
    void grow() {
        height += 0.01;
    }

    void grow(double value) {
        height += value;
    }

}
