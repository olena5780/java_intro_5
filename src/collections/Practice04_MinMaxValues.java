package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Practice04_MinMaxNumbers {
    public static void main(String[] args) {
        System.out.println(max(new Integer[]{10, 100, 123, 507, 25}));
        System.out.println(max(new Integer[]{12}));
        System.out.println(max(new Integer[]{}));

        System.out.println(min(new Integer[]{10, 100, 123, 507, 25}));//123
        System.out.println(min(new Integer[]{10, 10, 123, 507, 25}));//123
        System.out.println(min(new Integer[]{12}));
        System.out.println(min(new Integer[]{}));

        System.out.println(secondMax(new Integer[]{10, 100, 123, 507, 25})); //10
        System.out.println(secondMax(new Integer[]{12})); //
        System.out.println(secondMax(new Integer[]{}));
    }

    /*
    Find the max given numbers below

    [10, 100, 123, 507, 25] - > 507
    [12] - > 12
    [] -> null


    public static int max(Integer[] arr){
      if(arr.length== 0) throw new NullPointerException();
        int max = Integer.MIN_VALUE;
        for (Integer integer : arr) {
         if(integer >max) max = integer;
        }
        return max;
        }

         */
    public static int max(Integer[] arr){
        return new TreeSet<>(Arrays.asList(arr)).pollLast();
    }

    /*
Find the min from given numbers below

[10, 100, 123, 507, 25] -> 10
[12] -> 12
[] -> null
 */

    public static int min(Integer[] arr){
        try {
            return new TreeSet<>(Arrays.asList(arr)).pollFirst();
        } catch(NullPointerException e) {
           return null;
        }

    }

    public static int secondMax(Integer[] arr){
    TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr));
        set.pollLast(); // min
        return set.pollLast();
    }





}
