
public class Employee {
String name,email;
int id;

	Employee(){
		name="iOT";
		email="abc@xyz.com";
		id=123;
	}
	
	void callingMethod() {
		System.out.println("Calling default constructor name is: "+ name);
		System.out.println("Calling default constructor email is: "+ email);
		System.out.println("Calling default constructor name is: "+ id);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.callingMethod();

	}

}
