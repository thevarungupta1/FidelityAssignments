package ExceptionHandling.Question1;
import java.util.Scanner;

public class ArrayIndex {
 int[] a = new int[3];
 
 public void initializeArray() throws Exception {
	 System.out.println("Initiazing Integer Array");
	 Scanner s= new Scanner(System.in);
	 System.out.println("Enter any integer");
	 for(int i=0;i<=3;i++) {
		 a[i]= s.nextInt();
		 }
 }
	 
	 public void printArray(){ 
	 System.out.println("Print Array");
	 for(int i=0;i<3;i++) {
		 System.out.println(a[i]);
	 }
	 }
	 
 }

