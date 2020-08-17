package Day5.Question2;

import java.util.Scanner;

public final class CurrentBankAccount extends Account{
	final int minBalance= 100;
	static String accountType;
	
	public CurrentBankAccount (int accountNumber, String name, int totalAmount) {
		super(accountNumber,name,totalAmount);
		}
	
	public void getCurrentAccountDetails() {
		getAccountDetails();
		System.out.println("Minimum Balance for Savings Account is :" +minBalance);
		}
	
	 public void deposit() {
		 System.out.println("depositing the amount into CurrentBankAccount class");
	 }
	 public void withdraw() {
		 System.out.println("Withdrawing the amount from CurrentBankAccount class");
	 }
	 
	
	public static void main(String args[]) {
		 Scanner scanner= new Scanner(System.in);
		 System.out.println("Enter the type of account user wants to create :");
		 accountType= scanner.nextLine();
		 System.out.println("Type of Account :" +accountType);
		 
		    if(accountType.equalsIgnoreCase("current")) {
		    	CurrentBankAccount account = new CurrentBankAccount(12345,"Neha",10000);
			account.getCurrentAccountDetails();
			account.deposit();
			account.withdraw();
		    }
		    
           
		    
}
}
