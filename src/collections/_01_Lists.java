package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class _01_Lists {
    public static void main(String[] args) {

        // Lists preserve insertion order,
        // Lists allows duplicates
        // Lists allows nulls

        /* Details
        -Performance
        -Memory
        -Initial capacity
        -Load
        -The way they store data
         */


       /* ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("");
        fruits.add("");
        fruits.add(null);
        fruits.add(null);

        System.out.println(fruits);//[Apple, Apple, Orange, , , null, null]

        */
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.offer("Orange");
        fruits.offerFirst("Pineapple");
        System.out.println(fruits.element());//Pineapple (Queue method)
        System.out.println(fruits.getFirst()); //Pineapple (Dequeque method)

        System.out.println(fruits); //[Pineapple, Apple, Orange]
        fruits.clear();
        System.out.println(fruits.poll()); // null
        System.out.println(fruits.remove()); // NoSuchElementException


    }
}
