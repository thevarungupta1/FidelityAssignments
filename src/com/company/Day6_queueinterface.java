package com.company;


import java.util.Scanner;

interface queue {
    void insert();

    void delete();
}

class operations implements queue {

    @Override
    public void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want to insert:");
        String newstring = "" + sc.nextLine();
        System.out.println("Added string is :" + " " + newstring);

    }

    @Override
    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String string = sc.nextLine();

        System.out.print("Enter the middle word need to be deleted:");
        String word = sc.nextLine();

        if (string.contains(word))
            string = string.replaceAll(word + " ", "");
        System.out.println("After deletion string is:" + " " + string);
    }
}

public class Day6_queueinterface {
    public static void main(String[] args) {
        operations op = new operations();
        op.insert();
        op.delete();
    }
}
