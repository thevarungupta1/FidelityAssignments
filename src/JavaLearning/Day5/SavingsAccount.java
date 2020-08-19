package JavaLearning.Day5;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, String customerName, double balanceAmount) {
        super(accountNumber, customerName, balanceAmount);
    }

    public void addInterest() {
        double monthlyInterestRateOfSavingAccount = balanceAmount* 4/100;
        balanceAmount = balanceAmount + monthlyInterestRateOfSavingAccount;
        System.out.println("Bank amount after addition of interest for Saving account : " + balanceAmount);
    }
}


