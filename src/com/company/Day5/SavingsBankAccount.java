package Day5.Question2;

import java.util.Scanner;

public final class SavingsBankAccount extends Account {
	
	final int minBalance= 500;
	float interest;
	static String accountType;
    
	public SavingsBankAccount(int accountNumber, String name, int totalAmount) {
		super(accountNumber,name,totalAmount);
		}
	
	public void getSavingsAccountDetails() {
		getAccountDetails();
		System.out.println("Minimum Balance for Savings Account is :" +minBalance);
		System.out.println("Interest per month on Savings Account is :" +getInterestPerMonth());
		}
	
	
	
	public int getInterestPerMonth(){
	    int interset = totalAmount* 4/100;
	    return interset;
	    }
	
	 public void deposit() {
		 System.out.println("depositing the amount into SavingsBankAccount class");
	 }
	 public void withdraw() {
		 System.out.println("Withdrawing the amount from SavingsBankAccount class");
	 }

	
	public static void main(String args[]) {
		 Scanner scanner= new Scanner(System.in);
		 System.out.println("Enter the type of account user wants to create :");
		 accountType= scanner.nextLine();
		 System.out.println("Type of Account :" +accountType);
		 
		    if(accountType.equalsIgnoreCase("savings")) {
		    SavingsBankAccount account = new SavingsBankAccount(12345,"Neha",10000);
			account.getSavingsAccountDetails();
			account.deposit();
			account.withdraw();
		    }
			
}
}