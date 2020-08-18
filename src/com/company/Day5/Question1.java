package Day5New;


class Car{
	
	public void display() {
		System.out.println("Display average speed of car");
	}
}

class BMW extends Car{
	
	public void display() {
		System.out.println("Display average speed of BMW Car");
	}
}

class MERC extends Car{
	public void display() {
		System.out.println("Display average speed of MERC Car");
	}
}

public class Question1 {
	public static void main(String args[]) {
		
		Car c= new Car();
		c.display();
		c = new BMW();
		c.display();
		c= new MERC();
		c.display();
		
	
	}

}
