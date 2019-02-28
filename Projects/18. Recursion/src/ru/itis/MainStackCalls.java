package ru.itis;

public class MainStackCalls {

    public static int step = 0;

    public static int x(int a) {
        System.out.println(">>> " + step + ", in x(" + a + ")");
        step++;
        int result = y(a + 1);
        step++;
        System.out.println("<<< " + step + ", from x() with result = " + result);
        return result;
    }

    public static int y(int b) {
        System.out.println(">>> " + step + ", in y(" + b + ")");
        step++;
        int result =  z(b  * 2);
        step++;
        System.out.println("<<< " + step + ", from y() with result = " + result);
        return result;
    }

    public static int z(int c) {
        System.out.println(">>> " + step + ", in z(" + c + ")");
        step++;
        int result = c / 3;
        step++;
        System.out.println("<<< " + step + ", from z() with result = " + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(">>> " + step + ", in main( )");
        step++;
        System.out.println("RESULT: " + x(5) * x(6));
        step++;
        System.out.println("<<< " + step + ", from main( )");
    }
}
