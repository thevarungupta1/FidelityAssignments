package Assigment;

public class SubClass extends SuperClass {

	public void printText() {
		// This will call Parent class PrintText()
		super.printText();
		System.out.println("My ancestor is cycle who is a vehicle with pedals");
	}

	public static void main(String[] args) {

		SuperClass sc = new SubClass();
		// printText Method override parent class method and call child class method here
		sc.printText();

	}

}
