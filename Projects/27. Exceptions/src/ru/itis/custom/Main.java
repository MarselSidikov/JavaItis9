package ru.itis.custom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (password.length() < 7) {
            throw new IncorrectPasswordException();
        }
        System.out.println("Пароль норм");
    }
}
