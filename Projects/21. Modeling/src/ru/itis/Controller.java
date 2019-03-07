package ru.itis;

/**
 * 05.03.2019
 * Controller
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

/*
    Объявляем класс "Пульт".
    Имеет состояние:
    - Телевизор, с которым он работает
    Имеет поведение:
    - Включить определенный канал на телевизоре
    - включить телевизор
    - выключить телевизор
 */
public class Controller {
    // поле, телевизор с которым работает данный пульт
    private TV tv;

    public Controller(TV tv) {
        this.tv = tv;
    }

    // метод, который просит телевизор показать определенный канал
    public void turn(int channelNumber) {
        tv.on(channelNumber);
    }

    // включаем телевизор
    public void power() {
        tv.power();
    }

    // выключаем телевизор
    public void shutdown() {
        tv.shutdown();
    }

}
