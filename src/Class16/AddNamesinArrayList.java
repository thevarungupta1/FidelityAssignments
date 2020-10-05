package Class16;

import java.util.ArrayList;

public class AddNamesinArrayList {
	ArrayList<String> names = new ArrayList<String>();

	public void printNames() {
		names.add("John");
		names.add("Mac");
		names.add("Jack");
		System.out.println(names);
	}

	public static void main(String[] args) {
		AddNamesinArrayList list = new AddNamesinArrayList();
		list.printNames();
	}
}
