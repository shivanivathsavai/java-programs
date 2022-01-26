package com.company;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String args[])
    {
        Set<String> linkedhashset = new LinkedHashSet<>();

        /*Adding elements*/

        linkedhashset.add("Rose");
        linkedhashset.add("Sunflower");
        linkedhashset.add("Lotus");
        linkedhashset.add("Jasmine");
        linkedhashset.add("Lily");

        /*Displaying the elements in set*/

        System.out.println("-----------------------elements present in linkedhashset---------------------------");
        for(String element:linkedhashset)
            System.out.println(element);

        /*Removing the elements in set*/

        linkedhashset.remove("Sunflower");

        /*Displaying after removing the elements in set*/

        System.out.println("-----------------------elements present in linkedhashset after removing---------------------------");
        for(String element:linkedhashset)
            System.out.println(element);

        /*Displaying size of set*/

        System.out.println("------------------------------Size of linkedhashset---------------------------------");
        int size =  linkedhashset.size();
        System.out.println("size is:"+" "+size);

        /*Searching a particular element*/

        System.out.println("---------------------Searching of an element---------------------------------");
        boolean value = linkedhashset.contains("Hibiscus");
        if (value)
            System.out.println("The list contains Hibiscus");
        else
            System.out.println("The list does not contains Hibiscus");






    }
}
