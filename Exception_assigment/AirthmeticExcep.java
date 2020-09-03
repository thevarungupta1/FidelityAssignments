package Exception_assigment;

public class AirthmeticExcep {
	public static void main(String[] args)
	{
		int a=10;
		try
		{
			System.out.println(10/0);
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}

}
