package ru.itis.catches;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();

            if (a == -1) {
                return;
            }

            int b = scanner.nextInt();
            try {
                int c = a / b;
                System.out.println(c);
            } catch (ArithmeticException e) {
                System.out.println("Введите не ноль, потому что " + e.getMessage());
            }
        }
    }
}
