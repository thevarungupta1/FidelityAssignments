package JavaLearning.Day13;

class ProducerConsumer{

    int item;
    boolean flag = false;
    synchronized public void produce(int item) throws Exception{
        if(flag){
            wait();
        }
        this.item = item;
        System.out.println("Produced : "+ this.item);
        flag = true;
        notify();
    }

    synchronized public int consumer() throws Exception{
        if(!flag){
            wait();
        }
        System.out.println("Consumer : "+ item);
        flag = false;
        notify();
        return this.item;
    }

}

class Producer extends Thread{
    ProducerConsumer pc1;

    Producer(ProducerConsumer c){
        this.pc1 = c;
    }

    public void run(){
        int i=1;
        while (true){

            try{
                this.pc1.produce(i);
                Thread.sleep(2000);
                i++;
            }catch (Exception e){

            }
        }
    }
}

class Consumer extends Thread{
    ProducerConsumer pc1;

    Consumer(ProducerConsumer c){
        this.pc1 = c;
    }

    public void run(){
        int i = 1;
        while (true){


            try{
                this.pc1.consumer();
                Thread.sleep(3000);
            }catch (Exception e){

            }
        }
    }
}



public class Question3 {
    public static void main(String[] args) {
        ProducerConsumer pc1 = new ProducerConsumer();
        Producer p = new Producer(pc1);
        Consumer c = new Consumer(pc1);

        p.start();
        c.start();
    }
}

