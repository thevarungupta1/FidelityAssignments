package JavaLearning.Day6.PrimaryPackage;

public class Operations {
    double i;
    double j;
    public void add(double i, double j){
        this.i=i;
        this.j=j;
        double sum= i+j;
        System.out.println("Addition of two number: " + sum);
    }
    public void subtract(double i, double j){
        this.i=i;
        this.j=j;
        double subtraction;
        if (i>j)
            subtraction= i-j;
        else
            subtraction= j-i;
        System.out.println("Subtraction of two number: " + subtraction);
    }
    public void multiply(double i, double j){
        this.i=i;
        this.j=j;
        double multiplication= i*j;
        System.out.println("Multiplication of two number: " + multiplication);
    }
    public void divide(double i, double j){
        this.i=i;
        this.j=j;
        double division= i/j;
        System.out.println("Division of two number: " + division);
    }
    public void factorial(double i){
        this.i=i;
        double factorial = 1;
        for(int j = 1; j <= i; j++)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial of the given number is: " + factorial);
    }
    public void reverse(){
        int number=2345;
        int reverseNumber=0;
        while(number!=0){
            reverseNumber= reverseNumber * 10;
            reverseNumber= reverseNumber + number%10;
            number=number/10;
        }
        System.out.println("Reverse of the given number is: " + reverseNumber);
    }
}
