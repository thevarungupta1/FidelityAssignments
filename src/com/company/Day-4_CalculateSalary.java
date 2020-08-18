import java.util.Scanner;

public class CalculateSalary {

	int netSalary, basic;
	
	public int getSalary() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic pay: ");
		basic= sc.nextInt();

		int DA = (30 * basic)/100; //1800

		int HRA = (12 * basic)/100; //720

		int grossSalary = basic + HRA + DA; //8520
		int incomeTax = (30 * grossSalary)/100; 
		netSalary = grossSalary - incomeTax;

		 return netSalary;
	}

	public void displaySalary() {
		System.out.println("Salary is: " + netSalary);
	}

	public static void main(String[] args) {

		CalculateSalary cs = new CalculateSalary();
		cs.getSalary();
		cs.displaySalary();

	}

}
