package ru.itis;

public class MainBinarySearch {

    public static int search(int array[], int number, int left, int right) {
        if (left == right || left == right -1) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (i == left) {
                System.out.print("[ ");
            }
            System.out.print(array[i] + " ");
            if (i == right - 1) {
                System.out.print("] ");
            }
        }
        System.out.println();

        int middle = left + (right - left) / 2;
        if (number > array[middle]) {
            return search(array, number, middle, right);
        } else if (number < array[middle]) {
            return search(array, number, left, middle);
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i == middle) {
                    System.out.print("[ ");
                    System.out.print(array[i] + " ");
                    System.out.print("] ");
                } else {
                    System.out.print(array[i] + " ");
                }

            }
            System.out.println();
            return middle;
        }
    }

    public static void main(String[] args) {
        int array[] = {-99, 2, 5, 8, 11, 15, 16, 19, 20, 25, 33, 120, 131};
        System.out.println(search(array, 8, 0, array.length));
        System.out.println(search(array, 2, 0, array.length));
        System.out.println(search(array, 132, 0, array.length));
        System.out.println(search(array, 25, 0, array.length));
        System.out.println(search(array, -100, 0, array.length));
    }
}
