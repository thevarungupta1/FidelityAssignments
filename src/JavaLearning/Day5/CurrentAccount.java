package JavaLearning.Day5;


public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountNumber, String customerName, double balanceAmount) {
        super(accountNumber, customerName, balanceAmount);
    }

    public static void main(String[] args)
    {
        inputDetailsOfBankCustomer();
        BankAccount current1 = new BankAccount(accountNumber,  customerName, balanceAmount);
        current1.deposit(200);
        current1.withdraw(100);
        current1.addInterest(12);
        current1.printDetails();
    }
}


