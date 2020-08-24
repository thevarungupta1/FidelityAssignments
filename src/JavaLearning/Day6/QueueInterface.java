package JavaLearning.Day6;

import java.util.Scanner;

interface queue{
    void insert();
    void delete();
}

class QueueInterface implements queue {
    String originalString = "Fidelity Java Assignment";
    String newString = new String();

    @Override
    public void insert() {
        String stringToBeInserted;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the string: ");
        stringToBeInserted = sc.next();
        for (int i = originalString.length(); i <= (originalString.length() + 1); i++) {
            newString = originalString + " " + stringToBeInserted;
        }
        System.out.println("Modification after insert operation: " + newString);
    }

    @Override
    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to be deleted:");
        String stringToDeleted = sc.next();

        if (newString.contains(stringToDeleted))
            newString = newString.replaceAll(stringToDeleted + " ", "");
        System.out.println("Modification after delete operation: " + newString);
    }

    public static void main(String[] args) {
        QueueInterface q1 = new QueueInterface();
        q1.insert();
        q1.delete();
    }
}
