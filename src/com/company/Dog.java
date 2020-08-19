package com.company;

public class Dog {

	String Color = "Red";
	int height = 5;
	int age = 4;
	String DogName;
	
	public void DogBark()
	{
		System.out.println("Dog Barking is a behavior");
		}

	public void setDogName(String Name)
	{
		DogName = Name;
		}
	public String getDogname()
	{
		System.out.println("Height of Dog is an object : " + height);
		System.out.println("Color of Dog is an object : " + Color);
		System.out.println("DogName is : " + DogName);
		return DogName;
		
	}
	
	public static void main(String[] args)
	{
		Dog dg = new Dog();
		dg.DogBark();
		dg.setDogName("Bulldog");
		dg.getDogname();
		
}
}