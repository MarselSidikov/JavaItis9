package ru.itis.map3;

import ru.itis.Human;

public class Entry {
    private String key;
    private Human value;
    private int hash;

    // объектная переменная (поле)
    // которое содержит ссылку
    // на следующий объект
    private Entry next;

    public Entry(String key, Human value) {
        this.key = key;
        this.value = value;
        this.hash = key.hashCode();
    }

    public String getKey() {
        return key;
    }

    public Human getValue() {
        return value;
    }

    public Entry getNext() {
        return next;
    }

    public void setNext(Entry next) {
        this.next = next;
    }

    public void setValue(Human value) {
        this.value = value;
    }

    public int getHash() {
        return hash;
    }
}
