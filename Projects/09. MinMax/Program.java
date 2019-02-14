import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int min, max;

		int currentNumber = scanner.nextInt();

		min = currentNumber;
		max = currentNumber;

		while (currentNumber != -1) {
			if (currentNumber < min) {
				min = currentNumber;
			}
			if (currentNumber > max) {
				max = currentNumber;
			}
			currentNumber = scanner.nextInt();
		}

		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}
}