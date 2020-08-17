package JavaLearning;

import java.util.Scanner;

public class Day4_Student {
    public static String firstName;
    public static String lastName;
    private static int age;
    private static int rollNumber;
    private static String classNumber;
    private static int marks;

    public static void fullName() {
        String fullName = firstName +" "+ lastName;
        System.out.println("The full name of student is " +  fullName);
    }

    public static void DetailsOfStudent(){
        System.out.println( "Details of Student:" + firstName +" "+ lastName + " " +"whose age is " + age + " " + "and roll number is " + rollNumber + " " + "is a student of class " + classNumber);
    }
    public static void Study(){
        System.out.println("The marks obtained by the student is " +  marks);
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name : ");
        firstName = sc.next();

        System.out.print("Enter last name : ");
        lastName = sc.next();

        System.out.print("Enter age : ");
        age = sc.nextInt();

        System.out.print("Enter roll number : ");
        rollNumber = sc.nextInt();

        System.out.print("Enter classNumber : ");
        classNumber = sc.next();

        System.out.print("Enter marks : ");
        marks = sc.nextInt();


        Day4_Student stud1= new Day4_Student();
        stud1.fullName();
        stud1.DetailsOfStudent();
        stud1.Study();

    }
}
