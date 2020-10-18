package com.fil.hibernate.HibernateTutorial;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static Scanner sc = new Scanner(System.in);

	public static Employeehibernate obj;
	public static Configuration config;
	public static SessionFactory factory;
	public static Session session;
	public static Transaction tx ;

	public static void main( String[] args )
	{


		System.out.println("Please enter the options from below:");
		System.out.println("1.Add");
		System.out.println("2.Read");

		int choice= sc.nextInt();

		if(choice==1)
		{
			addEmpoyee();
			
			System.out.println("Record inserted succesfully");
		}

		else if(choice==2)
		{
			display();
		}
		else{
			
			System.out.println("Invalid input. Please enter either 1 or 2");
		}
	}
	
//method of employee
	
	public static void addEmpoyee(){

		obj = new Employeehibernate();

		System.out.print("Enter the employee id:");
		
		int emp_Id = sc.nextInt();
		
		System.out.print("Enter the employee Name:");
		
		String emp_Name = sc.next();
		
		System.out.print("Enter the employee Designation:");
		
		String emp_Designation = sc.next();

		obj.setEmp_Id(emp_Id);
		
		obj.setEmp_Name(emp_Name);
		
		obj.setEmp_Designation(emp_Designation);

		config= new Configuration().configure().addAnnotatedClass(Employeehibernate.class);
		
		config.configure("hibernate.cfg.xml");
		
		factory=config.buildSessionFactory();

		session =  factory.openSession();
		
		tx = session.beginTransaction();
		
		session.save(obj);
		
		tx.commit();
	}

	public static String display(){
		
		System.out.print("Enter the employee id:");
		
		int emp_Id = sc.nextInt();

		obj= new Employeehibernate();
		
		config= new Configuration().configure().addAnnotatedClass(Employeehibernate.class);
		
		config.configure("hibernate.cfg.xml");
		
		factory=config.buildSessionFactory();

		session =  factory.openSession();
		
		tx = session.beginTransaction();
		
		obj=(Employeehibernate)session.get(Employeehibernate.class,emp_Id);
		
		tx.commit();

		System.out.println(obj);
		
		return "display";

	}
}
