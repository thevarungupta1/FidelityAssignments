package com.package1;

import com.company.Day6_mathFunctions;

import java.util.Scanner;

public class Day6_secondassign {

    public static void main(String[] args) {
        Day6_mathFunctions d = new Day6_mathFunctions();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values for which operation needs to be done:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        d.substraction(a, b);
        d.multiply(a, b);
        d.divide(a, b);
        d.factorial(a);
        d.digitreversing(a);
    }
}
