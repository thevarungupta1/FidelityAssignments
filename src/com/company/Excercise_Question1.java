package com.company;

class arithmetic {
    int a, b, c;

    arithmetic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int add() {
        return a + b + c;
    }
}

class adder extends arithmetic {
    adder(int a, int b, int c) {
        super(a, b, c);
    }
}

public class Excercise_Question1 {

    public static void main(String[] args) {
        adder ad = new adder(3, 4, 5);
        System.out.println(ad.add());
    }
}
