package Exception_assigment;

class parent {
 public void print()
 {
	 System.out.println("it's parent class");
 }
  
  }

class Child extends parent{
	public void print()
	{
		System.out.println("it's child class");
	}
}

public class ClassCastExcp{
	public static void main(String[] args)
	{
		parent cc=new Child();
		Child ch=(Child)cc;
		cc=ch;
		ch.print();
		System.out.println();
	}
}