package ru.itis;

/**
 * 05.03.2019
 * TV
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

/*
    Объявляем класс "Телевизор". Телевизор - это набор каналов.
    Имеет состояние:
    - список каналов
    Имеет поведение:
    - включить канал по его номеру
    - включить телевизор
    - выключить телевизор
 */
public class TV {
    // список каналов, привязанных к этому телевизору
    private Channel channels[];

    private boolean isPowerOn;

    // конструктор, принимает на вход список каналов
    public TV(Channel[] channels) {
        this.channels = channels;
        this.isPowerOn = false;
    }

    // метод, который позволяет включить канал под номером
    // channelNumber
    public void on(int channelNumber) {
        if (isPowerOn) {
            // обращаемся к каналу под номером channelNumber
            // и просим его показать передачу

            // проверяем, существует ли такой канал
            if (channelNumber < channels.length && channelNumber >= 0) {
                this.channels[channelNumber].showProgram();
            } else {
                System.err.println("Канал не настроен");
            }
        } else {
            System.err.println("ТЕЛЕВИЗОР ВЫКЛЮЧЕН");
        }
    }

    public void power() {
        System.out.println("ТЕЛЕВИЗОР ВКЛЮЧЕН");
        this.isPowerOn = true;
    }

    public void shutdown() {
        System.out.println("ТЕЛЕВИЗОР ВЫКЛЮЧЕН");
        this.isPowerOn = false;
    }
}
