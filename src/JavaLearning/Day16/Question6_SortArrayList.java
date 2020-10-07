package JavaLearning.Day16;

import java.util.*;
public class Question6_SortArrayList {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("jack");
        list_Strings.add("mark");
        list_Strings.add("arsenal");
        list_Strings.add("susy");
        list_Strings.add("jane");
        System.out.println("List before sort: "+list_Strings);
        Collections.sort(list_Strings);
        System.out.println("List after sort: "+list_Strings);
    }
}