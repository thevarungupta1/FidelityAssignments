//Day-6 Program:2

package newPkg;

import advJava.DefiningFunctions;
public class ImplementingFunctions implements DefiningFunctions{

	int a=20;
	int b=10; 

	@Override
	public void subtract() {
		int sub=a-b;
		System.out.println("Subtraction is: "+sub);
	}

	@Override
	public void multiply() {
		int multi=a*b;
		System.out.println("Multiplication is: "+multi);

	}

	@Override
	public void divide() {
		int div=a/b;
		System.out.println("Division is: "+div);

	}

	@Override
	public void factorial() {
		int num=5;
		int fact=1;
		for(int i=1; i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial is: "+fact);
	}

	@Override
	public void reverse() {
		int num=145678;
		int rev=0;

		while(num>0) {
			rev=(rev*10)+num%10;
			num=num/10;

		}
		System.out.println("Reverse of number is: " + rev);
	}
	static class Test{
		public static void main(String[]args) {
			ImplementingFunctions obj=new ImplementingFunctions();
			obj.subtract();
			obj.multiply();
			obj.divide();
			obj.factorial();
			obj.reverse();
		}
	}
}
