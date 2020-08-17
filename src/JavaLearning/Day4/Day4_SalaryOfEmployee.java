package JavaLearning.Day4;

import java.util.Scanner;

public class Day4_SalaryOfEmployee {

    public static void inputsOfEmployeeSalary() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter basic_amount of the employee: ");
        double basic = input.nextDouble();

        System.out.println("Enter HRA of the employee: ");
        double hra = input.nextDouble();

        System.out.println("Enter DA of the employee: ");
        double da = input.nextDouble();

        System.out.println("Enter tax to be paid by the employee:");
        double taxpercentage = input.nextDouble();
        calculateSalaryOfEmployee(basic, hra, da, taxpercentage);
    }

    public static void calculateSalaryOfEmployee(double basic, double hra, double da, double taxpercentage) {
        double grossSalaryOfEmployee = basic + hra + da;
        taxpercentage = (taxpercentage / 100) * grossSalaryOfEmployee;
        double salaryOfEmployee = grossSalaryOfEmployee - taxpercentage;
        System.out.print("Salary of the employee : " + salaryOfEmployee);
    }

    public static void main(String[] args) {
        inputsOfEmployeeSalary();
    }
}

