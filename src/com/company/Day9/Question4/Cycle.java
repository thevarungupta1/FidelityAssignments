package Day9.Question4;

class PadalsCycle {
	
	public void getCycleType() {
		System.out.println("This is a vehicle with pedals");
	}

}

class Motorcycle extends PadalsCycle{
	public void getCycleType() {
		super.getCycleType();
		System.out.println("This is a cycle with motor");
	}
	}


public class Cycle{
	public static void main(String args[]) {
		Motorcycle mt = new Motorcycle();
		mt.getCycleType();
	}
}

