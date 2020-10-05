package AssignmentExceptionHandling;

class Prime {

	static int i, n, j;
	static int counter = 0;

	public static void displayallprimeNumber(int n) {
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				try {
					if (i % j == 0) {
						counter = counter + 1;
					}
				} catch (ArithmeticException e) {
					System.out.println("Error");
				}
			}
			if (counter <= 2) {
				System.out.print("Prime no are :");
				System.out.println(i);
			}
			counter = 0;
		}
	}

	public static void main(String[] args) {
		Prime obj = new Prime();
		obj.displayallprimeNumber(20);
	}
}
