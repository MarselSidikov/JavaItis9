import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int array[] = new int[5];

		int i = 0;
		while (i < 5) {
			array[i] = scanner.nextInt();
			i++; // i = i + 1, increment
		} 

		i = 0;
		while (i < 5) {
			System.out.println("a[" + i + "] = " + array[i]);
			i++;
		}
	}
}