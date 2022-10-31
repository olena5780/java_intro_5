package arraylist_linkedlist_vector;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class _06_Sorting {
    public static void main(String[] args) {
                /*
        Create below LinkedList to store data

        1 -> 10, -3, 5, 15
        2 -> Remote, Phone, Laptop

        Print the LinkedLists
        Sort the LinkedLists and print them again

        EXPECTED:
        [10, -3, 5, 15]
        [Remote, Phone, Laptop]
        [-3, 5, 10, 15]
        [Laptop, Phone, Remote]
         */


        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(10, -3, 5, 15));
        LinkedList<String> objects = new LinkedList<>(Arrays.asList("Remote", "Phone", "Laptop"));

        System.out.println("\n =======Before sort========\n");
        System.out.println(numbers);
        System.out.println(objects);

        System.out.println("\n =======After sort========\n");
        Collections.sort(numbers);
        Collections.sort(objects);
        System.out.println(numbers);
        System.out.println(objects);



    }
}
