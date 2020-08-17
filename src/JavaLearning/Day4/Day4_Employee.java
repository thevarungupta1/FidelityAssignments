package JavaLearning.Day4;

import java.util.Scanner;

public class Day4_Employee {
    private static String firstName;
    private static String lastName;
    private static int age;
    private static int id;
    private static int monthlySalary;

    public static void fullName() {
        String fullName = firstName +" "+ lastName;
        System.out.println("The full name of employee is " +  fullName);
    }

    public static void DetailsOfEmployee(){
        System.out.println( "Details of Employee:" + firstName +" "+ lastName + " " +"whose age is " + age + " " + "and employee id is " + id);
    }
    public static void SalaryOfEmployee(){
        int annualSalary= monthlySalary * 12;
        System.out.println("The annual salary of employee:  " +  annualSalary);
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name : ");
        firstName = sc.next();

        System.out.print("Enter last name : ");
        lastName = sc.next();

        System.out.print("Enter age : ");
        age = sc.nextInt();

        System.out.print("Enter employee id : ");
        id = sc.nextInt();

        System.out.print("Enter monthly salary : ");
        monthlySalary = sc.nextInt();

        Day4_Employee emp1= new Day4_Employee();
        emp1.fullName();
        emp1.DetailsOfEmployee();
        emp1.SalaryOfEmployee();
    }
}
