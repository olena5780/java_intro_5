package projects;

import java.util.Arrays;

public class Project05 {
    public static void main(String[] args) {

        System.out.println("\n==================Task1==================\n");
       int[] numbers = new int [] {10, 7, 7, 10, -3, 10, -3 };
       findGreatestAndSmallestWithSort(numbers);

        System.out.println("\n==================Task2==================\n");
        findGreatestAndSmallest(numbers);

        System.out.println("\n==================Task3==================\n");
        int[] elements = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSmallestWithSort(elements);


        System.out.println("\n==================Task4==================\n");

        findSecondGreatestAndSmallest(elements);

        System.out.println("\n==================Task5==================\n");
        String[] strings = {"foo", "bar", "Foo", "6", "abc", "6", "xyz"};
        findDuplicatedElementsInAnArray(strings);

        System.out.println("\n==================Task6==================\n");
        String[] objects = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        findMostRepeatedElementInAnArray(objects);

    }

    public static void findGreatestAndSmallestWithSort(int[] numbers ){
        Arrays.sort(numbers);
        System.out.println("Smallest = " + numbers[0]);
        System.out.println("Greatest = " + numbers[numbers.length-1]);
    }

    public static void  findGreatestAndSmallest(int[] numbers) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number < min) min = number;

            if (number > max) max = number;
        }
        System.out.println("Smallest = " + min);
        System.out.println("Greatest = " + max);
    }
        /*
        TASK-3 - findSecondGreatestAndSmallestWithSort() method
Write a method that takes an int array that has at least one element. Find the second greatest and second smallest elements from the array and print them. Complete task using sort() method.

Test data:
[10, 5, 6, 7, 8, 5, 15, 15]

Expected output:
Second Smallest = 6
Second Greatest = 10
         */

            public static int findMin (int[] elements) {
                int min = Integer.MAX_VALUE;
                for (int element : elements) {
                    if (element < min) min = element;
                }
                return min;
            }

            public static int findMax(int[] elements){

                int max = Integer.MIN_VALUE;
                for (int element : elements) {
                    if (element > max) max = element;
                }

                return max;
            }

    public static void findSecondGreatestAndSmallestWithSort(int[] elements){

    }

    /*
            TASK-4 - findSecondGreatestAndSmallest() method
        Write a method that takes an int array that has at least one element. Find the second greatest and second smallest elements from the array and print them. DO NOT sort the array and complete task without sorting.

        Test data:
        [10, 5, 6, 7, 8, 5, 15, 15]

        Expected output:
        Second Smallest = 6
        Second Greatest = 10
     */

    public static void findSecondGreatestAndSmallest(int[] elements){

        int secondMin = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : elements) {
            if (number < secondMin && number > findMin(elements))
                secondMin = number;


            if (number > secondMax && number < findMax(elements))
                secondMax = number;
        }
        System.out.println("Smallest = " + secondMin);
        System.out.println("Greatest = " + secondMax);
    }

    /*
        TASK-5 - findDuplicatedElementsInAnArray() method
    Write a method that takes a String array. Find all duplicated elements and print them.
    NOTE: It is case-sensitive!

    Test data:
    [“foo”, “bar”, “Foo”, “bar”, “6”, “abc”, “6”, “xyz”]

    Expected output:
    bar
    6
     */
    public static void findDuplicatedElementsInAnArray(String[] strings){

    }
    /*
    TASK-6 findMostRepeatedElementInAnArray() method
Write a method that takes a String array. Find the most repeated element and print it.

Test data:
[“pen”, “eraser”, “pencil”, “pen”, “123”, “abc”, “pen”, “eraser”]

Expected output:
pen
     */

    public static void findMostRepeatedElementInAnArray(String[] strings){

    }



}















