package ru.itis.generics;

public interface List<T> {
    // добавление элемента в конец списка
    void add(T element);
    // получение элемента из списка по индексу
    T get(int index);
    // получение размера текущечего списка
    int size();
    // проверить наличие этого элемента в списка
//    boolean contains(T element);
    // удаление элемента по индексу
    void remove(int index);
}
