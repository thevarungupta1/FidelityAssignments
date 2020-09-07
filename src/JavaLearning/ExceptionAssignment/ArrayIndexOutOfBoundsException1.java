package JavaLearning.ExceptionAssignment;

public class ArrayIndexOutOfBoundsException1 {
    public static void main(String[] args) {
        try {
            int a[] = new int[3];
            //int a[]={1,2,3};
            System.out.println(a[4]);
            System.out.println("Inside the try block");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ArrayIndexOutofBound Exception inside catch block");
        } finally {
            System.out.println("Finally Block executed");
        }
    }
}
