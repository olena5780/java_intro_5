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
        String[] strings = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        findDuplicatedElementsInAnArray(strings);

        System.out.println("\n==================Task6==================\n");
        String[] objects = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        findMostRepeatedElementInAnArray(objects);

    }
    //System.out.println("\n==================Task1==================\n");
    public static void findGreatestAndSmallestWithSort(int[] numbers ){
        Arrays.sort(numbers);
        System.out.println("Smallest = " + numbers[0]);
        System.out.println("Greatest = " + numbers[numbers.length-1]);
    }
    //System.out.println("\n==================Task2==================\n");
    public static void findGreatestAndSmallest(int[] numbers) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number < min) min = number;

            if (number > max) max = number;
        }
        System.out.println("Smallest = " + min);
        System.out.println("Greatest = " + max);
    }

    //System.out.println("\n==================Find Min and Max(for Task3 & Task4)==================\n");
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
    //System.out.println("\n==================Task3==================\n");
    public static void findSecondGreatestAndSmallestWithSort(int[] elements){
                Arrays.sort(elements);
        int secondMin = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;


        for (int element : elements) {
            if (element < secondMin && element > findMin(elements)){
                secondMin = element;}
            if (element > secondMax && element < findMax(elements)){
                secondMax = element;}
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);


    }

    //System.out.println("\n==================Task4==================\n");
    public static void findSecondGreatestAndSmallest(int[] elements){

        int secondMin = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int number : elements) {
            if (number < secondMin && number > findMin(elements))
                secondMin = number;


            if (number > secondMax && number < findMax(elements))
                secondMax = number;
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Greatest Greatest = " + secondMax);
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
    //System.out.println("\n==================Task5==================\n");
    public static void findDuplicatedElementsInAnArray(String[] strings){
        String dup = "";

        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                // if we already checked break it
                if (dup.contains(strings[i])) break;

                // if we didn't check it add it in dup container
                if (strings[i].equals(strings[j])) {
                    dup = strings[i];
                    System.out.println(strings[i]);
                }
            }
        }


    }


    //System.out.println("\n==================Task6==================\n");
    public static void findMostRepeatedElementInAnArray(String[] strings){
        String check = "";
        int count = 0;
        int countRepeat= 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length ; j++) {
                if(strings[i].equals(strings[j])) count++;
            }
            if(count > countRepeat){
                countRepeat = count;
                check = strings[i];
            }
        }
        System.out.println(check);

    }



}















