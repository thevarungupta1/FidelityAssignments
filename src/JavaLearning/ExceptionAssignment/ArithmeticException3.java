package JavaLearning.ExceptionAssignment;

public class ArithmeticException3{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c =0;
        try {
            c = a / b;
            System.out.println("Value of c after division is:" + c);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception catch block executed");
        } catch (Exception e) {
            System.out.println("Parent exception catch block WILL NOT be executed");
        } finally {
            System.out.println("Finally Block executed");
        }
//        c=a/b;
        System.out.println("the value of c: " + c);
    }
}
