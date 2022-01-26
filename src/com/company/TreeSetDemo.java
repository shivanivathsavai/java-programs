package com.company;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[])
    {
        TreeSet<Integer> treeset = new TreeSet<>();

        /*Adding elements*/

        treeset.add(20);
        treeset.add(19);
        treeset.add(22);
        treeset.add(18);
        treeset.add(21);

        /*Displaying the elements in set*/

        System.out.println("-----------------------elements present in treeset---------------------------");
        for(int element:treeset)
            System.out.println(element);

        /*Removing the elements in set*/

        treeset.remove(19);

        /*Displaying after removing the elements in set*/

        System.out.println("-----------------------elements present in treeset after removing---------------------------");
        for(int element:treeset)
            System.out.println(element);

        /*Displaying size of set*/

        System.out.println("------------------------------Size of treeset---------------------------------");
        int size =  treeset.size();
        System.out.println("size is:"+" "+size);

        /*Searching a particular element*/

        System.out.println("---------------------Searching of an element---------------------------------");
        boolean value = treeset.contains(20);
        if (value)
            System.out.println("The list contains 20");
        else
            System.out.println("The list does not contains 20");

        /*Printing the treeset in decending order*/

        TreeSet<Integer> reverse = (TreeSet<Integer>)treeset.descendingSet();
        System.out.println("---------------------Descending order of treeset---------------------------------");
        for(int element:reverse)
            System.out.println(element);






    }
}


