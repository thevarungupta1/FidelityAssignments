package Assigment;

class Adder extends Arithmetic {

	public static void main(String[] args) {
		Adder adder = new Adder();
		int sum = adder.add(10, 20);
		System.out.println("Sum of 2 number is :" + sum);
	}
}
