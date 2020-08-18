package com.company;

import java.util.Scanner;

public class Day4_Student {

    private static String firstName;
    private static String lastName;
    private static int age;
    private static String rollNumber;
    private static String classNumber;

    public void studentDetails(){
        System.out.println("************Student Details for"+" "+"roll number"+" "+rollNumber+"**************");
        String fullName = firstName +" "+ lastName;
        System.out.println("Student full name is:" +  fullName);
        System.out.println("Student Age:"+age);
        System.out.println("Student Roll Number:"+rollNumber);
        System.out.println("Student Class :"+classNumber);
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name : ");
        firstName = sc.next();

        System.out.print("Enter last name : ");
        lastName = sc.next();

        System.out.print("Enter age : ");
        age = sc.nextInt();

        System.out.print("Enter student roll number : ");
        rollNumber = sc.next();

        System.out.print("Enter student class number : ");
        classNumber = sc.next();

        Day4_Student emp1= new Day4_Student();
        emp1.studentDetails();
    }
}
