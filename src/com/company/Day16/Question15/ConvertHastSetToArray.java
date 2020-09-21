package Day16.Question15;

import java.util.HashSet;

public class ConvertHastSetToArray {
	public static void main(String args[]){
		HashSet<String> hash1 = new HashSet<String>();
		hash1.add("One");
		hash1.add("Two");
		hash1.add("Three");
		hash1.add("Four");
		
		System.out.println("Printing Hashset");
		for(String s: hash1) {
			System.out.println(s);
		}
		
		String[] arrayOne = new String[hash1.size()];
		hash1.toArray(arrayOne);
		
		
		System.out.println();
		System.out.println("Printing Array");
		for(String b : arrayOne) {
			System.out.println(b);
		}
		
	}
	

}
