package ru.itis.map3;

import ru.itis.Human;

public class MainMap {
    public static void main(String[] args) {
        Human human0 = new Human("Марсель", 25, true);
        Human human1 = new Human("Надир", 22, true);
        Human human2 = new Human("Ленар", 28, true);
        Human human3 = new Human("Аэлита", 18, false);
        Human human4 = new Human("Кирилл", 28, true);
        Human human5 = new Human("Игорь", 40, true);
        Human human6 = new Human("Радик", 26, true);
        Human human7 = new Human("Салават", 22, true);
        Human human8 = new Human("Айсылу", 23, false);
        Human human9 = new Human("Виктор", 22, true);
        Human human10 = new Human("Регина", 19, false);
        Human human11 = new Human("Алина", 18, false);
        Human human12 = new Human("Алина", 25, true);
        Human human13 = new Human("FB", 33, true);
        Human human14 = new Human("Ea", 20, false);

        Map map = new Map();
        map.put("Марсель", human0);
        map.put("Надир", human1);
        map.put("Ленар", human2);
        map.put("Аэлита", human3);
        map.put("Кирилл", human4);
        map.put("Игорь", human5);
        map.put("Радик", human6);
        map.put("Салават", human7);
        map.put("Айсылу", human8);
        map.put("Виктор", human9);
        map.put("Регина", human10);
        map.put("Алина", human11);
        map.put("Алина", human12);
        map.put("FB", human13);
        map.put("Ea", human14);

        System.out.println(map.get("Марсель"));
        System.out.println(map.get("Надир"));
        System.out.println(map.get("Ленар"));
        System.out.println(map.get("Аэлита"));
        System.out.println(map.get("Кирилл"));
        System.out.println(map.get("Игорь"));
        System.out.println(map.get("Радик"));
        System.out.println(map.get("Салават"));
        System.out.println(map.get("Айсылу"));
        System.out.println(map.get("Виктор"));
        System.out.println(map.get("Регина"));
        System.out.println(map.get("Алина"));
        System.out.println(map.get("Алина"));
        System.out.println(map.get("FB"));
        System.out.println(map.get("Ea"));
        int i = 0;
    }
}
