package ru.itis;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<String> uniqueWords = new HashSet<>();
        uniqueWords.add("Привет");
        uniqueWords.add("Пока");
        uniqueWords.add("Привет");

        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
