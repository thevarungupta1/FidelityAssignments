package JavaLearning.Day5;
import java.util.Scanner;

public class BankAccount {

    static String bankName = "Axis Bank";
    static String accountNumber;
    static String customerName;
    static double balanceAmount;

    public BankAccount(String accountNumber, String customerName, double balanceAmount) {
        BankAccount.accountNumber = accountNumber;
        BankAccount.customerName = customerName;
        BankAccount.balanceAmount = balanceAmount;
    }

    public static void inputDetailsOfBankCustomer() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter account number of the customer having account in " + bankName + " ");
        accountNumber = input.next();

        System.out.println("Enter name of the customer: ");
        customerName = input.next();

        System.out.println("Enter balance amount of the customer: ");
        balanceAmount = input.nextDouble();
    }

    public void deposit(double amount) {
        balanceAmount = balanceAmount + amount;
        System.out.println("Bank amount after deposit: " + balanceAmount);
    }

    public void withdraw(double amount) {
        balanceAmount = balanceAmount - amount;
        System.out.println("Bank amount after withdraw: " + balanceAmount);
    }

//    public void addInterest(double monthlyInterestRate) {
//        balanceAmount = balanceAmount + (balanceAmount * (monthlyInterestRate/100));
//        System.out.println("Bank amount after addition of interest: " + balanceAmount);
//    }

    public void printDetails() {
        System.out.println("Account Number: " + accountNumber +
                "\nCustomer name: " + customerName +
                "\nThe bank balance: " + balanceAmount);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the bank account i.e. Current/Saving of your choice: ");
        String accountType = sc.next();

        if (accountType.equalsIgnoreCase("current")) {
            inputDetailsOfBankCustomer();
            CurrentAccount current1 = new CurrentAccount(accountNumber,  customerName, balanceAmount);
            current1.deposit(200);
            current1.withdraw(100);
            current1.addInterest();
            current1.printDetails();
        } else if (accountType.equalsIgnoreCase("saving")) {
            inputDetailsOfBankCustomer();
            SavingsAccount saving1 = new SavingsAccount(accountNumber,  customerName, balanceAmount);
            saving1.deposit(200);
            saving1.withdraw(100);
            saving1.addInterest();
            saving1.printDetails();
        } else {
            System.out.println("Please select a valid account to proceed further");
        }
    }
}
