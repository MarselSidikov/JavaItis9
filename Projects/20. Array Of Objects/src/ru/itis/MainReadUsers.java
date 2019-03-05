package ru.itis;

import java.util.Random;

/**
 * 05.03.2019
 * MainReadUsers
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainReadUsers {
    public static void main(String[] args) {
        Random random = new Random();

        String firstNames[] = {"Алина", "Регина", "Ленар", "Марсель", "Селим", "Серега"};
        String lastNames[] = {"Сидиков", "Мирзаянова", "Сухова", "Батдалов", "Эрдоган", "Садеков"};

        User users[] = new User[100];

        for (int i = 0; i < users.length; i++) {
            String randomFirstName = firstNames[random.nextInt(6)];
            String randomLastName = lastNames[random.nextInt(6)];
            users[i] = new User(randomFirstName + " " + randomLastName, 30 + random.nextInt(100), 1.5 + 0.5 * random.nextDouble());
        }

        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].name + " " + users[i].age + " " + users[i].height);
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (int i = users.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (users[j].height > users[j + 1].height) {
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].name + " " + users[i].age + " " + users[i].height);
        }

        int ages[] = new int[130];

        for (int i = 0; i < users.length; i++) {
            ages[users[i].age]++;
        }

        System.out.println("-----------------------");
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Age " + i + " " + ages[i]);
        }
    }
}
