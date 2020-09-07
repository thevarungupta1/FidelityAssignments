package JavaLearning.Day12;

import java.io.File;

public class Q1_ListOfFileOrDirectoryNames {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Grover\\Desktop\\SURBHI_NEW_LEARNING");
        String[] listOfFiles = file.list();
        for (String s : listOfFiles) {
            System.out.println(s);
        }
    }
}
