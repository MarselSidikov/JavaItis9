package ru.itis.streams;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class MainInputStream {

    // throws Exception - пишем при работе с файлами
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("input.txt");
//        int valueFromFile = inputStream.read();
//        System.out.print((char)valueFromFile);
//        valueFromFile = inputStream.read();
//        System.out.print((char)valueFromFile);
//        valueFromFile = inputStream.read();
//        System.out.print((char)valueFromFile);
//        valueFromFile = inputStream.read();
//        System.out.print((char)valueFromFile);
//        valueFromFile = inputStream.read();
//        System.out.print((char)valueFromFile);
//        valueFromFile = inputStream.read();
//        System.out.println();
//        System.out.println(valueFromFile);

        // объявили массив символов
        char text[] = new char[100];
        int i = 0;
        // считали первый символ как байт (в случае обычных символов это их код 0 - 255)
        int fromFile = inputStream.read();
        // пока не встретили значение -1
        while (fromFile != -1) {
            // кидаем текущий символ в массив
            text[i] = (char)fromFile;
            i++;
            // считываем новый символ
            fromFile = inputStream.read();
        }
        // выводим массив на экран, видим что есть пустые места
        System.out.println(Arrays.toString(text));
        // создаем строку только из нужных нам символов, то есть указываем
        // что в новой строке будут символы исходнгого массива начиная с 0-ой
        // позиции до последнего символа
        String textAsString = new String(text, 0, i);
        // выводим на экран
        System.out.println(textAsString);
    }
}
