package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args)
    {
        LinkedList<String> linkedlist = new LinkedList();

        /*Adding elements*/

        linkedlist.add("A");
        linkedlist.add("B");
        linkedlist.addLast("C");
        linkedlist.addFirst("D");

        /*displaying*/

        System.out.println("----------------------------------LinkedList--------------------------------------");
        for(String str:linkedlist)
            System.out.println(str);

        /* Add element at the given index*/

        linkedlist.add(1,"E");
        linkedlist.add(2,"F");

        /*displaying updated list*/

        System.out.println(" --------------------------Updated LinkedList--------------------------------------");
        for(String str:linkedlist)
            System.out.println(str);

        /*Remove elements*/

        linkedlist.remove(1);
        linkedlist.remove("B");
        linkedlist.removeFirst();
        linkedlist.removeLast();

        /*displaying list after removing elements*/

        System.out.println("------------------------LinkedList after removing-------------------------------------");
        for(String str:linkedlist)
            System.out.println(str);

        /*Updating an element*/

        linkedlist.set(0,"X");
        System.out.println("------------------------LinkedList after updating----------------------------------------");
        for(String str:linkedlist)
            System.out.println(str);

        /*sorting elements*/

        Collections.sort(linkedlist);

        /*Displaying after sorting*/

        System.out.println("---------------------------------After sorting--------------------------------------");
        for(int i=0;i< linkedlist.size();i++)
            System.out.println(linkedlist.get(i)+" ");

        /*Displaying size of arraylist*/

        System.out.println("------------------------------Size of linkedlist---------------------------------");
        int size = linkedlist.size();
        System.out.println("size is:"+" "+size);

        /*Searching a particular element*/

        System.out.println("---------------------Searching of an element---------------------------------");
        boolean value =  linkedlist.contains("X");
        if (value)
            System.out.println("The list contains X");
        else
            System.out.println("The list does not contains X");

    }
}
