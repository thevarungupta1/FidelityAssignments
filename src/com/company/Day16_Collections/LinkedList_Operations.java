package com.company.Day16_Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Operations {
    public static void main(String[] args) {

        System.out.println("*************Append specified element to end of linked list*************" + "\n");
        LinkedList<String> l = new LinkedList<>();
        l.add("element1");
        l.add("element2");
        l.add("element3");

        String lastitem = l.getLast();

        System.out.println("Enter the element you want to append" + "\n");
        Scanner sc = new Scanner(System.in);

        String strtoappend = sc.nextLine();
        l.removeLast();
        l.addLast(lastitem + strtoappend);

        System.out.println("After appending element linked list is " + " " + l + "\n");

        System.out.println("*********Inserting elements at first and last position of linked list*************" + "\n");

        System.out.println("Before adding linked list is" + " " + l + "\n");

        l.addFirst("firstelement");
        l.addLast("lastelement");
        System.out.println("After adding elements at first and last position" + " " + l + "\n");

        System.out.println("***********Iterating linked list in reverse order****************" + "\n");

        Iterator backiter = l.descendingIterator();
        System.out.println("Linked List in reverse order" + "\n");
        while (backiter.hasNext())
            System.out.println(backiter.next());

    }
}
