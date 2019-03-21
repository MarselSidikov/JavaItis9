package ru.itis.old;

public class IntegerArrayList implements IntegerList {

    // размер массива по умолчанию
    private static final int DEFAULT_ARRAY_SIZE = 10;
    // массив элементов
    private int elements[];
    // количество элементов в массиве
    private int size;

    public IntegerArrayList() {
        // выделяем память под массив
        this.elements = new int[DEFAULT_ARRAY_SIZE];
        // изначально в массиве 0 элементов
        this.size = 0;
    }

    public void add(int element) {
        if (size == elements.length) {
            // если массив переполнен - создаем новый массив
            // размер которго в полтора раза больше предыдущего
            int newElements[] = new int[elements.length + (int) (elements.length * 0.5)];
            // копируем старые значения в новый (бОльший массив)
            for (int i = 0; i < size; i++) {
                newElements[i] = this.elements[i];
            }
            // заменяем старый массив новым
            this.elements = newElements;
        }
        // положили элемент в первую пустую позицию
        this.elements[size] = element;
        // увеличили количество элементов
        size++;
    }

    public int get(int index) {
        checkIndex(index);
        return elements[index];
    }

    public int size() {
        return this.size;
    }

    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    private void checkIndex(int index) {
        if (!(index < size && index >= 0)) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void push(int element) {
        add(element);
    }

    public int pop() {
        int lastElement = elements[size - 1];
        remove(size - 1);
        return lastElement;
    }
}
