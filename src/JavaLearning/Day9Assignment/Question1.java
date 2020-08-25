package JavaLearning.Day9Assignment;

import java.util.Scanner;

class Arithmetic {
    int a;
    int b;

    Arithmetic() {
    }

    Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void add(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of the given numbers is: " + sum);
    }
}
    class Adder extends Arithmetic {
        Adder() {
            super();
        }
        Adder(int a, int b) {
            this.a=a;
            this.b=b;
        }
    }

    class Question1{
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number1: ");
        int a = sc.nextInt();
        System.out.println("Enter number2: ");
        int b = sc.nextInt();
//      Arithmetic obj1= new Arithmetic(a, b);
//      obj1.add(a,b);
        Adder obj2 = new Adder(a, b);
        obj2.add(a,b);
    }
}
