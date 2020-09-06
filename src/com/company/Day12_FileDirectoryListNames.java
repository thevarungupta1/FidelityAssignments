package com.company;

import java.io.*;
import java.util.Scanner;

public class Day12_FileDirectoryListNames {

    public static void displayDirectoryContents(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("directory:" + file.getAbsolutePath());
                displayDirectoryContents(file);
            } else {
                System.out.println("file:" + file.getAbsolutePath());
            }
        }
    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the directory for which you want to display files or directories:");
        String dirpath = sc.nextLine();
        File currentDir = new File(dirpath); // current directory
        displayDirectoryContents(currentDir);

    }
}


