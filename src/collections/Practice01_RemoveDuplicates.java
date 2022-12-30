package collections;

import javax.jnlp.IntegrationService;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Practice01_RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(removeDuplicates(new Integer[]{-5, 10, -5, 10, 1, 2, 5})));
        System.out.println(Arrays.asList(removeDuplicates(new Integer[]{-5, 10, 1, 2, 5})));
        System.out.println(Arrays.asList(removeDuplicates(new Integer[]{})));

    }

    /*
    Create a method that takes array of numbers below
    -5, 10, -5, 10, 1, 2, 5
    Remove all duplicates , and return new array
    [-5, 10, 1, 2, 5]
     */


        /*
        public static Integer[] removeDuplicates(Integer[] arr){
    ArrayList<Integer> uniques = new ArrayList<>();
    for (Integer i : arr) {
        if(!uniques.contains(i)) uniques.add(i);
    }

    return uniques.toArray(new Integer[0]);
}
         */

        public static Integer[]removeDuplicates(Integer[] arr){
        return new LinkedHashSet<>(Arrays.asList(arr)).toArray(new Integer[0]);
    }

}
