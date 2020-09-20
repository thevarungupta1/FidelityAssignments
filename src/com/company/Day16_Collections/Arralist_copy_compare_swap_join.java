package com.company.Day16_Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Arralist_copy_compare_swap_join {
    public static void main(String[] args) {

        System.out.println("*************Copying one arraylist into another***********" + "\n");
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Sample1");
        a1.add("Sample2");
        a1.add("Sample3");

        ArrayList<String> a2 = new ArrayList<>();
        a2.add("1Sample");
        a2.add("2Sample");
        a2.add("3Sample");

        System.out.println("Before copying arraylist1 " + " " + a1 + "\n");
        System.out.println("Before copying arraylist2 " + " " + a2 + "\n");

        System.out.println("Copying arraylist1 into arraylist2" + "\n");

        Collections.copy(a2, a1);

        System.out.println("After copying arraylist 2 elements" + " " + a2 + "\n");

        System.out.println("*********Comparing two arraylists****************" + "\n");

        if (a1.equals(a2)) {
            System.out.println("Given two lists are equal" + "\n");
        } else {
            System.out.println("Given two lists are not equal" + "\n");
        }

        System.out.println("*************Join two array list*********" + "\n");

        ArrayList<String> a3 = new ArrayList<>();
        a3.add("arraylist3element1");
        a3.add("arraylist3element2");

        System.out.println("Before joining array list" + a1 + "\n");
        System.out.println("New array list" + a3 + "\n");

        System.out.println("Joining two array lists" + "\n");
        a1.addAll(a3);

        System.out.println("After joining array list" + " " + a1);

        System.out.println("************Swapping two elements of arraylist***************" + "\n");

        System.out.println("Before swapping arralist" + " " + a1 + "\n");
        Collections.swap(a1, 2, 3);

        System.out.println("After swapping arraylist" + " " + a1);


    }
}
