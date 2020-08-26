package Assigment;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MyCalculator implements AdvancedArithmetic {

	
	int i;
	
	static ArrayList j = new ArrayList();

	public ArrayList divisor_sum(int n) {
	
		for (i = 0; i <= n; i++) {
			if (i > 0 && n % i == 0) {
				j.add(i);
				
			} else {
				continue;
			}
		}
		return j;
	}
	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		ArrayList arr = calc.divisor_sum(1000);
		System.out.println("Below is list of number in array format which are divisible by number :"+1000);
		System.out.println(arr);
	}

}
