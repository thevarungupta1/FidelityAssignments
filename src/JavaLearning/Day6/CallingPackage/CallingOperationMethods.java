package JavaLearning.Day6.CallingPackage;

import JavaLearning.Day6.PrimaryPackage.Operations;

public class CallingOperationMethods {
    public static void main(String[] args) {
        Operations ops1= new Operations();
        ops1.add(10,20);
        ops1.subtract(20,30);
        ops1.multiply(20,10);
        ops1.divide(20,10);
        ops1.factorial(5);
        ops1.reverse();

    }
}
