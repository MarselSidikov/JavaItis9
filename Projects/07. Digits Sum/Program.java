import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); // number = 127
		
		int digitsSum = 0;
		int currentDigit;

		while (number != 0) {
			currentDigit = number % 10; // 127 % 10 = 7, because 12 * 10 + 7 = 127
			digitsSum = digitsSum + currentDigit; // digitsSum = 0 + 7
			number = number / 10; // 127 / 10 = 12
		}

		System.out.println(digitsSum);
	}
}