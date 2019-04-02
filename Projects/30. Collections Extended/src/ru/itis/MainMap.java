package ru.itis;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Human marsel = new Human("Марсель", 25);
        Human lenar = new Human("Ленар", 28);
        Human nadir = new Human("Надир", 22);
        Human selim = new Human("Селим", 23);

        Map<String, Human> humans = new HashMap<>();

        humans.put("Марсель", marsel);
        humans.put("Ленар", lenar);
        humans.put("Надир", nadir);
        humans.put("Селим", selim);

        System.out.println(humans.get("Ленар").getAge());
    }
}
