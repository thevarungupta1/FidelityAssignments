package Day16;

import java.util.ArrayList;

public class CompareTwoList {
	public static void main(String[] args)
	{
		ArrayList<Integer> str=new ArrayList<>();
		str.add(12);
		str.add(33);
		str.add(18);
		
		ArrayList<Integer> str1=new ArrayList<>();
		str1.add(12);
		str1.add(33);
		str1.add(18);
		
		boolean eql=str.equals(str1);
		System.out.println(eql);
		if(eql==true)
			System.out.println("Both List equal");
		else
			System.out.println("Lists are different");
		ArrayList<Integer> str2=new ArrayList<>();
		str2.add(13);
		str2.add(33);
		str2.add(18);

		boolean eqll=str.equals(str2);
		System.out.println(eqll);
		if(eqll==true)
			System.out.println("Both List equal");
		else
			System.out.println("Lists are different");
		
}
}
