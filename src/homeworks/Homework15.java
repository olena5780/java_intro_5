package homeworks;

import java.util.*;

public class Homework15 {
    public static void main(String[] args) {
        System.out.println("\n------------Task-1---------\n");
        System.out.println(Arrays.toString(fibonacciSeries1(7)));

        System.out.println("\n------------Task-2---------\n");
        System.out.println(fibonacciSeries2(2));
        System.out.println(fibonacciSeries2(4));
        System.out.println(fibonacciSeries2(8));

        System.out.println("\n------------Task-3---------\n");
        System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{}))); // []
        System.out.println(Arrays.toString(findUniques(new int[]{}, new int[]{1, 2, 3, 2})));
        System.out.println(Arrays.toString(findUniques(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 5})));
        System.out.println(Arrays.toString(findUniques(new int[]{8, 9}, new int[]{9, 8, 9})));

        System.out.println("\n------------Task-4---------\n");
        System.out.println(isPowerOf3(1));
        System.out.println(isPowerOf3(2));
        System.out.println(isPowerOf3(3));
        System.out.println(isPowerOf3(81));

        System.out.println("\n------------Task-5---------\n");
        System.out.println(firstDuplicate(new int[]{}));
        System.out.println(firstDuplicate(new int[]{1}));
        System.out.println(firstDuplicate(new int[]{1, 2, 2, 3}));
        System.out.println(firstDuplicate(new int[]{1, 2, 3, 3, 4, 1}));
        System.out.println(firstDuplicate(new int[]{1, 2, 3, 4, 3}));

    }
    ///////////////////////////Task1////////////////////////////
          /*
          Requirement:
      -Create a method called fibonacciSeries1()
      -This method will take an int argument as n, and it will return n series of Fibonacci numbers as an int array.

      REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21

     */
    public static int[] fibonacciSeries1(int n) {
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }
        return fib;

    }


    ///////////////////////////Task2////////////////////////////
    /*
        Requirement:
    -Create a method called fibonacciSeries2()
    -This method will take an int argument as n, and it will return the nth series of Fibonacci number as an int.

    REMEMBER: Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21

     */
    public static int fibonacciSeries2(int n) {
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }
        return fib[n - 1];

    }


    ///////////////////////////Task3////////////////////////////
    /*
          -Create a method called findUniques()
      -This method will take 2 int array argument and it will return an int array
      which has only the unique values from both given arrays.
      NOTE: If both arrays are empty, then return an empty array.
      NOTE: if one of the array is empty, then return unique values from the other array.
      
     */
    public static int[] findUniques(int[] arr1, int[] arr2) {
        List<Integer> listNumbers = new ArrayList<>();
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) listNumbers.add(num1); //[1, 2, 3, 4, 3, 4, 5, 5]
            }
        }
        HashSet<Integer> noDup = new HashSet<>();
        for (int i : arr1)
            if (!listNumbers.contains(i))
                noDup.add(i);
        for (int i : arr2) {
            if (!listNumbers.contains(i))
                noDup.add(i);
        }

        int[] uniques = new int[noDup.size()];
        int i = 0;
        for (Integer num : noDup) {
            uniques[i++] = num;
        }
        return uniques;
    }

    ///////////////////////////Task4////////////////////////////
        /*
      -Create a method called isPowerOf3()
      -This method will take an int argument and it will return true if given int argument is equal to 3 power of the X. Otherwise, it will return false.

      Numbers that are power of 3 = 1, 3, 9, 27, 81, 243….

         */
    public static boolean isPowerOf3(int arg) {
        return arg % 3 == 0 || arg == 1;
    }

    ///////////////////////////Task5////////////////////////////

    /*
   Requirement:
  -Create a method called firstDuplicate()
  -This method will take an int array argument and it will return an int which is the first duplicated number.
  NOTE: All elements will be positive numbers.
  NOTE: If there are no duplicates, then return -1
  NOTE: If there are more than one duplicate, then return the one for which second occurrence has the smallest index.

     */
    public static int firstDuplicate(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }


}
















