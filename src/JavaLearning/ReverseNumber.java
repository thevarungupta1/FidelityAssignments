package JavaLearning;

public class ReverseNumber {
    public static void main(String[] args) {
        int number=2345;
        int reverseNumber=0;
        while(number!=0){
            reverseNumber= reverseNumber * 10;
            reverseNumber= reverseNumber + number%10;
            number=number/10;
        }
        System.out.print("The reverse of number " + number + " : " + reverseNumber);
    }
}
