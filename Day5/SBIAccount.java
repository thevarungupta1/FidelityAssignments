package Day5;

public class SBIAccount extends Account {
   double interestRate;
	public SBIAccount(String Name, String Account_No, double Ammount) {
		super(Name, Account_No, Ammount);
		
	}
   
	public void setInterest()
	{
		interestRate=4;
	}
	public  void addInsterest()
	{
		double interest=getBalance()*interestRate/100;
		System.out.print("Your balance ammount with interest as:-"+interest);
	}
	
	public static void main(String[] args)
	{
		
		SBIAccount SBI=new SBIAccount("puja","1822762001",6000);
		SBI.deposite();
		SBI.addInsterest();
	}
}
