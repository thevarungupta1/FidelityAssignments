package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Day12_FileorDirPathExist {
    public static void checkFileorDirPathExist(File dir) {

        if (dir.isDirectory()) {
            if (dir.exists()) {
                System.out.println("Directory with pathname" + " " + dir.getAbsolutePath() + " " + "exists");
            } else {
                System.out.println("Directory with pathname" + " " + dir.getAbsolutePath() + " " + "does not exist");
            }
        } else {
            if (dir.exists()) {
                System.out.println("File with pathname" + " " + dir.getAbsolutePath() + " " + "exists");
            } else {
                System.out.println("File with pathname" + " " + dir.getAbsolutePath() + " " + "does not exist");
            }
        }
    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the directory for which you want to display files or directories:");
        String dirpath = sc.nextLine();
        File currentDir = new File(dirpath); // current directory
        checkFileorDirPathExist(currentDir);

    }
}
