package ru.itis;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // создаем шесть программ
	    Program p1 = new Program("Малахов+");
	    Program p2 = new Program("Пусть говорят");
	    Program p3 = new Program("Жить здорово");
	    Program p4 = new Program("Конец света: инопланетяне");
	    Program p5 = new Program("Конец света: наводнение на Эвересте");
        Program p6 = new Program("Конец света: Малахов+");

        // создаем два массива с программами
        // int a[] = {3, -5, 11};
        Program programsOfFirst[] = {p1, p2, p3};
        Program programsOfRenTV[] = {p4, p5, p6};

        // создаем два канала и передаем им название и массив этих самых программ
        Channel first = new Channel("Первый", programsOfFirst);
        Channel renTV = new Channel("РенТВ", programsOfRenTV);

        // создаем массив каналов
        Channel channels[] = {first, renTV};

        // создали телевизор и передали ему массив каналов
        TV tv = new TV(channels);

        // Создаем пульт
        Controller controller = new Controller(tv);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // считываем с консоли команду
            String command = scanner.nextLine();
            // если команда была на ключение телевизора
            if (command.equals("ВКЛ")) {
                controller.power();
            } else if (command.equals("ВЫКЛ")) {
                controller.shutdown();
            } else if (command.equals("ПОЙТИ ГУЛЯТЬ")) {
                return;
            } else {
                // если номер канала был считан как строка
                // то преобразуем его в число
                int commandNumber = Integer.parseInt(command);
                controller.turn(commandNumber);
            }
        }
    }
}
