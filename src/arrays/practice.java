package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 9};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]+= 3;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(addSome(numbers)));


        ArrayList<Integer> nums = new ArrayList<>();


    }


    public static int[]addSome(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] +=3;

        }
        return numbers;
    }



}
