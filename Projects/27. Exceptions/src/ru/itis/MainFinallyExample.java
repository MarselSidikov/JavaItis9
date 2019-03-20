package ru.itis;

public class MainFinallyExample {

    public static void f() {
        f();
    }

    public static void main(String[] args) {
        try {
            f();
            System.out.println("Hello");
        } catch (StackOverflowError e) {
            System.out.println("Переполнение");
            throw new IllegalStateException(e);
//            System.out.println("Hello");
        } finally {
            System.out.println("Hello");
        }
    }
}
