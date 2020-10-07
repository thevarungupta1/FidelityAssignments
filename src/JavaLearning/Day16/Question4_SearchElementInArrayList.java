package JavaLearning.Day16;

import java.util.*;
public class Question4_SearchElementInArrayList {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("One");
        list_Strings.add("Two");
        list_Strings.add("Three");
        list_Strings.add("Four");
        list_Strings.add("Five");
        // Search the value Three
        if (list_Strings.contains("Three")) {
            System.out.println("Found the element Three in array list!!!");
            System.out.println(list_Strings.toString());
        } else {
            System.out.println("There is no such element in this array list!!!");
        }
    }
}