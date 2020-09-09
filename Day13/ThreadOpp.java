package Day13;


class thread1 extends Thread{
	public void run()
	{   
		int num=5;
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
}

class thread2 extends Thread
{
	public void run()
	{
		
		int num=40;
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
				System.out.println("Even number:-"+i);
		}
	}
	}
public class ThreadOpp {
	public static void main(String[] args)
	{
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		t1.start();
		t2.start();
	}

}
