package com.company;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String args[])
    {
        Queue<String> queue = new PriorityQueue<>();

        /*Adding elements*/

        queue.add("India");
        queue.add("Germany");
        queue.add("America");
        queue.add("Russia");
        queue.add("Netherland");

        /*Displaying the elements in queue*/

        System.out.println("------------------------elements present in queue----------------------");
        for(String element:queue)
            System.out.println(element);

        /*Removing the elements in queue*/

        queue.remove();

        /*Displaying the elements in queue after removing*/

        System.out.println("------------------------elements present in queue after removing----------------------");
        for(String element:queue)
            System.out.println(element);


        /*Shows the top element of queue*/

        String head = queue.peek();

        System.out.println("------------------------Head element in queue ----------------------");
        System.out.println(head);

        /*removes the head element in queue and shows which element is removed*/

        head = queue.poll();

        System.out.println("------------------------ Removing head element in queue ----------------------");
        System.out.println(head);

        /*Displaying the final queue elements after all these methods*/

        System.out.println("------------------------ Final elements in queue ----------------------");
        for(String element:queue)
            System.out.println(element);

        /*Displaying size of queue*/

        System.out.println("------------------------------Size of queue---------------------------------");
        int size = queue.size();
        System.out.println("size is:"+" "+size);

        /*Searching a particular element*/

        System.out.println("---------------------Searching of an element---------------------------------");
        boolean value =  queue.contains("Germany");
        if (value)
            System.out.println("The list contains Germany");
        else
            System.out.println("The list does not contains Germany");






    }
}
