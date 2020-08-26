package com.company;

import java.util.Scanner;

class myCalculator implements interfaceadvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        System.out.print("Divisors of" + " " + n + " " + "are :");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        myCalculator sx = new myCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for which you want divisors and their sum:"+" ");
        int divnum = sc.nextInt();
        System.out.println("\n" + "Divisors sum is :" + " " + sx.divisor_sum(divnum));
    }
}


