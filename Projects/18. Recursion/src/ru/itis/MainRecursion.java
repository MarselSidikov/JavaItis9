package ru.itis;

/**
 * 28.02.2019
 * MainRecursion
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainRecursion {

    public static int step = 0;

    public static int fact(int n) {
        System.out.println(">>> " + step + ", in fact(" + n + ")");
        step++;
        if (n == 0) {
            System.out.println("<<< " + step + ", from fact(" + n + ") with result = " + 1);
            step++;
            return 1;
        }
        int result = n * fact(n - 1);
        System.out.println("<<< " + step + ", from fact(" + n + ") with result = " + result);
        step++;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fact(6));
    }
}
