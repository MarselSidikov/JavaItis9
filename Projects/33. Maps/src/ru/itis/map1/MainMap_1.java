package ru.itis.map1;

import ru.itis.Human;

public class MainMap_1 {

    public static void main(String[] args) {
        Human human = new Human("Марсель", 25, true);
        Human human1 = new Human("Надир", 22, true);
        Map_1 map = new Map_1();
        map.put("Марсель", human);
        map.put("Надир", human1);
        Human marsel = map.get("Марсель");
        Human nadir = map.get("Надир");
        Human radik = map.get("Радик");
        System.out.println(marsel);
        System.out.println(nadir);
        System.out.println(radik);
        System.out.println();
    }
}
