package JavaLearning.Day16;

import java.util.ArrayList;
import java.util.Collections;

public class Question11_JoinTwoArrayList {
    public static void main(String[] args) {
        ArrayList<String> l1= new ArrayList<String>();
        l1.add("One");
        l1.add("Two");
        l1.add("Three");
        l1.add("Four");
        l1.add("Five");
        System.out.println("List of first array: " + l1);

        ArrayList<String> l2= new ArrayList<String>();
        l2.add("Six");
        l2.add("Seven");
        l2.add("Eight");
        l2.add("Nine");
        l2.add("Ten");
        System.out.println("List of second array: " + l2);

        //join the list1 and list2
        ArrayList<String> a = new ArrayList<String>();
        a.addAll(l1);
        a.addAll(l2);
        System.out.println("List of new array is: " + a);


    }
}