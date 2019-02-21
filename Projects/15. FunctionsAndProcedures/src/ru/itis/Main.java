package ru.itis;

public class Main {

    public static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int getCountOfPrimes(int array[]) {
        int result = 0;
        for (int i = 0; i < array.length; i++ ) {
            if (isPrime(array[i])) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
	    int a[] = {45, 12, 13, 17, 169, 23};
	    int b[] = {15, 20, 11, 4, 5};

	    int countOfPrimesInA = getCountOfPrimes(a);
	    int countOfPrimesInB = getCountOfPrimes(b);

        System.out.println(countOfPrimesInA);
        System.out.println(countOfPrimesInB);
    }
}
