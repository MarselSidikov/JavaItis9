package ru.itis;

public class Main {

    public static void main(String[] args) {
        char c = 'A';
        int codeOfC = c;
        codeOfC++;
        char another = (char)codeOfC;
        System.out.println(codeOfC);
        System.out.println(another);
    }
}
