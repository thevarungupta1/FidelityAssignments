package Day16;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElement {
      public static void main(String[] args)
      {
    	  ArrayList<String> str=new ArrayList<>();
    		str.add("puja");
    		str.add("nita");
    		str.add("arti");
    		str.add("vindu");
    		str.add("nisha");
    		
    		System.out.println("element of list:-");
    		for(String s:str)
    		System.out.println(s);
    		
    		Collections.swap(str, 2, 3);
    		
    		System.out.println("element of list after swapping:-");
    		for(String s:str)
    		System.out.println(s);
      }
}
