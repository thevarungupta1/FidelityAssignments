package JavaLearning.Day16;

import java.util.LinkedList;
public class Question14_InsertElementInLinkedListAtFirstAndLastPosition {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("One");
        l1.add("Two");
        l1.add("Three");
        l1.add("Four");
        l1.add("Five");
        System.out.println("Intial original linked list: " + l1);
        // Add an element at the first position
        l1.addFirst("First");
        // Add an element at the last position
        l1.addLast("Last");
        System.out.println("Final linked list:" + l1);
    }
}
