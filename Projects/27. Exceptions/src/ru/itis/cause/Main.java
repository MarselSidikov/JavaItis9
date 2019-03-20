package ru.itis.cause;

import ru.itis.custom.IncorrectLoginException;
import ru.itis.custom.IncorrectPasswordException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsersService usersService = new UsersService();

        String login = scanner.nextLine();
        String password = scanner.nextLine();

        try {
            usersService.signUp(login, password);
        } catch (IncorrectPasswordException e) {
            throw new IllegalArgumentException(e);
        } catch (IncorrectLoginException e) {
            throw new IllegalArgumentException(e);
        }

    }
}
