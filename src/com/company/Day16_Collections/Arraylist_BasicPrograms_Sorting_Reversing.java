package com.company.Day16_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist_BasicPrograms_Sorting_Reversing {
    public static void main(String[] args) {

        System.out.println("***********Creating arraylist and printing itanswer**********");
        ArrayList<String> a = new ArrayList<>();
        a.add("Sample1");
        a.add("Sample2");
        a.add("Sample3");
        a.add("Sample4");

        System.out.println(a);

        System.out.println("*******************Inerting element at first postion*******");
        a.add(0, "Sample5");
        System.out.println("After adding element at first index arraylist is" + " " + a);

        System.out.println("***************Retreving element at specified index**********");
        System.out.println("Element at 3rd index is" + " " + a.get(3));

        System.out.println("***************Searching string in arraylist**************");
        System.out.println("Enter the string which you want to search in array list");

        Scanner sc = new Scanner(System.in);
        String stringtosearch = sc.nextLine();

        if (a.contains(stringtosearch)) {
            System.out.println("Element present at index" + " " + a.indexOf(stringtosearch));
        } else {
            System.out.println("Element not present in the list");
        }

        System.out.println("**********Sorting arraylist***********");
        System.out.println("Before sorting arraylist is " + " " + a);
        Collections.sort(a);
        System.out.println("After sorting arraylist is " + " " + a);

        System.out.println("*********Reversing arraylist*********");
        Collections.reverse(a);
        System.out.println("After reversing arraylist" + " " + a);

    }
}
