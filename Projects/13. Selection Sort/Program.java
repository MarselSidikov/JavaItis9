class Program {
	public static void main(String[] args) {
		int a[] = {4, 2, -3, -5, 1, 8, -6};
		int N = 7;

		int iteratons = 0;

		for (int k = 0; k < N; k++) {
			System.out.print(a[k] + " ");
		}
		System.out.println();

		for (int i = 0; i < N; i++) {
			int min = a[i];
			int minIndex = i;
			
			for (int j = i; j < N; j++) {
				if (a[j] < min) {
					min = a[j];
					minIndex = j;
				}
				iteratons++;
			}

			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;

			for (int k = 0; k < N; k++) {
				System.out.print(a[k] + " ");
			}

			System.out.println();
		}
		System.out.println("Iterations:" + iteratons);
	}
}