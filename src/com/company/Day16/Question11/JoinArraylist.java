package Day16.Question11;
import java.util.ArrayList;

public class JoinArraylist {
	public static void main(String args[]) {
			ArrayList<String> empAId = new ArrayList<String>();
			empAId.add("A100");
			empAId.add("A200");
			empAId.add("A300");
			empAId.add("A400");
			
			System.out.println("First ArrayList:");
			for(String s :empAId ) {
				System.out.println(s);
			}
			
			ArrayList<String> newEmpAId = new ArrayList<String>();
			
			newEmpAId.add("A500");
			newEmpAId.add("A600");
			newEmpAId.add("A700");
			newEmpAId.add("A800");
			
			System.out.println();
			System.out.println("Second ArrayList:");
			for(String s :newEmpAId ) {
				System.out.println(s);
			}
			
			System.out.println("Joining Two ArrayList:");
			
			
			empAId.addAll(newEmpAId);
			
			System.out.println();
			System.out.println("After joining Two ArrayList:");
			
			for(String s: empAId ) {
				System.out.println(s);
			}
			
			
	}

}
