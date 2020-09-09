package Day13.Question3;

public class Producer extends Thread{
	ProduceConsumer pc;
	
	Producer(ProduceConsumer pc){
		this.pc= pc;
	}
	
	public void run() {
		int i=1;
		while(true) {
			try {
				this.pc.produce(i);
				Thread.sleep(1000);
				i++;
			}
			catch(Exception e) {
				
			}
			
		}
		
	}	}


