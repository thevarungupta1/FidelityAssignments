package Day16.Question14;
import java.util.LinkedList;
import java.util.Iterator;

class Employee{
	String empName;
	int empAge;
	String empAid;
	
	Employee(String empName, int empAge, String empAid ){
		this.empName= empName;
		this.empAge = empAge;
		this.empAid= empAid;
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAge=" + empAge + ", empAid=" + empAid + "]";
	}

	public void display() {
		System.out.println("Employee Name is: " +empName );
		System.out.println("Employee Age is: " +empAge );
		System.out.println("Employee Id is: " +empAid );
		
	}
}



public class InsertionInLinkedList {
	public static void main(String args[]) {
		
		Employee emp1 = new Employee("Neha", 25,"A101");
		Employee emp2 = new Employee("Ekta", 23,"A102");
		Employee emp3 = new Employee("Deepanshu", 29,"A103");
		Employee emp4 = new Employee("Ian", 27,"A104");
		
		LinkedList<Employee> employee = new LinkedList<Employee>();
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		employee.add(emp4);
		
		System.out.println("Linked List of Employee Type:");
		
		Iterator<Employee> itr= employee.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		System.out.println("Insert element at the beginning of Linked List :");
		Employee emp5 = new Employee("Paul", 18, "A105");
		
		employee.addFirst(emp5);
		
		Iterator<Employee> itr1= employee.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
		System.out.println();
		System.out.println("Insert element at the endd of Linked List :");
		Employee emp6 = new Employee("Nina", 27, "A106");
		
		employee.addLast(emp6);
		
		Iterator<Employee> itr2= employee.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		
		
	}

}
