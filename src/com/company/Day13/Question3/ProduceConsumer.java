package Day13.Question3;

public class ProduceConsumer {
     int item;
     boolean isproduce = false;
     
	public synchronized void produce(int item) throws InterruptedException {
		
		if(isproduce) {
			wait();
		}
		this.item= item;
		System.out.println("Starting to produce : " +item);
		isproduce= true;
		notify();
		}
	
public synchronized void consume() throws InterruptedException {
	if(!isproduce) {
		wait();
	}
	System.out.println("Starting to consume : " +item);
	isproduce= false;
	notify();
	}
}
	
