package JavaLearning.Day16;

import java.util.LinkedList;
import java.util.Iterator;

public class Question13_IterateLinkedListInReverseOrder {
    public static void main(String[] args) {
            LinkedList<String> l1 = new LinkedList<String>();
            l1.add("One");
            l1.add("Two");
            l1.add("Three");
            l1.add("Four");
            l1.add("Five");
            System.out.println("The linked list in initial order: " + l1);

            Iterator i = l1.descendingIterator();
            System.out.println("Elements in Reverse Order:");

            while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}