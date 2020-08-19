package JavaLearning.Day5;

class Car {
    public void display() {
        System.out.println("The display method belongs to Parent class Car");
    }
}

class Bmw extends Car {
    public void display() {
        System.out.println("The display method belongs to Child class BMW");
    }
}

class Merc extends Car {
    public void display() {
        System.out.println("The display method belongs to Child class MERC");
    }
}

class CarUsingPolymorphism {
    public static void main(String[] args){
        Car p1 = new Car();
        p1.display();
        Car c1 = new Bmw();
        c1.display();
        Car c2 = new Merc();
        c2.display();
    }
}