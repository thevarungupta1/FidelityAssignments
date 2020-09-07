package Assigment;

public class VolumeofBoxes {

	static int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
	static int box1=1;
	static int box2=1;
	static int box3=1;
	

	public int totalvolume() {
		for (int i = 0; i < array.length; i++) {
			if (i < 3) {
				box1 = box1 * array[i];
			} else if (i >= 3 && i < 6) {
				box2 = box2 * array[i];
			} else if (i >= 6) {
				box3 = box3 * array[i];
			}

		}
		return box1 + box2 + box3;
	}
	public static void main(String[] args) {
		VolumeofBoxes vol = new VolumeofBoxes();
		int volume = vol.totalvolume();
		System.out.println("Volume of Boxes are : "+volume);
		
	}

}