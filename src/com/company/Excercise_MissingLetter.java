package com.company;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise_MissingLetter {

    public static void missingLetters(String s){

        char[] stanalphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] array = new char[s.length()];
        for (int i=0 ; i< s.length() ; i++){
            array[i] = s.charAt(i);
        }

        for(int j=0; j< array.length ; j++){
            for (int k=0 ; k<stanalphabet.length ; k++){
                if (array[j] == stanalphabet[k]){
                    int indexOffirstChar = k;
                    System.out.println(stanalphabet[k]);
                }else{
                    //System.out.println(stanalphabet[k]+" "+"is missing");
                    continue;
                }
            }
        }
    }

    public static void main(String[] args) {
        missingLetters("mnpq");


    }
}
