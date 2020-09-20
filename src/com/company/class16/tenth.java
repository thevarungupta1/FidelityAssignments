package com.company.class16;

import java.util.ArrayList;


class Employee
{
	int id;
	String Name;
	int age;

	public Employee(int id, String Name, int age)
	{
		this.id = id;
		this.Name = Name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", age=" + age + "]";
	}
	
	
	
}

public class tenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee(1, "Mark", 20);
		Employee emp2 = new Employee(2, "Watson", 30);
		Employee emp3 = new Employee(3, "Paul", 40);
		Employee emp4 = new Employee(4, "Test", 50);
		Employee emp5 = new Employee(5, "New", 60);
		
		ArrayList<Employee> emplist = new ArrayList<>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		
		for(Employee ep : emplist)
		{
			System.out.println(ep.toString());
		}
		
		ArrayList<Employee> emplist2 = new ArrayList<>();
		emplist2.add(emp4);
		emplist2.add(emp5);
		
		for(Employee empp3 : emplist2)
		{
			System.out.println(empp3);
		}
		emplist.addAll(emplist2);
		//emplist.addALL(emplist2);
		System.out.println(emplist);
	}

}
