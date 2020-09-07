package JavaLearning.Day12;

import java.io.*;

public class Q5_AppendTextToAFile {
    public static void main(String[] args) throws IOException {
        //append text in file which already has content
        BufferedWriter bw = new BufferedWriter(new FileWriter("surbhi.txt", true));
        String a = "New line added to existing file";
        bw.write(a);
        bw.newLine();
        bw.write(20);
        bw.newLine();
        char b = 'n';
        bw.write(b);
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
