package JavaLearning.Day13;

import java.util.Scanner;

public class Question1 {

    public static void PrimeNumber(int a) {
        int count = 0;
        int max_count = a;
        int i;

        for (int number = 1; count < max_count; number++) {
            for (i = 2; number % i != 0; i++) ;

            if (i == number) {
                System.out.print(" " + number);
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers you want to display: ");

        try {
            int n = sc.nextInt();
            if (n > 0) {
                System.out.println("Prime numbers are: ");
                PrimeNumber(n);
            } else {
                System.out.println("Enter only positive integers");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Please enter only integer values");
        }
    }
}
