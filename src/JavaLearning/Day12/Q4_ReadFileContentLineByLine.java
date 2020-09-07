package JavaLearning.Day12;

import java.io.*;

public class Q4_ReadFileContentLineByLine {
    public static void main(String[] args) throws IOException {
        //write text in file
        File file = new File("surbhi.txt");
        FileOutputStream fo = new FileOutputStream(file);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fo));
        for (int i = 0; i < 10; i++) {
            bw.write("something written 10 times");
            bw.newLine();
        }
        bw.flush();
        bw.close();

        //read from file
        BufferedReader br= new BufferedReader(new FileReader("surbhi.txt"));
        String indexOfLine=br.readLine();
        while(indexOfLine!=null) {
            System.out.println("File content line by line: "+ indexOfLine);
            indexOfLine=br.readLine();
        }
        br.close();

    }
}
