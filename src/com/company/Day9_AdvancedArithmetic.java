//Question-3
interface AdvancedArithmetic {

	int divisor_sum(int n);
}

class myCalculator implements AdvancedArithmetic{
	int sum=0;

	@Override
	public int divisor_sum(int n) {
		for(int i=1;i<=n;i++) { 
			if(n%i==0) { 
				sum=sum+i; 
			}
		}
		System.out.println("Sum of all divisors is: "+sum);
		return sum;
	}
	public static void main (String[]args) {
		myCalculator cal=new myCalculator();
		cal.divisor_sum(6);
	}
}

