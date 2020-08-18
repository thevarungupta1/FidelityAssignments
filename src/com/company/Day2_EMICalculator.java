package com.company;

import java.util.Scanner;

public class Day2_EMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the loan amount:");
        float amount = sc.nextFloat();

        System.out.print("Enter the rate of interest:");
        float ROI = sc.nextFloat();

        System.out.print("Enter the loan duration:");
        float duration = sc.nextInt();

        ROI = ROI / (12 * 100);
        duration = duration * 12;

        float monemi = (amount * ROI * (float) Math.pow(1 + ROI, duration)) / (float) (Math.pow(1 + ROI, duration) - 1);
        System.out.println("Monthly emi to be paid is :" + " " + monemi);
    }
}
