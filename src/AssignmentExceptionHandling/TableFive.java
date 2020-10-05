package AssignmentExceptionHandling;

public class TableFive
{
	public void evenNumbers(int n) {
		System.out.println(Thread.currentThread());
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println("This is even no"+" "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		TableFive obj = new TableFive();
		obj.evenNumbers(40);
		Test t = new Test();
		t.start();
	}
}
 class Test extends Thread
 {
	 public void run() {
			int i=5;
			System.out.println(Thread.currentThread());
			for(int j=1;j<=10;j++) {
				System.out.println(i +"*"+ j+" ="+i*j);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
 }