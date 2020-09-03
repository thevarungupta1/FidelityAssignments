package Exception_assigment;

public class ArrayOutOfBound {
   public static void main(String[] args)
   {
	   int arr[]={2,3,4,5};
	   
	   try{
		   System.out.println(arr[5]);
	   }catch(IndexOutOfBoundsException e)
	   {
		   System.out.println("Array indexout of bound");
		   e.printStackTrace();
	   }
   }
}
