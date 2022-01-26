package com.company;

import java.util.*;

public class ArrayDeckDemo {
    public static void main(String[] args)
    {
        Deque<Integer> deque = new ArrayDeque<Integer>();

        /*Adding elements*/

        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);

        /*Displaying elements in deque*/

        for (Integer element : deque) {
            System.out.println("Element : " + element);
        }

        /*Using clear method*/

        System.out.println("Using clear() ");
        deque.clear();

        /*Inserting at the start using addFirst() method*/

        deque.addFirst(564);
        deque.addFirst(291);

        /* Inserting at end using addLast() method*/

        deque.addLast(24);
        deque.addLast(14);


        System.out.println(
                "Above elements are removed now");

        /*Using Iterators*/

        System.out.println(
                "Elements of deque using Iterator :");

        for (Iterator itr = deque.iterator();
             itr.hasNext();) {
            System.out.println(itr.next());
        }

        /* descendingIterator() To reverse the deque order*/
        System.out.println(
                "Elements of deque in reverse order :");

        for (Iterator dItr = deque.descendingIterator();
             dItr.hasNext();) {
            System.out.println(dItr.next());
        }

        /*Element() method to get Head element*/

        System.out.println(
                "Head Element using element(): "
                        + deque.element());


        /*getFirst() method to get Head element*/

        System.out.println("Head Element using getFirst(): "
                + deque.getFirst());

        /*getLast() method to get last element*/

        System.out.println("Last Element using getLast(): "
                + deque.getLast());

        /*peek() method to get head*/
        System.out.println("Head element : "
                + deque.peek());

        /*poll() method to get head*/

        System.out.println("Head element poll : "
                + deque.poll());

        /*push() method*/

        deque.push(265);
        deque.push(984);
        deque.push(2365);

        /*remove() method to get head*/

        System.out.println("Head element remove : "
                + deque.remove());

        System.out.println("The final array is: " + deque);
    }
}
