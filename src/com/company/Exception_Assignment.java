package com.company;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Exception_Assignment {
    public static void main(String[] args) {
        System.out.println("Enter 1 for Null Pointer Exception demonstration"
                + "\n" + "Enter 2 for Arithmetic Exception demonstration"
                + "\n" + "Enter 3 for FileNotFoundException demonstration"
                + "\n" + "Enter 4 for ArrayIndexOutofBoundsException demonstration"
                + "\n" + "Enter 5 for ClassCast Exception");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the option corresponding to which you want exception demonstration :");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                try {
                    String value = null;
                    System.out.println(value.charAt(0));
                    System.out.println("Operation under try successful");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Caught Null Pointer Exception"
                            + "\n" + "Reason:" + e.getMessage());
                }
                break;
            case 2:
                try {
                    System.out.println(10 / 0);
                    System.out.println("Operation under try successful");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Caught Arithmetic Exception"
                            + "\n" + "Reason:" + e.getMessage());
                }
                break;
            case 3:
                try {
                    File file = new File("C:\\Users\\yadav\\Desktop\\sample.txt");
                    FileReader fr = new FileReader(file);
                    System.out.println("Operation under try successful");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Caught filenotfound exception"
                            + "\n" + "Reason:" + e.getMessage());
                }
                break;
            case 4:
                try {
                    int a[] = new int[4];
                    System.out.println(a[5]);
                    System.out.println("Operation under try successful");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Caught ArrayIndexOutofBound Exception"
                            + "\n" + "Reason:" + e.getMessage());
                }
                break;
            case 5:
                try {
                    Object l = new String();
                    Integer k = (Integer) l;
                    System.out.println("Operation under try successful");
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Caught ClassCastException"
                            + "\n" + "Reason:" + e.getMessage());
                }
                break;
            default:
                System.out.println("Not valid option");

        }
    }
}
