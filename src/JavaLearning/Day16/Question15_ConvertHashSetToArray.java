package JavaLearning.Day16;

import java.util.*;
public class Question15_ConvertHashSetToArray {
    public static void main(String[] args) {
        HashSet<String> h1 = new HashSet<String>();
        h1.add("One");
        h1.add("Two");
        h1.add("Three");
        h1.add("Four");
        h1.add("Five");
        System.out.println("Original Hash Set: " + h1);

        // Creating an Array from hast set
        String[] newArray = new String[h1.size()];
        h1.toArray(newArray);

        // Display after conversion
        System.out.println("Array elements: ");
        for(String element : newArray){
            System.out.println(element);
        }
    }
}