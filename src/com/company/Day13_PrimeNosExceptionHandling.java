package com.company;

import java.util.Scanner;

public class Day13_PrimeNosExceptionHandling {

    public static void prime(int n) {
        int count = 0, max_count = n, i;

        for (int num = 1; count < max_count; num++) {
            for (i = 2; num % i != 0; i++) ;

            if (i == num) {
                System.out.print(" " + num);
                count++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of prime numbers which you want to display: ");

        try {
            int n = sc.nextInt();
            if (n > 0) {
                System.out.println("Prime numbers are: ");
                prime(n);
            } else {
                System.out.println("Enter only positive integers");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Please enter only integer values");
        }

    }
}
