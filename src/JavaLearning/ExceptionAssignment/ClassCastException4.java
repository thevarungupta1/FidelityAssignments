package JavaLearning.ExceptionAssignment;

class ParentClass {
    String parentName;
    ParentClass(String n1){
        parentName = n1;
    }
    public void display() {
        System.out.println(parentName);
    }
}
class ChildClass extends ParentClass {
    String childName;
    ChildClass(String n2) {
        super(n2);
        childName = n2;
    }
    public void display() {
        System.out.println(childName);
    }
}
public class ClassCastException4 {
    public static void main(String args[]) {
        ChildClass ct1 = new ChildClass("Surbhi");
        ParentClass pt1 = new ParentClass("Grover");
        pt1 = ct1;
        pt1.display();

        ParentClass pt2 = new ParentClass("Sakshi");
        ChildClass ct2 = (ChildClass)pt2;
    }
}
