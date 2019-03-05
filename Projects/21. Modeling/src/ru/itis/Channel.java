package ru.itis;

import java.util.Random;

/**
 * 05.03.2019
 * Channel
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Channel {
    Program programs[];
    String name;

    Channel(String name, Program[] programs) {
        this.name = name;
        this.programs = programs;
    }

    void showProgram() {
        Random random = new Random();
        System.out.println(name);
        programs[random.nextInt(programs.length)].showName();
    }
}
