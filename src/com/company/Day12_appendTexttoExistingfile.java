package com.company;

import java.io.*;
import java.util.Scanner;

public class Day12_appendTexttoExistingfile {

    public static void appendToexistingfile(String filename, String str) {
        try {
            BufferedWriter out = new BufferedWriter(
                    new FileWriter(filename, true));
            out.write(str);
            out.close();
            System.out.println("Operation done successfully !");
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }

    public static void readingfile(String filepath) {
        try {
            BufferedReader in = new BufferedReader(
                    new FileReader(filepath));

            String mystring;
            while ((mystring = in.readLine()) != null) {
                System.out.println(mystring);
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred" + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file for which you want to read line by line:");
        String filepath = sc.nextLine();

        System.out.println("Before appending file contents:");
        readingfile(filepath);

        System.out.println("Enter the text to append in file");
        String strtoappend = sc.nextLine();

        appendToexistingfile(filepath, strtoappend);

        System.out.println("After appending file contents:");
        readingfile(filepath);


    }
}
