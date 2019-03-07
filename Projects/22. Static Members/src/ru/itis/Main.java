package ru.itis;

public class Main {

    public static void main(String[] args) {
        System.out.println(SomeClass.staticValue);
        SomeClass.staticValue = 50;
        SomeClass object1 = new SomeClass();
        object1.value = 100;
        object1.staticValue = 300;

        SomeClass object2 = new SomeClass();
        object2.value = 200;
        object2.staticValue = 400;

        object1.changeSign();
        System.out.println(object1.value);
        System.out.println(object2.value);

        SomeClass.staticValue = 500;
        SomeClass.changeStaticSign();
        System.out.println(object1.staticValue);
        System.out.println(object2.staticValue);
    }
}
