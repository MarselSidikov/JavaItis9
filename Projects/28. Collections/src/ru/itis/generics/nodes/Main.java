package ru.itis.generics.nodes;

public class Main {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(1);
        Node<Integer> b = new Node<>(2);
        Node<Integer> c = new Node<>(3);
        Node<Integer> d = new Node<>(4);
        Node<Integer> e = new Node<>(5);
        Node<Integer> f = new Node<>(6);

        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node<Integer> head = a;
        Node<Integer> current = head;

        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}
