package ru.itis;

/**
 * 07.03.2019
 * Logger
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

import java.util.stream.Stream;

/**
 * Класс, который записывает все изменения в системе на экран, например
 * - пользователь зашел на сайт
 * - пользователь вышел с сайта
 * - отработала такая-то функция
 * - приехал омон
 */
public class Logger {

    // статическая (глобальная, существующая в одном экземпляре переменная)
    // хранит ссылку на единственный объект данного класса
    private static Logger instance;

    // при запуске программы в эту переменную кладется
    // объект Logger
    static {
        instance = new Logger();
    }

    private Logger() {

    }

    public void info(String info) {
        System.out.println(info);
    }

    public void error(String error) {
        System.err.println(error);
    }

    public static Logger getLogger() {
        return instance;
    }
}
