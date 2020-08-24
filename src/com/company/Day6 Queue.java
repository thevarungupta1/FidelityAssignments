package pkgInterface;
import java.util.Scanner;
 interface Queue {	

			 void insert(int num);
		//	 void delete();
				 
			 }
	class QueueInsertion implements Queue{
		public void insert(int num) {
			try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the no. to be inserted: ");
			int newNum=sc.nextInt();
			System.out.println("New no. is: "+ num + newNum);
		}
		}
	}
		/*public void delete() {
			try(Scanner sc=new Scanner(System.in)){
					System.out.println("Enter the no. to be deleted: ");
					int a=sc.nextInt();
					System.out.println("New no. is: "+ num + a);
				}
			}*/
		
	 class Test{
		public static void main(String[] args) {
			QueueInsertion qi=new QueueInsertion();
			qi.insert(41234);
			//qi.delete();
		}
	 }
	
