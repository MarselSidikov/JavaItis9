package ru.itis.old;

public interface IntegerList {
    // добавление элемента в конец списка
    void add(int element);
    // получение элемента из списка по индексу
    int get(int index);
    // получение размера текущечего списка
    int size();
    // проверить наличие этого элемента в списка
    boolean contains(int element);
    // удаление элемента по индексу
    void remove(int index);
}
