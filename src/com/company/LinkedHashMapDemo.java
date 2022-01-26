package com.company;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String args[])
    {
        Map<String,String> linkedhashmap = new LinkedHashMap<>();

        /*Adding keys and values*/

        linkedhashmap.put("a","excellent");
        linkedhashmap.put("b","good");
        linkedhashmap.put("c","average");
        linkedhashmap.put("d","poor");
        linkedhashmap.put("e","improve");

        /*Displaying the key,value pair in map*/

        System.out.println("----------------------------------key-value pairs----------------------------\n"+linkedhashmap);

        /*Removing  one key,value pair in map*/

        linkedhashmap.remove("d");
        System.out.println("---------------------------key-value pairs after removing:---------------------\n"+linkedhashmap);

        /*Displaying size of the map*/

        System.out.println("------------------------Displaying size of the map:--------------------------\n"+ linkedhashmap.size());

        /*Searching a particular value*/

        if(linkedhashmap.containsKey("a"))
        {
            String str = linkedhashmap.get("a");
            System.out.println("---------------------value for key a after searching is :--------------------\n"+str);
        }

        /*Displaying all the keys in map*/

        System.out.println("-------------------------Displaying all the keys in linkedhashmap----------------------------");
        for(String Key: linkedhashmap.keySet())
            System.out.println(Key);

        /*Using entryset*/

        System.out.println("-------------------------Displaying k,v pair using entryset----------------------------");
        for(Map.Entry<String,String> entry: linkedhashmap.entrySet())
        {
            System.out.println("key:"+entry.getKey()+", value:"+entry.getValue());
        }





    }
}
