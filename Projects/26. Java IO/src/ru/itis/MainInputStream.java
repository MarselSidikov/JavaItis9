package ru.itis;

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

        char text[] = new char[100];
        int i = 0;
        int fromFile = inputStream.read();
        while (fromFile != -1) {
            text[i] = (char)fromFile;
            i++;
            fromFile = inputStream.read();
        }
        System.out.println(Arrays.toString(text));
        String textAsString = new String(text, 0, i);
        System.out.println(textAsString);
    }
}
