package com.company.Day16_Collections;

import java.util.HashSet;

public class HashsetOperation {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("element1");
        hs.add("element2");
        hs.add("element3");
        hs.add("element4");

        System.out.println("Before conversion hash set" + " " + hs + "\n");

        String[] arr = new String[hs.size()];
        System.out.println("After conversion into array , array elements are: " + "\n");
        hs.toArray(arr);

        for (String s : arr) {
            System.out.println(s);
        }


    }
}
