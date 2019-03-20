package ru.itis.catches;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        try {
            String texts[] = new String[length];
        } catch (OutOfMemoryError e) {
            System.out.println("У вас тут " + e.getMessage() + ", в следующий раз аккуратнее");
        }
    }
}
