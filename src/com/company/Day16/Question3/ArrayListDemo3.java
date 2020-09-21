package Day16.Question3;
import java.util.ArrayList;

public class ArrayListDemo3 {
public static void main(String args[]) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("Neha");
	al.add("Bharti");
	al.add("Ekta");
	
	System.out.println("Retriving elements using index");
	System.out.println(al.get(0));
	System.out.println(al.get(2));
	System.out.println(al.get(1));
	
}
}
