import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int evenPositionNumbersSum = 0;

		int currentNumber = scanner.nextInt();
		int i = 1;

		while (currentNumber != -1) {
			if (i % 2 == 0) {
				evenPositionNumbersSum = evenPositionNumbersSum + currentNumber;
			}
			currentNumber = scanner.nextInt();
			i = i + 1;
		}
		System.out.println(evenPositionNumbersSum);
	}
}