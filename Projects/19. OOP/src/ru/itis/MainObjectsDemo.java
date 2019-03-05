package ru.itis;

public class MainObjectsDemo {

    public static void main(String[] args) {
        // объявление объектной переменной
	    User marsel;
	    // создаю объект
	    marsel = new User();

		marsel.name = "Марсель";
		marsel.age = 25;
	    marsel.height = 1.85;

	    User alina = new User();

	    alina.name = "Алина";
	    alina.age = 18;
	    alina.height = 1.56;

	    alina = marsel;
	    marsel.name = "Селим";
		System.out.println(alina.name);
    }
}
