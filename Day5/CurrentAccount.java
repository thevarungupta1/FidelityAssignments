package Day5;

public class CurrentAccount extends Account{
	double interestRate;
	public CurrentAccount(String Name, String Account_No, double Ammount) {
		super(Name, Account_No, Ammount);
		
	}
   
	public void setInterest()
	{
		interestRate=4;
	}
	public void addInsterest()
	{
		double interest=getBalance()*interestRate/100;
	}
}
