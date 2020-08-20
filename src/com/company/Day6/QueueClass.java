package Day6;

public class QueueClass implements Queue {

	
	static int a[] = new int[10];
	int i;
	
	@Override
	public void insert(int n) {
		//for(i=0;i<10;i++) {
			if(a[i]==0) {
				a[i]=n;
			}
			else {
				i++;
				a[i]=n;}
				}
	

	@Override
	public void delete() {
		a[0]=0;

	}
	
	public static void main(String args[]) {
		QueueClass q= new QueueClass();
		q.insert(1);
	

		for(int i=0;i<10;i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
