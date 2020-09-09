package Day13.Question1;
import java.util.Scanner;

public class DMain {
public static void main(String args[]) {
	System.out.println("Enter any number");
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	s.close();
	PrimeNumbers pn = new PrimeNumbers(a);
	pn.checkPrimeNumbers();
	
}
}
