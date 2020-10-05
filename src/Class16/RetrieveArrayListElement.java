package Class16;

import java.util.ArrayList;
import java.util.List;

public class RetrieveArrayListElement {

	public static void main(String[] args) {
		List<Character> ch = new ArrayList<>();
		for(char i='a';i<='h';i++) {
			ch.add(i);
		}
		System.out.println("Character Array List"+ch);
		char retrieveLetter =ch.get(6);
		System.out.println();
		System.out.println("Letter retrieved : "+retrieveLetter);

	}

}
