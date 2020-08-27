//Question-5
import java.util.Arrays;

public class ArrayOfBoxes {

	int[] box1 = {2,3,2};
	int[] box2= {6,6,7};
	int[] box3= {1,2,1};

	int totalVolume;

	public int getvolume(int[] a) {
		int volume = 1;
		for(int i=0;i<a.length;i++) {
			volume = volume * a[i];
		}
		return volume;

	}
	public int getTotalVolume() {
		totalVolume= this.getvolume(box1)+this.getvolume(box2)+this.getvolume(box3);
		return totalVolume;
	}
}

class BoxTest{
	public static void main(String[]args) {
		ArrayOfBoxes box=new ArrayOfBoxes();
		System.out.println(box.getTotalVolume());
	}
}
