package Day5;

public class Account{
   
   private String Name;
   private String Accuont_No;
   private  double Ammount;
   private double balance;
public Account(String Name,String Account_No,double Ammount)
   {
	   this.Name=Name;
	   this.Accuont_No=Account_No;
	   this.Ammount=Ammount;
	   
	   System.out.print("Your account has been created with given details");
   }

public void deposite()
{
	balance = balance+Ammount;
}

public void withdrow()
{
	balance=balance-Ammount;
}

public double getBalance()
{
	return Ammount;
}
}

