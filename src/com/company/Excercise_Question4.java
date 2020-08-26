package com.company;

class cycle {
    public void statement() {
        System.out.println("My ancestor is a cycle who is a vehicle with pedals");
    }
}

class motocycle extends cycle {
    public void statement() {
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
        super.statement();
    }
}

public class Excercise_Question4 {

    public static void main(String[] args) {
        motocycle m = new motocycle();
        m.statement();
    }
}
