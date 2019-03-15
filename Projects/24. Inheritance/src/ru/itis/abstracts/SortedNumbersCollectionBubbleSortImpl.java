package ru.itis.abstracts;

/**
 * 12.03.2019
 * SortedNumbersCollectionBubbleSortImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class SortedNumbersCollectionBubbleSortImpl extends SortedNumbersCollection {
    public SortedNumbersCollectionBubbleSortImpl(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j +1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
