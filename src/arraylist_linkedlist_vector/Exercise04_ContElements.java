package arraylist_linkedlist_vector;

import java.util.Arrays;
import java.util.Vector;

public class Exercise04_ContElements {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>(Arrays.asList(10, 15, 20, 25, 30));

        /*
        Count evens -> 3
        Count odds -> 2
        Count numbers that are more than 15 -> 3

       */

        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count()); // 3
        System.out.println(numbers.stream().filter(x -> x % 2 == 1).count());
        System.out.println(numbers.stream().filter(x -> x > 15).count());
        System.out.println(numbers.stream().filter(x -> x != 20).count());

    }
}
