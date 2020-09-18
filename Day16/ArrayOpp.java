package Day16;

import java.util.ArrayList;

public class ArrayOpp {
	
	public static void main(String[] args)
	{
		//Create ArrayList, add value in List and print the List
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(5);
		arr.add(10);
		arr.add(1);
		arr.add(8);
		arr.add(22);
		
		for(Integer it:arr)
		{
			System.out.println("arrayList value as:-"+it);
		}
		
		//Insert value at 1st position
		arr.add(0, 4);
		System.out.println("After insertion");
		for(Integer it:arr)
		{
			System.out.println("arrayList value as:-"+it);
		}
		
		//Retrive element at specified index
		System.out.println(arr.get(3));
		
		//Search an element in list
		
		arr.contains(10);
		
		if(arr.contains(10))
		{
			System.out.println("element present in list");
		}
		else
			System.out.println("element not present in list");
	}

}
