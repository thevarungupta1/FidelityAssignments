package excercise;

public class Child extends Parent{
	public void print()
	{
		super.print();
		System.out.println("My ancestor is a cycle who is a vehicle with pedals");
	}

	public static void main(String[] args)
	{
		Child ch=new Child();
		ch.print();
	}
}
