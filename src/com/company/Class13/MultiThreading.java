package Class13;

public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MultiThreading thread = new MultiThreading();
		
		Thread thread = new Thread();
		String name = thread.currentThread().getName();
		for(int i =0; i<40;i++)
		{
			if((i%2)==0)
			{
			System.out.println(i);
		}}
		System.out.println(name);
	
	printTable table = new printTable();
	String newThread = table.currentThread().getName();
	System.out.println("Change of Thread");
	System.out.println(newThread);
	table.start();
	String newThread2 = table.currentThread().getName();
	System.out.println(newThread2);
	}
}

class printTable extends Thread
{
	public void run()
	{
		int n = 5;
		for (int i = 1; i<=10; i++)
		{
			System.out.println(n + "*" + i + "=" + n*i );
		}
	}
}
