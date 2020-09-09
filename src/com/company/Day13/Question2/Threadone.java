package Day13.Question2;

public class Threadone implements Runnable{

	@Override
	public void run() {
			int num =5;
			for(int i=1;i<=10;i++) {
				System.out.println(num + "*" + i+ "=" +num*i);
				try {
					Thread.sleep(1000);
				}
					catch(Exception e) {
						e.printStackTrace();
					}
			}
	
}
}