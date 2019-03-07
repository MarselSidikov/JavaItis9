package ru.itis;

/**
 * 05.03.2019
 * Program
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

/*
    Объявленям класс "Программа", элемент телеканала.
    Имеет состояние:
    - название программы
    Имеет поведение:
    - показать свое название
  */

public class Program {
    // поле для хранения названия программы
    private String name;

    // конструктор, который принимает на вход название программы
    public Program(String name) {
        this.name = name;
    }

    // метод, который выводит название программы на экран
    public void showName() {
        System.out.println(name);
    }
}
