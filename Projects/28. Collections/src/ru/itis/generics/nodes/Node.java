package ru.itis.generics.nodes;

public class Node<E> {
    E value;
    Node<E> next;

    Node(E value) {
        this.value = value;
    }
}
