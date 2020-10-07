package JavaLearning.Day16;
import java.util.*;
public class Question7_CopyArrayListIntoAnother {
    public static void main(String[] args) {
        List<String> List1 = new ArrayList<String>();
        List1.add("One");
        List1.add("Two");
        List1.add("Three");
        System.out.println("Before copy:");
        System.out.println("List1: " + List1);
        List<String> List2 = new ArrayList<String>();
        List2.add("1");
        List2.add("2");
        List2.add("3");
        System.out.println("List2: " + List2);
        // Copy List2 to List1
        Collections.copy(List1, List2);
        System.out.println("After copy:");
        System.out.println("List1: " + List1);
        System.out.println("List2: " + List2);
    }
}

