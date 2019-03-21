package ru.itis.generics;

public interface Stack<V> {
    void push(V c);
    V pop();
    boolean isEmpty();
}
