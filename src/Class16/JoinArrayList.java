package Class16;

import java.util.ArrayList;
import java.util.Arrays;

public class JoinArrayList {

	public static void main(String[] args) {
		ArrayList lst1= new ArrayList<>(Arrays.asList("I","am"));
		ArrayList lst2= new ArrayList<>(Arrays.asList("the","best"));
		lst1.addAll(lst2);
		System.out.println(lst1);
	}

}
