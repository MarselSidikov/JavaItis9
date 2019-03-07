package ru.itis;

import java.util.Random;

/**
 * 05.03.2019
 * Channel
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

/*
    Объявление класса "Канал". Канал может содержать список программ, которые он может показывать.
    Имеет состояние:
    - Список программ
    - Название телеканала
    Имеем поведение:
    - Показать случайную программу данного телеканала
 */
public class Channel {
    // массив, хранит список программ данного телеканала
    private Program programs[];
    // название данного телеканала
    private String name;

    // конструктор, принимает на вход название канала
    // и список программ для данного телеканала
    public Channel(String name, Program[] programs) {
        this.name = name;
        this.programs = programs;
    }

    // метод, который показывает случайную программу
    public void showProgram() {
        // создаем генератор псевдослучайных чисел
        Random random = new Random();
        // печатаем название телеканала на экран
        System.out.println(name);
        // обращаемся к программе под случайным индексом
        // и вызываем у нее метод showName, чтобы она
        // вывела свое название
        programs[random.nextInt(programs.length)].showName();
    }
}
