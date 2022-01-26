package com.company;
import java.util.*;
public class HashSetDemo {
    public static void main(String args[])
    {
        Set<String> hashset = new HashSet<>();

        /*Adding elements*/

        hashset.add("A");
        hashset.add("B");
        hashset.add("C");
        hashset.add("C"); /* It avoids duplicate elements*/
        hashset.add("D");

        /*Displaying the elements in set*/

        System.out.println("-----------------------elements present in hashset---------------------------");
        for(String element:hashset)
            System.out.println(element);

        /*Removing the elements in set*/

        hashset.remove("A");

        /*Displaying after removing the elements in set*/

        System.out.println("-----------------------elements present in hashset after removing---------------------------");
        for(String element:hashset)
            System.out.println(element);

        /*Displaying size of hashset*/

        System.out.println("------------------------------Size of hashset---------------------------------");
        int size =  hashset.size();
        System.out.println("size is:"+" "+size);

        /*Searching a particular element*/

        System.out.println("---------------------Searching of an element---------------------------------");
        boolean value =  hashset.contains("C");
        if (value)
            System.out.println("The list contains C");
        else
            System.out.println("The list does not contains C");






    }
}
