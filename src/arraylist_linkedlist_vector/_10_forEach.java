package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _10_forEach {
    public static void main(String[] args) {
        /*
        Create an Arraylist to store below colors;
        Blue
        Red
        Brown
        Yellow
        Black

        Print the ArrayList
         */

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Red", "Brown", "Yellow", "Black"));
        System.out.println(colors);

        System.out.println("\n------Iterating with Fori-------\n");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));

        }
        System.out.println("\n------Iterating with For Each Loop------\n");
        for (String color : colors) {
            System.out.println(color);

        }
        System.out.println("\n------Iterating with forEach ------\n");
        colors.forEach(System.out::println);


    }
}
