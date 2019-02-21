package ru.itis;

import java.util.Scanner;

/**
 * 21.02.2019
 * MainIsPrime
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainIsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean isPrime = true;

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break; // останавливаем цикл
            }
        }

        if (isPrime == true) {
            System.out.println("Простое");
        } else {
            System.out.println("Составное");
        }
    }
}
