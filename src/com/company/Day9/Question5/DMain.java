package Day9.Question5;
import java.util.Scanner;

public class DMain {
	public static void main(String args[]) {
		BoxArray BA = new BoxArray();
		
	/*	Scanner sc= new Scanner(System.in);
		System.out.println("Intialiaze box1");
		for(int i=0;i< box1.length;i++) {
			box1[i]= sc.nextInt();
		}
*/
		int toatlVolume = BA.getTotalVolume();
		System.out.println(toatlVolume);
	}

}
