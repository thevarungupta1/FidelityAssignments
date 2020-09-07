package JavaLearning.ExceptionAssignment;

import java.io.File;
import java.io.FileReader;

public class FileNotFoundException2 {
    public static void main(String[] args) {
        try {
            File file= new File("a.txt");
            FileReader f = new FileReader(file);
            System.out.println("Inside the try block");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("FileNotFoundException Exception inside catch block");
        } finally {
            System.out.println("Finally Block executed");
        }
    }
}
