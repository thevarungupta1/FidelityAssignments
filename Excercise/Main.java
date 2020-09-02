package excercise;

class Main extends MyBook{

	@Override
	void setTitle(String Title) {
		System.out.println("book title as:-"+Title);
		
	}
	
	public static void main(String[] args)
	{
		Main mb=new Main();
		mb.setTitle("Gita");
	}
	
}


