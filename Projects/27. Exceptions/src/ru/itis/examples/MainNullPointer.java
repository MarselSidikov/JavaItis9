package ru.itis.examples;

public class MainNullPointer {

    public static void printLengthOfString(String text) {
        System.out.println(text.length());
    }
    public static void main(String[] args) {
        printLengthOfString("Привет!");
        printLengthOfString(null);
    }
}
