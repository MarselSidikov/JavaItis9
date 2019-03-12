package ru.itis.abstracts;

/**
 * 12.03.2019
 * SortedNumbers
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public abstract class SortedNumbers {
    protected int array[];
    private boolean isSorted;

    public SortedNumbers(int array[]) {
        this.array = array;
        this.isSorted = false;
    }

    public abstract void sort();

    public int indexOf(int element) {
        checkAndSort();

        int left = 0;
        int right = array.length - 1;
        int middle = left + (right - left) / 2;

        while (array[middle] != element) {
            if (array[middle] > element) {
                right = middle;
                middle = left + (right - left) / 2;
            } else if (array[middle] < element) {
                left = middle;
                middle = left + (right - left) / 2;
            }

            if (left > right) {
                return -1;
            }
        }

        return middle;
    }

    public int getMin() {
        checkAndSort();
        return array[0];

    }

    public int getMax() {
        checkAndSort();
        return array[array.length - 1];
    }

    private void checkAndSort() {
        if (!isSorted) {
            sort();
            isSorted = true;
        }
    }
}
