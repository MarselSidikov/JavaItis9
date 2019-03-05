package ru.itis;

/**
 * 05.03.2019
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        User marsel = new User();
        marsel.name = "Марсель";
        marsel.age = 25;
        marsel.height = 1.85;

        User alina = new User();
        alina.name = "Алина";
        alina.age = 18;
        alina.height = 1.56;

        marsel.grow();
        marsel.grow();
        marsel.grow();

        alina.grow();

        System.out.println(marsel.name + " " + marsel.height);
        System.out.println(alina.name + " " + alina.height);

        User someUser = new User();
        System.out.println(someUser.name + " " + someUser.age + " " + someUser.height);

        User user = new User("Селим", 23, 1.79);

        user.grow(0.2);

        System.out.println(user.height);
    }
}
