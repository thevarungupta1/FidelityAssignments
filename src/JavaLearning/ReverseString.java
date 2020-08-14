package JavaLearning;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Surbhi Grover";
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
    }
}

