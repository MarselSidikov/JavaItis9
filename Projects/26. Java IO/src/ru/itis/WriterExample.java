package ru.itis;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("output_2.txt", true);
        String text = "Привет, Марсель! Что делаешь вечером? Работаю";
        // пребразуем строку в массив символов
//        char textAsArray[] = text.toCharArray();
        writer.write(text);
        writer.close();
    }
}
