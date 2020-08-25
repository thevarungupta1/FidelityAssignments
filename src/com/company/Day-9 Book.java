
	abstract class Book{

		String title;

		abstract void setTitle(String s);

		String getTitle(){

		return title;

		}

		}
class MyBook extends Book{

	@Override
	void setTitle(String s) {
		System.out.println("Title of the book is: "+s);
		
	}
}
class Test{
	public static void main(String[]args) {
		Book m=new MyBook();
		m.setTitle("Da vinci code");
	}
}
