package ru.itis.map1;

import ru.itis.Human;

public class Map {
    // массив для хранения ключей
    private String keys[];
    // массив для хранения значений
    private Human values[];
    // количество пар {ключ-значение}
    private int count;

    public Map() {
        // создаем два пустых массива
        keys = new String[10]; // массив ключей
        values = new Human[10]; // массив значений
        // изначальное количество элементов 0
        count = 0;
    }

    public void put(String key, Human value) {
        // кладем ключ в массив ключей
        keys[count] = key;
        // кладем значение в массив значений
        values[count] = value;
        // увеличиваем количество элементов
        count++;
    }

    // нам подали на вход ключ, надо найти значение
    // по этому ключу
    public Human get(String key) {
        // полагаем, что искомого ключа нет
        int indexOfKey = -1;
        // бежим по всем элементам массива
        for (int i = 0; i < count; i++) {
            // если просматриваемый i-ый ключ совпал с искомым
            if (keys[i].equals(key)) {
                // запоминаем индекс этого ключа
                indexOfKey = i;
                // обрываем цикл
                break;
            }
        }

        // если так ключа и не нашли - возвращаем null
        if (indexOfKey == -1) {
            return null;
        } else {
            // возвращаем значение по этому индексу
            return values[indexOfKey];
        }
    }
}
