package JavaLearning.Day16;

import java.util.ArrayList;
import java.util.List;

public class Question2_AddAtFirstPositionOfArrayList {
    public static void main(String[] args) {
        //add elements in string
        List<String> element1 = new ArrayList<>();
        element1.add("One");
        element1.add("Two");
        element1.add("Three");
        element1.add("Four");
        element1.add("Five");
        System.out.println("List of strings: " + element1);

        //add element to first position in string
        element1.add(0, "Zero");
        System.out.println("New List of strings: " + element1);
    }
}
