package Day9.Question6;

public class RightAngleTriangle {
	private int x;
	private int y;
	private int z;
	
	public RightAngleTriangle(int x, int y, int z) {
		this.x= x;
		this.y = y;
		this.z = z;
	}
	
	public void rightAngle() {
	
		if(x>y && x>z) {
			System.out.println("X is the largest number");
			if(x*x== y*y+z*z) {
				System.out.println("This is a right angled Triangle");
			}
			else {
				System.out.println("This is not a right angled Triangle");
			}
		}
			else if(y>z) {
				System.out.println("Y is the largest number");
				if(y*y == x*x+z*z) {
					System.out.println("This is a right angled Triangle");
				}
				else {
					System.out.println("This is not a right angled Triangle");
						}
			}
			else
			{ System.out.println("Z is the largest number");
				if(z*z == x*x+y*y) {
					System.out.println("This is a right angled Triangle");
				}
				else {
					System.out.println("This is not a right angled Triangle");
						}
			}
				
			
			
			
		}
		
		
}



