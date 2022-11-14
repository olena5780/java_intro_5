package arrays;

import java.util.Arrays;

public class _07_StringArray_Recap {
    public static void main(String[] args) {

        // create String array with length
        //Assign "Apple" to index of 0
        //Assign "Kiwi" to index of 3
        //Print

        String[] fruits = new String[4];
        System.out.println(Arrays.toString(fruits));
        fruits[0]= "Apple";
        fruits[3]= "Kiwi";
        System.out.println(Arrays.toString(fruits));

        fruits[1]= "Orange";
        fruits[2]= "Grapes";
        System.out.println(Arrays.toString(fruits));

        System.out.println("\nReassigning values\n");

        fruits[2]= fruits[0];
        fruits[3]= fruits[0];
        System.out.println(Arrays.toString(fruits));

        System.out.println("\nPrinting values with for each loop\n");
        for(String element : fruits){
            System.out.print(element + " ");
        }


    }
}
