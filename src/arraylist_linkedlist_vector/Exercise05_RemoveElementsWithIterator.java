package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise05_RemoveElementsWithIterator {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>(Arrays.asList(
                "Pen",
                "Pencil",
                "Book",
                "Notebook",
                "MacBook Pro"
        ));


        /*
        TASK
        Remove elements that contains "book"
        -This is case-insensitive

        Print the list -> [Pen, Pencil]
         */

        Iterator<String> objectsIterator = objects.iterator();

        while(objectsIterator.hasNext()){
            String f = objectsIterator.next();

            if(f.toLowerCase().contains("book")) objectsIterator.remove();
        }
        System.out.println(objects);
    }
    }

