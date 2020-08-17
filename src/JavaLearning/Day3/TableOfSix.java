package JavaLearning.Day3;

public class TableOfSix {
    public static void main(String[] args) {
        for (int i = 1; i <= 10;i++) {
            int count = 6;
            int table = count * i;
            System.out.println(count + "*" + i + "=" + table);
        }
    }
}
