package ru.itis;

public class Main {
    public static void main(String[] args) {
        Human marsel = new Human("Марсель", 25);
        Human anotherMarsel = new Human("Марсель", 25);

        boolean result = marsel == anotherMarsel;
        System.out.println(result);

        boolean resultWithEquals = marsel.equals(anotherMarsel);
        System.out.println(resultWithEquals);

        System.out.println(marsel.equals("Привет"));
        Human h = null;
        System.out.println(marsel.equals(h));
    }
}
