package JavaLearning.Day16;

import java.util.LinkedList;

public class Question12_AppendElementAtEndOfLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("One");
        l1.add("Two");
        l1.add("Three");
        l1.add("Four");
        l1.add("Five");
        System.out.println("The linked list on appending many elements: " + l1);
    }
}