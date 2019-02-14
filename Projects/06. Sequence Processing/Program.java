import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int evenNumbersCount = 0;
		int oddNumbersCount = 0;

		int currentNumber;

		currentNumber = scanner.nextInt();

		while (currentNumber != -1) {
			if (currentNumber % 2 == 0) {
				evenNumbersCount = evenNumbersCount + 1;
			} else {
				oddNumbersCount = oddNumbersCount + 1;
			}
			currentNumber = scanner.nextInt();
		}

		System.out.println("Even count: " + evenNumbersCount);
		System.out.println("Odd count: " + oddNumbersCount);
	}
}