package ru.itis.examples;

public class MainOutOfMemory {
    public static void main(String[] args) {
        String texts[] = new String[Integer.MAX_VALUE];
    }
}
