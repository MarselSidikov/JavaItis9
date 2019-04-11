package ru.itis.map2;

import ru.itis.Human;

public class Map {
    private Human values[];

    private final static int DEFAULT_SIZE = 16;

    public Map() {
        values = new Human[DEFAULT_SIZE];
    }

    public void put(String key, Human value) {
        int position = key.hashCode() & (values.length - 1);
        values[position] = value;
    }

    public Human get(String key) {
        int position = key.hashCode() & (values.length - 1);
        return values[position];
    }
}
