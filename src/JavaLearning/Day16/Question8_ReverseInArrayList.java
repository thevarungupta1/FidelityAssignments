package JavaLearning.Day16;
import java.util.*;
public class Question8_ReverseInArrayList {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("One");
        list_Strings.add("Two");
        list_Strings.add("Three");
        list_Strings.add("Four");
        list_Strings.add("Five");
        System.out.println("List before reversing :\n" + list_Strings);
        Collections.reverse(list_Strings);
        System.out.println("List after reversing :\n" + list_Strings);
    }
}
