
public class ReverseDigit {

	public static int reverse() {
		int num=12345;
		int rev=0;

		while(num>0) {
			rev=(rev*10)+num%10;
			num=num/10;
		}
		System.out.println("Reverse of number is: " + rev);
		return rev;
	}


	public static void main(String[] args) {
		ReverseDigit.reverse();
	}
}
