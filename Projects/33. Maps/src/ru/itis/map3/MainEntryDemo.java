package ru.itis.map3;

import ru.itis.Human;

public class MainEntryDemo {
    public static void main(String[] args) {
        Human human0 = new Human("Марсель", 25, true);
        Human human1 = new Human("Надир", 22, true);
        Human human2 = new Human("Ленар", 28, true);
        Human human3 = new Human("Аэлита", 18, false);
        Human human4 = new Human("Кирилл", 28, true);
        Human human5 = new Human("Игорь", 40, true);
        Human human6 = new Human("Радик", 26, true);

        Entry a = new Entry("Марсель", human0);
        Entry b = new Entry("Надир", human1);
        Entry c = new Entry("Ленар", human2);
        Entry d = new Entry("Аэлита", human3);
        Entry e = new Entry("Кирилл", human4);
        Entry f = new Entry("Игорь", human5);
        Entry g = new Entry("Радик", human6);

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);
        e.setNext(f);
        f.setNext(g);

        // запоминаем текущий элемент как первый
        Entry current = a;
        // пока текущий не обнулился
        while (current != null) {
            // печатаем значение текущего узла
            System.out.println(current.getValue());
            // перемещаем указатель текущего элемента следующий
            current = current.getNext();
        }
    }
}
