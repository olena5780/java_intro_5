package arrays;

import java.util.Arrays;

public class _06_doubleArray_Recap {
    public static void main(String[] args) {

        double[] decimals = {1.5, 2.3, -1.3, -3.7};
        char[] chars = {'a', 'b', 'c', 'd'};

        System.out.println(Arrays.toString(decimals));
        System.out.println("The length of the array is " + decimals.length);

                //{1.5, 2.3, -1.3, -3.7}; -> {-3.7, -1.3, 1.5, 2.3}

        Arrays.sort(decimals);
        System.out.println("Arrays after sorting-> " + Arrays.toString(decimals));
//WHEN YOU NEED INDEXES OR AN INCREMENT TO USE GO WITH FORI WITH ARRAYS
        System.out.println("\n----------fori loop----------\n");
        for (int i = 0; i < decimals.length; i++) {
            System.out.println(decimals[i]);
        }
        //WHEN YOU DON'T NEED INDEXES OR AN INCREMENT TO USE GO WITH FOR EACH WITH ARRAYS
        System.out.println("\n----------foreach looploop---------\n");
        for (double element : decimals) {
            System.out.println(element);

        }

        System.out.println("\n----------fori loop two arrays----------\n");
        for (int i = 0; i < decimals.length; i++) {
            System.out.println(decimals[i] + " - " + chars[i]);
        }

    }
}
