package com.company;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String args[])
    {
        Map<String,Integer> treemap = new TreeMap<>();

        /*Adding keys and values*/

        treemap.put("d",30);
        treemap.put("c",20);
        treemap.put("a",50);
        treemap.put("b",10);
        treemap.put("e",40);

        /*Displaying the key,value pair in map*/

        System.out.println("----------------------------------key-value pairs----------------------------\n"+treemap);

        /*Removing  one key,value pair in map*/

        treemap.remove("b");
        System.out.println("---------------------------key-value pairs after removing:---------------------\n"+treemap);

        /*Displaying size of the map*/

        System.out.println("------------------------Displaying size of the map:--------------------------\n"+ treemap.size());

        /*Searching a particular value*/

        if(treemap.containsKey("a"))
        {
            Integer i = treemap.get("a");
            System.out.println("---------------------value for key a after searching is :--------------------\n"+i);
        }

        /*Displaying all the keys in map*/

        System.out.println("-------------------------Displaying all the keys in treemap----------------------------");
        for(String Key: treemap.keySet())
            System.out.println(Key);

        /*Using entryset*/

        System.out.println("-------------------------Displaying k,v pair using entryset----------------------------");
        for(Map.Entry<String,Integer> entry: treemap.entrySet())
        {
            System.out.println("key:"+entry.getKey()+", value:"+entry.getValue());
        }





    }
}
