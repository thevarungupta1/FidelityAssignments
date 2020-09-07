package ExceptionAssignment;

public class ArrayIndexOutOfBoud {

	static int[] arr = new int[4];
	public static void array() {
		for (int i : arr) {
			System.out.println(arr[4]);
		}
	}
	public static void main(String[] args) {
		array();
	}

}
