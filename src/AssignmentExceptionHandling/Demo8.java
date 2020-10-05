package AssignmentExceptionHandling;
class Company {
	int item;
	boolean flag = false;
	synchronized public void produce(int item) throws Exception {
		if (flag) {
			wait(1000);
		}
		this.item = item;
		System.out.println("Produced : " + this.item);
		flag = true;
		notify();
	}
	synchronized public void consumer() throws InterruptedException  {
		if (!flag) {
			wait(1000);
		}
		System.out.println("Consumer : " + item);
		flag = false;
		notify();
		//return this.item;
	}
}
class Producer extends Thread {
	Company comp;
	Producer(Company c) {
		this.comp = c;
	}
	public void run() {
		int i = 1;
		while (true) {
			try {
				this.comp.produce(i);
				Thread.sleep(2000);
				i++;
			} catch (Exception e) {
			}
		}
	}
}
class Consumer extends Thread {
	Company comp;

	Consumer(Company c) {
		this.comp = c;
	}
	public void run() {
		//int i = 1;
		while (true) {
			try {
				this.comp.consumer();
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
public class Demo8 {
	public static void main(String[] args) {
		Company comp = new Company();
		Producer p = new Producer(comp);
		Consumer c = new Consumer(comp);
		p.start();
		c.start();
	}
}