package ExceptionHandling.Question4;

class Parent{
	String parentName;
	
	Parent(String parentName){
		this.parentName = parentName;
	}
	
	public void printParentName() {
		System.out.println("Parent Name is : " +parentName);
	}
	
	
}

class Child extends Parent {
	String childName;
	
	Child(String chil){
		super(chil);
		this.childName= chil;
	}
	
	public void printChildName() {
		System.out.println("Child Name is : " +childName);
	}
}

public class ClassCast {
	public static void main(String args[]) {
	 try {
		Parent p = new Parent("Sonu");
		Child c= new Child("Monu");
		
		Parent p1= new Child("Monu1");
		p1.printParentName();
		
		Child c1= (Child) p;
		c1.printChildName();
	 }
	 catch(ClassCastException e) {
		 e.printStackTrace();
	 }
	 finally {
		 System.out.println("Closing the program and Releasig all the resources");
	 }
		
		
		
		
	}
	

}
