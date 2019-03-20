package ru.itis.reader;

import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class MainReaderExample {
    public static void main(String[] args) throws Exception {
        // создаем ридер для чтения файла
        Reader reader = new FileReader("input_2.txt");
//        char c = (char)reader.read();
//        System.out.println(c);
        // создаем массив символов
        char text[] = new char[100];
        // считываем текст из файла в массив символов
        // а в переменную length кладем
        // размер считанного текста
        int length = reader.read(text);
        System.out.println(length);
        // печатаем массив символов
        System.out.println(Arrays.toString(text));
        // создаем новую строку с прочитанным текстом
        // без лишних символов
        String string = new String(text, 0, length);
        System.out.println(string);
    }
}
