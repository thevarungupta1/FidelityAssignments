//Day:5 Runtime polymorphism using 
public class RuntimePolymorphism {

	public static void main(String[] args) {

		Bike bk = new Bike();
		bk.specs();
		
		Bike b = new Pulsar();
		b.specs();

		Bike b1 = new Ninja();
		b1.specs();
	}

}

class Bike {
	public void specs() {
		System.out.println("Bike features");
	}
}

class Pulsar extends Bike {
	public void specs() {
		System.out.println("Pulsar features");
	}
}

class Ninja extends Bike {
	public void specs() {
		System.out.println("Ninja features");
	}
}
