package practice.arrayListPactices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindFirstNegativePositive {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, -4, -7, 0, 5, 10, 45));
        firstPositiveAndNegative(numbers);


    }
    /*
    Create method that will take an ArrayList and it will finds the first positive and first negative number and print it
    ArrayList [0, -4, -7, 0, 5, 10, 45]
     */

    public static void firstPositiveAndNegative(ArrayList<Integer>numbers) {

       int firstNegative = 0;
       int firstPositive = 0;

        for (Integer number : numbers) {
            if(number < 0  && firstNegative == 0) {
                firstNegative = number;
            }if(number > 0  && firstPositive == 0) {
                firstPositive = number;
            }

        }
        System.out.println("First positive number is: " + firstPositive +
                "\nFirstnegative is: " + firstNegative);


    }


}
