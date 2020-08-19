package com.company;

public class Merc extends Car{

	public void display(String color, int maxSpeed)
	{
		System.out.println("Car features of Derived class is different : " + color + " and " + maxSpeed);
	}
	
	public static void main(String[] args) {
		
		Merc m = new Merc();
		m.display("black", 260);
	}
	
}
