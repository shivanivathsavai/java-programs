package com.company;
import java.util.*;
public class HashMapDemo {
    public static void main(String args[])
    {
        Map<String,Integer> hashmap = new HashMap<>();

        /*Adding keys and values*/

        hashmap.put("a",10);
        hashmap.put("b",20);
        hashmap.put("c",30);
        hashmap.put("d",40);
        hashmap.put("e",50);

        /*Displaying the key,value pair in map*/

        System.out.println("----------------------------------key-value pairs----------------------------\n"+hashmap);

        /*Removing  one key,value pair in map*/

        hashmap.remove("b");
        System.out.println("---------------------------key-value pairs after removing:---------------------\n"+hashmap);

        /*Displaying size of the map*/

        System.out.println("------------------------Displaying size of the map:--------------------------\n"+ hashmap.size());

        /*Searching a particular value*/

        if(hashmap.containsKey("a"))
        {
            Integer i = hashmap.get("a");
            System.out.println("---------------------value for key a after searching is :--------------------\n"+i);
        }

        /*Displaying all the keys in map*/

        System.out.println("-------------------------Displaying all the keys in hashmap----------------------------");
        for(String Key: hashmap.keySet())
            System.out.println(Key);

        /*Using entryset*/

        System.out.println("-------------------------Displaying k,v pair using entryset----------------------------");
        for(Map.Entry<String,Integer> entry: hashmap.entrySet())
        {
            System.out.println("key:"+entry.getKey()+", value:"+entry.getValue());
        }





    }
}
