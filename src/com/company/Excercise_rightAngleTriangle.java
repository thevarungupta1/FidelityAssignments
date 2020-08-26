package com.company;


import java.util.Scanner;

public class Excercise_rightAngleTriangle {

    public static void rightTriangle(double a, double b, double c) {
        if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2) || Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2) || Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2))
            System.out.println("Triangle with edges" + " " + a + "," + b + "," + c + " " + "is a right angled traingle");
        else
            System.out.println("Triangle with edges" + " " + a + "," + b + "," + c + " " + "is not a right angled traingle");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all three edges of traingle to check:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        rightTriangle(a, b, c);
    }
}
