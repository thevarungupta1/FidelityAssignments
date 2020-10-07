package JavaLearning.Day16;

import java.util.ArrayList;
import java.util.Collections;

public class Question10_SwapElementInArrayList {
    public static void main(String[] args) {
        ArrayList<String> l1= new ArrayList<String>();
        l1.add("One");
        l1.add("Two");
        l1.add("Three");
        l1.add("Four");
        l1.add("Five");

        System.out.println("Array list before Swap:");
        for(String s1: l1){
            System.out.println(s1);
        }

        Collections.swap(l1, 0, 1);
        System.out.println("Array list after swap:");
        for(String s2: l1){
            System.out.println(s2);
        }
    }
}
