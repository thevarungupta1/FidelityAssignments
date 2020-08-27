
 abstract class Arithemetic {

	public int add(int a, int b) {
		int sum=a+b;
		System.out.println(sum);
		return sum;
	}
}

class Adder extends Arithemetic{
	public static void main(String[] args) {
		Adder a =new Adder();
		a.add(10, 20);
 }
}