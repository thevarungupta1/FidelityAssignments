package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise_VolumeofBox {

    public static void totalVolume(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of boxes present:");
        int nofboxes = sc.nextInt();
        int sum = 0;

        for (int i=0; i< nofboxes ; i++){
            int a[] = new int[3];
            int product=1;
            System.out.println("Enter the length , height and width of boxes:");
            for (int j=0 ; j<3 ; j++){
                a[j] = sc.nextInt();
                product = product * a[j];
            }
            System.out.println("Volume of box having length, width, height"+" "+Arrays.toString(a)+" "+"is :"+" "+product);
            sum = sum + product;
        }
        System.out.println("Volume of box:"+" "+sum);
    }

    public static void main(String[] args) {
        totalVolume();
    }
}
