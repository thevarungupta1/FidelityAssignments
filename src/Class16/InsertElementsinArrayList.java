package Class16;

import java.util.ArrayList;

public class InsertElementsinArrayList {

	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<5;i++) {
			list.add(i);
		}
		System.out.println("Array List Before Inserting an element"+list);
		insertElementInList(list);
	}
	public static void insertElementInList(ArrayList<Integer> lst) {
		lst.add(0, 50);
		System.out.println("Array List after Inserting an element"+lst);
	}

}
