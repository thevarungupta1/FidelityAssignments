package Day5.Question2;

 public abstract class Account {
 private int accountNumber;
 private String name;
 protected int totalAmount;

 public Account(int accountNumber, String name, int totalAmount ) {
	 this.accountNumber= accountNumber;
	 this.name= name;
	 this.totalAmount= totalAmount;
 }
 
 public void getAccountDetails() {
	 System.out.println("Account Number is : " +accountNumber);
	 System.out.println("Name of the account holder is : " +name);
	 System.out.println("Total amount in the account is :" +totalAmount);
	 
	 }
 public void deposit() {
	 System.out.println("depositing the amount into account class");
 }
 public void withdraw() {
	 System.out.println("Withdrawing the amount from account class");
 }
 
 }



 
 

