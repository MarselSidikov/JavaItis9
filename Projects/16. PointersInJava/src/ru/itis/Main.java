package ru.itis;

public class Main {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void reverse(int array[]) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        System.out.println(x + " " + y);

        int z[] = {3, 4, 2, 1, 1, 5};

        reverse(z);

        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + " ");
        }
    }
}
