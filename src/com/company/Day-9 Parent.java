//Question-4
 public class Parent {

	protected void display() {
		System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
	}
}
class Sub extends Parent{
	public void display() {
		System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
		super.display();
	}
}
 class Check{
	public static void main(String[] args) {
		Parent p = new Sub();
		p.display();
	}
}


