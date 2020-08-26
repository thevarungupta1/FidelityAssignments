package com.company;

public class Car {

	//State of Object
	int brakes = 2;
	int gears = 5;
	int tyre = 4;

	public static void main(String[] args) {
		// Car class object c is created using new keyword and now it will call it state
		// and there behavior
		Car c = new Car();

		c.run();
		c.controlSpeedUsingBrakes();
		c.shiftingGears();

	}

	// Car class functions or Behavior shown using below methods
	public void run() {
		System.out.println("Car c has " + tyre + " tyres to run");
	}

	public void controlSpeedUsingBrakes() {
		System.out.println("Car c has " + brakes + "brakes to control car speed");
	}

	public void shiftingGears() {
		System.out.println("Car c has " + gears + "to increase and decrease speed of car");
	}
}
