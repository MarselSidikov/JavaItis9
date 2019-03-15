package ru.itis.abstracts;

/**
 * 14.03.2019
 * SimpleNumberCollection
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class SimpleNumberCollection implements NumbersCollection {

    private int array[];

    public SimpleNumberCollection(int array[]) {
        this.array = array;
    }

    @Override
    public int getMin() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public int getMax() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public int indexOf(int element) {
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
