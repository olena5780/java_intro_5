package practice.arrayListPactices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListPractices {
    public static void main(String[] args) {


        /*
1. Create an arraylist and assign 5 numbers
    example: [1, 2, 3, 4, 5]
2. Create a loop which will replace every number "2" with 7
    example: [1, 7, 3, 4, 5]
3. Remove if the number is divisible by 2
    example: [1, 7, 3, 5]
NOTE: Use iterator.
4. As the last step add three "10" in the end
 */

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
       for (int i = 0; i < numbers.size(); i++) {
           if(numbers.get(i) ==2) numbers.set(i, 7);
       }
        System.out.println();





    }
    }

