package Day13.Question2;

public class ThreadMain {
public static void main(String args[]) {
		int number=20;
		for(int i=1;i<=number;i++) {
			int temp= i%2;
			if(temp==0) {
				System.out.println("Even Number" +i);
				}
			try{
				Thread.sleep(1000);
			}
	catch(Exception e) {
		e.printStackTrace();
	}
		}
	
	
	Thread t1 = new Thread();
	Threadone t2 = new Threadone();
	Thread t3 = new Thread(t2);
	t1.start();
	t3.start();
}
}