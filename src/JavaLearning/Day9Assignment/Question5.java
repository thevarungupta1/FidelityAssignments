package JavaLearning.Day9Assignment;

class ArrayOfBox {
    int totalVolume;
    public int[] box1 = {2, 3, 2};
    public int[] box2 = {6, 6, 7};
    public int[] box3 = {1, 2, 1};

    public int getVolumeOfEachBox(int[] VolumeOfEachBox) {
        int volume = 1;
        for (int i = 0; i < VolumeOfEachBox.length; i++) {
            volume = volume * VolumeOfEachBox[i];
        }
        return volume;

    }

    public int getTotalVolume() {
        totalVolume= getVolumeOfEachBox(box1)+ getVolumeOfEachBox(box2)+ getVolumeOfEachBox(box3);
        return totalVolume;
    }
}
public class Question5 {
    public static void main(String[] args) {
        ArrayOfBox b=new ArrayOfBox();
        int r1= b.getTotalVolume();
        System.out.println("The total volume of 3 boxes is: "+r1);
    }
}
