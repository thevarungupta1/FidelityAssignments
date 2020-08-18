package Day5New;
import java.util.Scanner;

abstract class Account {
	protected int accountNumber;
	protected String name;
	protected int totalAmount;
	
	abstract public void deposit(int a);
	abstract public void withdraw(int b);
	
	}



 final class SBAccount extends Account {
	 
	 SBAccount(int totalAmount){
		 this.totalAmount= totalAmount;
	 }
	 
      final int minBalance= 500;
      
	public int getInterestPerMonth() {
		return 4;
		}
	
	public void deposit(int amount) {
		totalAmount = totalAmount+ amount;
		System.out.println("Total Amount is :" +totalAmount);
	}
	public void withdraw(int amount) {
		totalAmount = totalAmount - amount;
		System.out.println("Total Amount is :" +totalAmount);
	}
	
	
	}
	



 final class CBAccount extends Account {
	 
	 CBAccount(int totalAmount){
		 this.totalAmount= totalAmount;
	 }
	 
     final int minBalance =100;
     public void deposit(int amount) {
 		totalAmount = totalAmount+ amount;
 		System.out.println("Total Amount is :" +totalAmount);
 	}
 	public void withdraw(int amount) {
 		totalAmount = totalAmount - amount;
 		System.out.println("Total Amount is :" +totalAmount);
 	}
 	
}

public class Question2{
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the type of account user want to create");
		String accountType = s.nextLine();
		Account account;
		if(accountType.equalsIgnoreCase("savings")) {
			account = new SBAccount(7000);
			account.deposit(1000);
			account.withdraw(10);
		}
		
		else {
			account = new CBAccount(5000);	
			account.deposit(2000);
			account.withdraw(50);
		}
		
		}
}