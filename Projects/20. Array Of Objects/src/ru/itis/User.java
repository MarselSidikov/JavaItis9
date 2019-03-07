package ru.itis;

/**
 * 05.03.2019
 * User
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class User {
    // константы, данные "переменные" нельзя менять
    private static final int DEFAULT_AGE = 1;
    private static final double DEFAULT_HEIGHT = 0.1;
    // поля - fields
    private String name;
    private int age;
    private double height;

    // конструктор, constructor
    public User() {
        name = "DEFAULT_NAME";
        age = DEFAULT_AGE;
        height = DEFAULT_HEIGHT;
    }

    // конструктор с параметрами
    public User(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // методы - methods
    public void grow() {
        height += 0.01;
    }

    public void grow(double value) {
        height += value;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = DEFAULT_AGE;
        } else {
            this.age = age;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = DEFAULT_HEIGHT;
        } else {
            this.height = height;
        }
    }
}
