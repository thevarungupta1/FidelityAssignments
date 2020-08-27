package Assigment;

import java.util.Scanner;

public class MissingLetter {

	static char[] c;
	static int temp = 0;
	static int ascii;
	boolean flag = false;
	String s = "";
	char f;
	Scanner sc = new Scanner(System.in);

	public void enterChar_storeCharArray() {
		System.out.println("Enter your character :");
		char ch[] = sc.next().toCharArray();
		for (char c : ch) {
			ascii = (int) c;
			int check = ascii - temp;
			if (check > 1 && temp != 0) {
				for(int k=1;k<check;k++) {
					f = (char) (temp + k);
					s = s + " " + f;
				}
				flag = true;
			}
			temp = ascii;
		}
		if (flag) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {

		MissingLetter ml = new MissingLetter();
		ml.enterChar_storeCharArray();

	}

}
