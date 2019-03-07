package ru.itis;

import java.util.Random;

/**
 * 05.03.2019
 * MainReadUsers
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */

/*
    Задача по выяснению, какой возраст у людей встречается чаще всего, а также сортировка массива пользователей по росту
 */
public class MainReadUsers {
    public static void main(String[] args) {
        // создаем генратор случайных чисел
        Random random = new Random();
        // создаем массив имен
        String firstNames[] = {"Алина", "Регина", "Ленар", "Марсель", "Селим", "Серега"};
        // создаем массив фамилий
        String lastNames[] = {"Сидиков", "Мирзаянова", "Сухова", "Батдалов", "Эрдоган", "Садеков"};
        // создаем пустой массив пользователей
        User users[] = new User[100];
        // бегаем по всему массиву пользователей
        for (int i = 0; i < users.length; i++) {
            // получаем случайное имя человека из массива имен
            String randomFirstName = firstNames[random.nextInt(6)];
            // получаем случайную фамилию человека из массива фамилий
            String randomLastName = lastNames[random.nextInt(6)];
            // создаем человека со случайными данными
            users[i] = new User(randomFirstName + " " + randomLastName, 30 + random.nextInt(100), 1.5 + 0.5 * random.nextDouble());
        }
        // выводим список людей
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getName() + " " + users[i].getAge() + " " + users[i].getHeight());
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        // сортировка людей по росту
        // алгоритм Пузырьковой сортировки
        for (int i = users.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                // если у двух элементов нарушен порядок
                if (users[j].getHeight() > users[j + 1].getHeight()) {
                    // меняем местами
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getName() + " " + users[i].getAge() + " " + users[i].getHeight());
        }

        // создаем массив для учета количество встречаемых возрастов
        int ages[] = new int[130];

        User someUser = users[57];

        someUser.setAge(-10);

        // проходим по массиву возрастов
        for (int i = 0; i < users.length; i++) {
            // увеличиваем значения массива под индексом возраста текущего человека
            ages[users[i].getAge()]++;
        }
        // выводим массив встречаемости
        System.out.println("-----------------------");
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Age " + i + " " + ages[i]);
        }
    }
}
