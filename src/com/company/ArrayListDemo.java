package com.company;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>(4);

        /*Adding elements*/

        arraylist.add("Pineapple");
        arraylist.add("Custardapple");
        arraylist.add("Mango");
        arraylist.add("Strawberry");
        arraylist.add("Banana");
        arraylist.add("Orange");

        /*displaying*/

        System.out.println("----------------------------------ArrayList--------------------------------------");
        for(String str:arraylist)
            System.out.println(str);

        /* Add element at the given index*/

        arraylist.add(1,"Guava");
        arraylist.add(5,"Grapes");

        /*displaying updated list*/

        System.out.println(" --------------------------Updated ArrayList--------------------------------------");
        for(String str:arraylist)
            System.out.println(str);

        /*Remove elements*/

        arraylist.remove(2);
        arraylist.remove("Orange");

        /*displaying list after removing elements*/

        System.out.println("------------------------ArrayList after removing-------------------------------------");
        for(String str:arraylist)
            System.out.println(str);

        /*Updating an element*/

        arraylist.set(0,"Apple");
        System.out.println("------------------------ArrayList after updating----------------------------------------");
        for(String str:arraylist)
            System.out.println(str);

        /*sorting elements*/

        Collections.sort(arraylist);

        /*Displaying after sorting*/

        System.out.println("---------------------------------After sorting--------------------------------------");
        for(int i=0;i< arraylist.size();i++)
            System.out.println(arraylist.get(i)+" ");

        /*Displaying size of arraylist*/

        System.out.println("------------------------------Size of arraylist---------------------------------");
        int size = arraylist.size();
        System.out.println("size is:"+" "+size);

        /*Searching a particular element*/

        System.out.println("---------------------Searching of an element---------------------------------");
        boolean value =  arraylist.contains("Mango");
        if (value)
            System.out.println("The list contains Mango");
        else
            System.out.println("The list does not contains Mango");


        boolean value1 = arraylist.contains("Pineapple");
        if (value1)
            System.out.println("The list contains Pineapple");
        else
            System.out.println("The list does not contains Pineapple");
    }
}
