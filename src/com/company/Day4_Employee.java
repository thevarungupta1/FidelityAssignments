package com.company;

import java.util.Scanner;

public class Day4_Employee {

    private static String firstName;
    private static String lastName;
    private static int age;
    private static String id;
    private static int monthlySalary;

    public void employeeDetails(){
        System.out.println("************Employee Details for"+" "+id+"**************");
        String fullName = firstName +" "+ lastName;
        System.out.println("Employee full name is:" +  fullName);
        System.out.println("Age:"+age);
        System.out.println("Employee ID:"+id);
        System.out.println("Annual Salary :"+monthlySalary*12);
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
        id = sc.next();

        System.out.print("Enter monthly salary : ");
        monthlySalary = sc.nextInt();

        Day4_Employee emp1= new Day4_Employee();
        emp1.employeeDetails();
    }
}
