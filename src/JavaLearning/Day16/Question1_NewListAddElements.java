package JavaLearning.Day16;

import java.util.ArrayList;
import java.util.List;

public class Question1_NewListAddElements {
    public static void main(String[] args) {
        List<String> element = new ArrayList<String>();
        element.add("One");
        element.add("Two");
        element.add("Three");
        element.add("Four");
        element.add("Five");
        System.out.println("List of strings: " +element);
    }
}