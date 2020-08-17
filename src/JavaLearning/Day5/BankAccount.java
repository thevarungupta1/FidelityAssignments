package JavaLearning.Day5;
import java.util.Scanner;

public class BankAccount {

    static String bankName = "AXIS BANK";
    static String accountNumber;
    static String customerName;
    static double balanceAmount;

    public static void inputDetailsOfBankCustomer() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter account number of the customer having account in " + bankName + " ");
        accountNumber = input.next();

        System.out.println("Enter name of the customer: ");
        customerName = input.next();

        System.out.println("Enter balance amount of the customer: ");
        balanceAmount = input.nextInt();
    }

    public BankAccount(String accountNumber, String customerName, double balanceAmount) {
        BankAccount.accountNumber = accountNumber;
        BankAccount.customerName = customerName;
        BankAccount.balanceAmount = balanceAmount;
    }

    public void deposit(double amount) {
        balanceAmount = balanceAmount + amount;
        System.out.println("Bank amount after deposit: " + balanceAmount);
    }

    public void withdraw(double amount) {
        balanceAmount = balanceAmount - amount;
        System.out.println("Bank amount after withdraw: " + balanceAmount);
    }

    public void addInterest(double monthlyInterestRate) {
        balanceAmount = balanceAmount + (balanceAmount * (monthlyInterestRate/100));
        System.out.println("Bank amount after addition of interest: " + balanceAmount);
    }

    public void printDetails() {
        System.out.println("Account Number: " + accountNumber +
                "\nCustomer name: " + customerName +
                "\nThe bank balance: " + balanceAmount);
    }

    public static void main(String[] args)
    {
        inputDetailsOfBankCustomer();
    }
}
