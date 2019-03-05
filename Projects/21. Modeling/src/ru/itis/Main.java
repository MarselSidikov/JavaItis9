package ru.itis;

public class Main {

    public static void main(String[] args) {
	    Program p1 = new Program();
	    p1.name = "Малахов+";
	    Program p2 = new Program();
	    p2.name = "Пусть говорят";
	    Program p3 = new Program();
	    p3.name = "Жить здорово";

	    Program p4 = new Program();
        p4.name = "Конец света: инопланетяне";

        Program p5 = new Program();
        p5.name = "Конец света: наводнение на Эвересте";

        Program p6 = new Program();
        p6.name = "Конец света: Малахов+";

        Program programsOfFirst[] = {p1, p2, p3};
        Program programsOfRenTV[] = {p4, p5, p6};

        Channel channel = new Channel("Первый", programsOfFirst);
        Channel channel1 = new Channel("РенТВ", programsOfRenTV);

        channel.showProgram();
        channel1.showProgram();
    }
}
