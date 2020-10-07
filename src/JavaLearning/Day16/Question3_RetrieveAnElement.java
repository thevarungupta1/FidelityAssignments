package JavaLearning.Day16;

import java.util.ArrayList;
import java.util.List;

public class Question3_RetrieveAnElement {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        //add to the list
        list_Strings.add("One");
        list_Strings.add("Two");
        list_Strings.add("Three");
        list_Strings.add("Four");
        list_Strings.add("Five");
        // Print the list
        System.out.println(list_Strings);
        // Retrive the first element
        String element = list_Strings.get(0);
        System.out.println("First element: "+element);
        // Retrive the fourth element
        element = list_Strings.get(3);
        System.out.println("Fourth element: "+element);
    }
}
