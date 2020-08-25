package JavaLearning.Day9Assignment;

import java.util.Scanner;
class RightAngledTriangle {
    int a;
    int b;
    int c;

    public RightAngledTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void correctRightAngledTriangle() {
        if (a > b && a > c) {
            if (a * a == (b * b) + (c * c)) {
                System.out.println("The sides given make it a right angled Triangle");
            } else {
                System.out.println("It is NOT a right angled triangle");
            }
        } else if (b > c) {
            if (b * b == (a * a) + (c * c)) {
                System.out.println("This is a right angled Triangle");
            } else {
                System.out.println("It is NOT a right angled triangle");
            }
        } else {
            if (c * c == (a * a) + (b * b)) {
                System.out.println("This is a right angled Triangle");
            } else {
                System.out.println("It is NOT a right angled triangle");
            }
        }
    }
}

public class Question6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first side of the triangle");
        int a = sc.nextInt();
        System.out.println("Enter the second side of the triangle");
        int b = sc.nextInt();
        System.out.println("Enter the third side of the triangle");
        int c = sc.nextInt();
        RightAngledTriangle triangle = new RightAngledTriangle(a,b,c);
        triangle.correctRightAngledTriangle();
    }
}
