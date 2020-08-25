package JavaLearning.Day9Assignment;

import java.util.Scanner;

interface AdvancedArithmetic{
     int signature_divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{
    int divisor_sum = 0;

    @Override
    public int signature_divisor_sum(int n) {
        if(n>1000)
            System.out.println("The value of n should not exceed 1000. Try again!!");
        else {
            for(int i=1; i<=n;i++){
                if(n%i==0) {
                    divisor_sum = divisor_sum+i;}}
        }
        return divisor_sum;
    }
}

public class Question3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        MyCalculator calculate= new MyCalculator();
        int n= sc.nextInt();
        int result = calculate.signature_divisor_sum(n);
        System.out.println("The divisor sum is: " + result);
    }
}
