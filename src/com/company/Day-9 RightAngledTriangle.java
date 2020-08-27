
public class RightAngledTriangle {

	int a, b,c;
	RightAngledTriangle(int a, int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;

	}
	public void calculateTriangle(){
		if(a*a+b*b==c*c) {
			System.out.println("Right angled triangle!");
		} else
			System.out.println("Not a right angled triangle!");
	}

	public static void main(String[] args) {
		RightAngledTriangle rat=new RightAngledTriangle(3,4,5);
		rat.calculateTriangle();
	}

}
