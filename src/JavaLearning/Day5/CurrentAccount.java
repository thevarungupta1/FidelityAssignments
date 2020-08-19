package JavaLearning.Day5;
import java.util.Scanner;

public class CurrentAccount extends BankAccount {
    final double minimumBalance = 1000;

    public CurrentAccount(String accountNumber, String customerName, double balanceAmount) {
        super(accountNumber, customerName, balanceAmount);
    }

    public void addInterest() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the interest rate for Current Account in  " + bankName + " ");
        double monthlyInterestRate = input.nextDouble();
        balanceAmount = balanceAmount + (balanceAmount * (monthlyInterestRate / 100));
        System.out.println("Bank amount after addition of interest for Current account : " + balanceAmount);
    }

    public void withdraw(double amount) {
        balanceAmount = balanceAmount - amount;
        System.out.println("Bank amount after withdraw: " + balanceAmount);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw from account:");
        double amountWithdrawn = sc.nextDouble();
        if (balanceAmount >= minimumBalance) {
            balanceAmount = balanceAmount - amountWithdrawn;
            System.out.println("Withdraw possible and total balance :" + balanceAmount);
        } else
            System.out.println("Withdraw of Rs" + balanceAmount + " is not possible as the bank balance is less than the minimum balance required");
    }
}


