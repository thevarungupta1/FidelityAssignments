package JavaLearning.Day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3_ReadInputFromJavaConsole {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your text you want to input in the text file: ");
        String contentInFile=br.readLine();
        System.out.println("Reading input from JAVA console: "+contentInFile);
    }
}
