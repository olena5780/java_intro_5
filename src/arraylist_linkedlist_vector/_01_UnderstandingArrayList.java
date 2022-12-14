package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_UnderstandingArrayList {
    public static void main(String[] args) {
        //1.Declaring an Array vs an ArrayList
        System.out.println("\n--------Declarin of array vs ArrayList----------\n");
        String[] names1 = new String[3];

        ArrayList<String> names2 = new ArrayList<>(); // capacity  = 10 by default

        //2. Getting the size of the array vs ArrayList
        System.out.println("\n--------Size of array vs ArrayList----------\n");
        System.out.println("The size of the array = " + names1.length); //3
        System.out.println("The size of the ArrayList = " + names2.size()); //0

        //3. Printing an array vs ArrayList
        System.out.println("\n--------Printing of array vs ArrayList----------\n");
        System.out.println("The array  = " + Arrays.toString(names1));
        System.out.println("The ArrayList  = " + names2);

        //4. Adding elements to specific indexes
        names1[0]= "Alex";
        names2.add(0, "John"); //

        System.out.println("\n--------Printing of array vs ArrayList----------\n");
        System.out.println("The array  = " + Arrays.toString(names1));
        System.out.println("The ArrayList  = " + names2);


        names1[1] ="Ali";
        names1[2] ="Andrii";
        names2.add(1, "Joe");
        names2.add(2, "Jane");
        System.out.println("The array  = " + Arrays.toString(names1));
        System.out.println("The ArrayList  = " + names2);

        /*
        Add below names to ArrayList and print it
        Abdallah   Vlad   Saeed  Suzanne   Hazal  Yildiz Samir
         */

        names2.add("Abdallah");
        names2.add("Vlad");
        names2.add("Saeed");
        names2.add("Suzanne");
        names2.add("Hazal");
        names2.add("Yildiz");
        names2.add("Samir");
        System.out.println(names2);
        System.out.println("The size of ArrayList is " + names2.size());

        //Updating an existing element in ana array


        names1[1] = "Mike";
        names2.set(1, "Olena");
        System.out.println(Arrays.toString(names1));
        System.out.println(names2);
    }
}
