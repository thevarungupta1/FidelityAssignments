package ExceptionAssignment;


class CastException
{
  int a = 10;
}
public class ClassCastException extends CastException
{
	public static void main (String[] args) {
		
		CastException cast = new CastException();
		ClassCastException sub =(ClassCastException)cast;
		System.out.println(sub.a);
	}
}
