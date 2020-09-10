package com.company;


class tableoffive extends Thread {
    public void run() {
        int num = 5;
        for (int i = 1; i <= 10; i++)
            System.out.println(num + "X" + i + " = " + num * i);
    }
}

public class Day13_Table5eventhreadtask {
    public static void main(String[] args) {

        tableoffive fv = new tableoffive();
        fv.start();

        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 20; i++) {
                    if (i % 2 == 0) {
                        System.out.println("even thread " + i);
                    }
                }
            }
        };
        t1.start();
    }
}
