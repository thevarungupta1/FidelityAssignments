package com.company;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise_MissingLetter {

    public static void findMissingLetters(String input){
        boolean[] present = new boolean[input.length()];
        input = input.toLowerCase();
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(c>='a' && c<='z'){
                present[c-'a'] = true;
            }
        }
        for(int i=0;i<input.length();i++){
            if(!present[i]){
                System.out.print((char)(i+'a') +  "   ");
            }
        }
    }


    public static void main(String[] args) {
        findMissingLetters("abcefg");


    }
}
