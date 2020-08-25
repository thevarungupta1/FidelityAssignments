package JavaLearning.Day9Assignment;

class Cycle {
    public void display() {
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine. ");
    }
}

class MotorCycle extends Cycle{
    public void display() {
        super.display();
        System.out.println("My ancestor is a cycle who is a vehicle with pedals. ");
    }
}

public class Question4 {
    public static void main(String[] args) {
        MotorCycle m1=new MotorCycle();
        m1.display();
    }
}
