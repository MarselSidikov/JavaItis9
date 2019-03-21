package ru.itis.generics;

public class ArrayList<E> implements List<E>, Stack<E> {

    // размер массива по умолчанию
    private static final int DEFAULT_ARRAY_SIZE = 10;
    // массив элементов
    private E elements[];
    // количество элементов в массиве
    private int size;

    public ArrayList() {
        // выделяем память под массив
        this.elements = (E[])new Object[DEFAULT_ARRAY_SIZE];
        // изначально в массиве 0 элементов
        this.size = 0;
    }

    public void add(E element) {
        if (size == elements.length) {
            // если массив переполнен - создаем новый массив
            // размер которго в полтора раза больше предыдущего
            E newElements[] = (E[])new Object[elements.length + (int) (elements.length * 0.5)];
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

    public E get(int index) {
        checkIndex(index);
        return elements[index];
    }

    public int size() {
        return this.size;
    }

//    public boolean contains(int element) {
//        for (int i = 0; i < size; i++) {
//            if (elements[i] == element) {
//                return true;
//            }
//        }
//        return false;
//    }

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

    public void push(E element) {
        add(element);
    }

    public E pop() {
        E lastElement = elements[size - 1];
        remove(size - 1);
        return lastElement;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
