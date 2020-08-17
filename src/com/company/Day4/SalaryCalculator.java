package com.company;

import java.util.Scanner;

public class Day4_SalaryCalculator {


    public static void get_salary_inputs(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter basic amount: ");
        double basic=sc.nextDouble();

        System.out.println("Enter hra: ");
        double hra=sc.nextDouble();

        System.out.println("Enter da amount: ");
        double da = sc.nextDouble();

        System.out.println("Enter tax per to be paid :");
        double taxper=sc.nextDouble();

        salary_calculation(basic, hra, da, taxper);

    }

    public static void salary_calculation(double BASIC, double HRA, double DA, double TAXPER)
    {
        double grosssalary= BASIC + HRA + DA;
        double netsalary= grosssalary - ((TAXPER/100)*grosssalary);
        System.out.println("Salary is :"+ netsalary);
    }

    public static void main(String[] args) {

        get_salary_inputs();
    }
}
