package ru.itis;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 14.03.2019
 * MainWithCyrillic
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainWithCyrillic {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("input2.txt");
        int valueFromFile = inputStream.read();
        System.out.print(valueFromFile);

    }
}
