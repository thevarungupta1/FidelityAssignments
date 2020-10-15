//Write a Java program of swap two elements in an array list
package day16;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElements {

	public static void main(String[] args) {
		 ArrayList<String> c1= new ArrayList<String>();
         c1.add("Red");
         c1.add("Green");
         c1.add("Black");
         c1.add("White");
         c1.add("Pink");

         System.out.println("Array list before swapping:");
         for(String a: c1){
         System.out.println(a);
       }
         
        Collections.swap(c1, 0, 2);
         System.out.println("Array list after swapping:");
         for(String b: c1){
         System.out.println(b);
        }

	}

}
