package ru.itis.examples;

public class MainStackOverflowError {
    public static void f() {
        f();
    }

    public static void main(String[] args) {
        f();
    }
}
