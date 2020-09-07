//demonstrate ArrayIndexOutOfBoundsException
package exceptionsAssignment;

public class ExceptionOne {
	
	public static void main(String[] args) {
		String a[]= {"Alex", "Joe", "Rab"};
		for (int i=0;i<=a.length;i++) {
			System.out.println(a[i]);
		}

	}
}
