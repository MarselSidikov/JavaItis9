package ru.itis.map2;

import ru.itis.Human;

public class MainMap_2 {
    public static void main(String[] args) {
        Human human0 = new Human("Марсель", 25, true);
        Human human1 = new Human("Надир", 22, true);
        Human human2 = new Human("Ленар", 28, true);
        Human human3 = new Human("Аэлита", 18, false);
        Human human4 = new Human("Кирилл", 28, true);
        Human human5 = new Human("Игорь", 40, true);
        Human human6 = new Human("Радик", 26, true);

        Map_2 map = new Map_2();
        map.put("Марсель", human0);
        map.put("Надир", human1);
        map.put("Ленар", human2);
        map.put("Аэлита", human3);
        map.put("Кирилл", human4);
        map.put("Игорь", human5);
        map.put("Радик", human6);

        System.out.println(map.get("Кирилл"));
    }
}
