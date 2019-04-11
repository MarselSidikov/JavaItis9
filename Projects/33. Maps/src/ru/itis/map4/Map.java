package ru.itis.map4;

import ru.itis.Human;

public class Map<K, V> {

    private static class Entry<K, V> {
        private K key;
        private V value;
        private int hash;
        private Entry<K,V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.hash = key.hashCode();
        }
    }

    private final static int DEFAULT_SIZE = 16;

    // массив связных списков - корзин
    private Entry<K, V>[] buckets;

    public Map() {
        this.buckets = new Entry[DEFAULT_SIZE];
    }

    public void put(K key, V value) {
        // вычислили позицию
        int position = key.hashCode() & (buckets.length - 1);
        // создали узел
        Entry<K,V> newEntry = new Entry<>(key, value);

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
                if (current.hash == key.hashCode()) {
                    // высока вероятность того, что эти ключи одинаковые
                    // нужно уточнение - сравниваем непосредственно ключи
                    if (current.key.equals(key)) {
                        // заменяем значение
                        current.value = value;
                        // останавливаем процедуру
                        return;
                    }
                }
                // запоминаем предыдущий
                previous = current;
                // если хешкоды не совпали
                current = current.next;
            }
            // сейчас в previous последний элемент
            previous.next = newEntry;
        }
    }

    public V get(K key) {
        // вычислили позицию - где потенциально находится значение
        int position = key.hashCode() & (buckets.length - 1);

        // взяли первый элемент корзины где может находится искомое значение
        Entry<K,V> current = buckets[position];

        while (current != null) {
            // потенциально нашли нужный ключ - у них совпали хешкоды
            if (current.hash == key.hashCode()) {
                // убедимся, что это действительно нужный ключ
                if (current.key.equals(key)) {
                    // если это и был искомый ключ
                    // возвращаем необходимое значение
                    return current.value;
                }
            }
            current = current.next;
        }
        // если ничего не нашли
        // возвращаем null
        return null;
    }
}
