package JavaLearning.Day13;

class TableOfFive extends Thread {
    public void run() {
        int number = 5;
        for (int i = 1; i <= 10; i++)
            System.out.println(number + "*" + i + " = " + number * i);
    }
}

class EvenNumber extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even thread of table of five " + i);
            }
        }
    }
}

public class Question2 {

    public static void main(String[] args) {
        TableOfFive five = new TableOfFive();
        five.start();

        EvenNumber even = new EvenNumber();
        even.start();
    }
}
