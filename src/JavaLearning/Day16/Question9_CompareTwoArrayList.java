package JavaLearning.Day16;

import java.util.*;
public class Question9_CompareTwoArrayList {
    public static void main(String[] args) {
        ArrayList<String> l1= new ArrayList<String>();
        l1.add("One");
        l1.add("Two");
        l1.add("Three");
        l1.add("Four");
        l1.add("Five");
        System.out.println("List1: " + l1);

        ArrayList<String> l2= new ArrayList<String>();
        l2.add("Four");
        l2.add("Five");
        l2.add("Three");
        l2.add("One");
        l2.add("Two");
        System.out.println("List2: " + l2);

        ArrayList<String> l3 = new ArrayList<String>();
        for (String s : l1)
            l3.add(l2.contains(s) ? "true" : "false");
        System.out.println(l3);

    }
}