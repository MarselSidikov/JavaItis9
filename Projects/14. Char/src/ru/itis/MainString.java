package ru.itis;

import java.util.Scanner;

/**
 * 21.02.2019
 * MainString
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char text[] = scanner.nextLine().toCharArray();

        for (int i = 0; i < text.length; i++) {
            if (text[i] >= '0' && text[i] <= '9') {
                System.out.println(text[i] + " - цифра");
            } else if (text[i] >= 'A' && text[i] <= 'Z' ||
                    text[i] >= 'a' && text[i] <= 'z') {
                System.out.println(text[i] + " - буква");
            }
        }
    }
}
