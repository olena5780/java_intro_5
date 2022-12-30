package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Practice {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 9, 4, 5, 2, 1, -1, 5};
        //remove duplicates
        LinkedHashSet<Integer> uniques = new LinkedHashSet<>(Arrays.asList(numbers));
        System.out.println(uniques);


    }

}