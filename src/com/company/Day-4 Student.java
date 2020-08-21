public class Student {

	String name;
	int age;
	String email;

	Student(String name,int age, String email){
		this.name=name;
		this.age=age;
		this.email=email;

	}

	void studentMethod() {
		System.out.println("My name is: " + name);
		System.out.println("My age is: " + age);
		System.out.println("My email is: " + email);
	}
	public static void main(String[] args) {
		Student s=new Student("Alpha", 30, "abc@gmail.com");
		Student s2=new Student("Gamma", 20, "xyz@gmail.com");
		s.studentMethod();
		s2.studentMethod();

	}

}
