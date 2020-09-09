package Day13.Question3;

public class DMain {
public static void main(String args[]) {
	ProduceConsumer pcom= new ProduceConsumer();
	Producer P= new Producer(pcom);
	Consumer C = new Consumer(pcom);
	P.start();
	C.start();
}
}
