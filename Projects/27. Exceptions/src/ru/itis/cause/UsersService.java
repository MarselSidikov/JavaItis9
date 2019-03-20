package ru.itis.cause;

import ru.itis.custom.IncorrectLoginException;
import ru.itis.custom.IncorrectPasswordException;

public class UsersService {
    public void signUp(String login, String password) {
        if (password.length() < 7) {
            throw new IncorrectPasswordException();
        }
        if (login.length() < 10) {
            throw new IncorrectLoginException();
        }
        System.out.println("Регистрация прошла успешно");
    }
}
