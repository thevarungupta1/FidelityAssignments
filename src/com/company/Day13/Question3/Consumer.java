package Day13.Question3;

public class Consumer extends Thread{
	ProduceConsumer pc1;
	
	Consumer(ProduceConsumer pc1){
		this.pc1 = pc1;
	}

	public void run() {
	        while (true) {
	        	try{
	                this.pc1.consume();
	                Thread.sleep(3000);
	            }catch (Exception e){

	            }
	}
	
}
}
