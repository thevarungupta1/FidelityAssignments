package JavaLearning.Day5;

public class SavingsAccount extends BankAccount {
    static double monthlyInterestRate= 4;

    public SavingsAccount(String accountNumber, String customerName, double balanceAmount) {
        super(accountNumber, customerName, balanceAmount);
    }

    public static void main(String[] args)
    {
        inputDetailsOfBankCustomer();
        BankAccount saving1 = new BankAccount(accountNumber,  customerName, balanceAmount);
        saving1.deposit(200);
        saving1.withdraw(100);
        saving1.addInterest(monthlyInterestRate);
        saving1.printDetails();
    }
}


