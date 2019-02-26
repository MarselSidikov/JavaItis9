package ru.itis;

/**
 * 26.02.2019
 * Main2
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main2 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = a;

        b[1] = 777;

        System.out.println(a[0] + " " + a[1] + " " + a[2]);
    }
}
