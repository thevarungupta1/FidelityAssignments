package Day12.Question3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class readInput {
public static void main(String args[]) throws IOException {
	BufferedReader rd= new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter you address");
	String Myaddress= rd.readLine();
	System.out.println(Myaddress);
}
}
