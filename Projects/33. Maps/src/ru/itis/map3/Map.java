package ru.itis.map3;

import ru.itis.Human;

public class Map {
    private final static int DEFAULT_SIZE = 16;

    // массив связных списков - корзин
    private Entry[] buckets;

    public Map() {
        this.buckets = new Entry[DEFAULT_SIZE];
    }

    public void put(String key, Human value) {
        // вычислили позицию
        int position = key.hashCode() & (buckets.length - 1);
        // создали узел
        Entry newEntry = new Entry(key, value);

        // если мы попали в корзину в которой ничего нет
        if (buckets[position] == null) {
            // положили этот единственный узел в корзину
            buckets[position] = newEntry;
        } else {
//            // запомнили первый элемент
//            Entry head = buckets[position];
//            // сказали, что теперь первый элемент списка
//            // стал вторым
//            entry.setNext(head);
//            // сказали, что новый элемент стал первым
//            buckets[position] = entry;
            // начинаем с первого элемента
            Entry current = buckets[position];
            // предыдущий элемент
            Entry previous = current;
            // бежим по элементам текущей корзины
            while (current != null) {
                // если хешкоды ключей совпали
                if (current.getHash() == key.hashCode()) {
                    // высока вероятность того, что эти ключи одинаковые
                    // нужно уточнение - сравниваем непосредственно ключи
                    if (current.getKey().equals(key)) {
                        // заменяем значение
                        current.setValue(value);
                        // останавливаем процедуру
                        return;
                    }
                }
                // запоминаем предыдущий
                previous = current;
                // если хешкоды не совпали
                current = current.getNext();
            }
            // сейчас в previous последний элемент
            previous.setNext(newEntry);
        }
    }

    public Human get(String key) {
        // вычислили позицию - где потенциально находится значение
        int position = key.hashCode() & (buckets.length - 1);

        // взяли первый элемент корзины где может находится искомое значение
        Entry current = buckets[position];

        while (current != null) {
            // потенциально нашли нужный ключ - у них совпали хешкоды
            if (current.getHash() == key.hashCode()) {
                // убедимся, что это действительно нужный ключ
                if (current.getKey().equals(key)) {
                    // если это и был искомый ключ
                    // возвращаем необходимое значение
                    return current.getValue();
                }
            }
            current = current.getNext();
        }
        // если ничего не нашли
        // возвращаем null
        return null;
    }
}
