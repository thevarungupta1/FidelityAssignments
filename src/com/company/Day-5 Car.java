package Day5;
//Day:5 Runtime polymorphism using 
class Car {

	public void display() {
		System.out.println("Base class Method");
	}	
}

class Merc extends Car {
	public void display() {
		System.out.println("Merc features");
	}
}

class BMW extends Car {
	public void display() {
		System.out.println("BMW features");
	}
}

class PolymorphismTest{
	public static void main(String[] args) {
		Car ca=new Car();
		ca.display();

		Car me=new Merc();
		me.display();

		Car c=new BMW();
		c.display();
	}
}

