import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int array[] = new int[5];

		for (int i = 0; i < 5; i++) {
			array[i] = scanner.nextInt();
		} 

		for (int i = 0; i < 5; i++) {
			System.out.println("a[" + i + "] = " + array[i]);
		}
	}
}