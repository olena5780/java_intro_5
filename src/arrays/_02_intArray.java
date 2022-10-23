package arrays;

import java.util.Arrays;

public class _02_intArray {
    public static void main(String[] args) {

       //1. Create an int array and store 0, -5, 2, 10, 5, 2, -1, 0

        int[] numbers = {0, -5, 2, 10, 5, 2, -1, 0};

        //2. Print array
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < 8; i++) {
            System.out.println(numbers[i]);

        }
        //For each loop way - enhance for loop
        for(int number : numbers){
            System.out.println(number);
        }
    }
}
