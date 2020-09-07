package JavaLearning.ExceptionAssignment;

public class NullPointerException5 {
    public static void main(String[] args) {
        try {
            String value = null;
            System.out.println(value.charAt(0));
            System.out.println("Inside the try block");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("NullPointerException inside catch block");
        } finally {
            System.out.println("Finally Block executed");
        }
    }
}
