package JavaLearning.ExceptionAssignment;

public class NullPointerException6 {
    public static void main(String[] args) {
        String s = null;
        try
        {
            if (s.equals("abc"))
                System.out.println("Same string");
            else
                System.out.println("Not Same string");
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException Caught");
        } finally {
            System.out.println("Finally Block executed");
        }
    }
}
