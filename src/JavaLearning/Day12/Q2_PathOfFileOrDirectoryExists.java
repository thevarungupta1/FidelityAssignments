package JavaLearning.Day12;

import java.io.File;
import java.io.IOException;

public class Q2_PathOfFileOrDirectoryExists {
    public static void main(String[] args) throws IOException {
        File file = new File("surbhi.txt");
        if(file.exists()) {
            System.out.println("The file exists");
            String path= file.getAbsolutePath();
            System.out.println("The path of the file is: " + path);
        }
        else{
            file.createNewFile();
            System.out.println("A new file is created");
            file.mkdir();
            System.out.println("A new directory is created");
        }
    }
}
