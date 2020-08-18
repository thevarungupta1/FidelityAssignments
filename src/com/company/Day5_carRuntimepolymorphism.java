package com.company;

class car {
    public void display() {
        System.out.println("Base class specifications");
    }
}

class merc extends car {
    public void display() {
        System.out.println("Mercedes specifications");
    }
}

class bmw extends car {
    public void display() {
        System.out.println("BMW specifications");
    }
}


public class Day5_carRuntimepolymorphism {

    public static void main(String[] args) {
        car c = new merc();
        c.display();

        car ch = new bmw();
        ch.display();

        car ca = new car();
        ca.display();
    }

}
