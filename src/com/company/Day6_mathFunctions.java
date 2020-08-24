package com.company;

import java.math.BigInteger;

public class Day6_mathFunctions {

    public void substraction(int a, int b) {
        if (a > b)
            System.out.println("The result of substration is:" + " " + (a - b));
        else System.out.println("The result of substraction is:" + " " + (b - a));
    }

    public void multiply(int a, int b) {
        System.out.println("The result of multiplication is:" + " " + (a * b));
    }

    public void divide(int a, int b) {
        System.out.println("The result of divison is:" + " " + (double) (a / b));
    }

    public void factorial(int a) {
        BigInteger ininum = BigInteger.valueOf(1);
        if (a == 0 || a == 1) {
            System.out.println("Factorial result of"+" "+a+"is :" + " " + ininum);
        } else {
            for (int i = 2; i <= a; i++) {
                ininum = ininum.multiply(BigInteger.valueOf(i));
            }
            System.out.println("Factorial result of"+" "+a+" "+"is :"+" "+ ininum);
        }
    }

    public void digitreversing(int a) {
        int count = 0;
        while (a > 0) {
            int rem = a % 10;
            count = count * 10 + rem;
            a = a / 10;
        }
        System.out.println("Reverse of first number"+" "+"is :"+" "+ count);
    }
}
