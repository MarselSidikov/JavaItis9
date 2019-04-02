package ru.itis;

import java.util.ArrayList;
import java.util.List;

public class MainLists {

    public static void main(String[] args) {
        // предпочтительнее ArrayList
        List<String> words = new ArrayList<>();
        // List<String> words = new LinkedList<>();
        words.add("Привет");
        words.add("Пока");
        words.add("Привет");

        for (String word : words) {
            System.out.println(word);
        }

        words.remove("Пока");
        System.out.println("После удаления - ");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
