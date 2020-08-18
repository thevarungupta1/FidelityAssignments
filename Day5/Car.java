package Day5;

class Car {
	public String color;
	public String Name;
	
	public void display()
	{
	  System.out.println("This is parnet class");
	}

}

class bmw extends Car{
	public void display(){
		System.out.println("this is BMW");
	}
}


class merc extends Car{
	public void display(){
		System.out.println("this is MERC");
	}
}

class buyCar{
	public static void main(String[] args)
	{
		bmw bm=new bmw();
		merc mr=new merc();
		bm.display();
		mr.display();
	}
}