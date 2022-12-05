package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project08 {
    public static void main(String[] args) {
        System.out.println("\n---------Task1--------\n");
        int[] arr1 = {4, 8, 7, 15};
        System.out.println(findClosestDistance(arr1));
        System.out.println("\n---------Task2--------\n");
        int[] arr2 = {5, 3, -1, 3, 5, 7, -1};
        System.out.println(findSingleNumber(arr2));
        System.out.println("\n---------Task3--------\n");
        String str3 = "abc abc d";
        System.out.println(findFirstUniqueCharacter(str3));
        System.out.println("\n---------Task4--------\n");
        int[] arr4 = {4, 7, 8, 6};
        System.out.println(findMissingNumber(arr4));

    }

    /*
    TASK-1 - findClosestDistance() method
•Write a method that takes a int[] array as an argument and returns the closest difference between the numbers
•This method will return an int which is the closest difference between 2 elements in the array
•NOTE: if array does not have at least 2 elements, then return -1.

Test data2:
[4, 8, 7, 15]
Expected output:
1


     */
    public static int findClosestDistance(int[] arr1) {

        if (arr1.length >= 2) {
            Arrays.sort(arr1);
            int min = arr1[arr1.length - 1];
            for (int i = 0; i < arr1.length - 1; i++) {
                min = Math.min(min, arr1[i + 1] - arr1[i]);
            }
            return min;

        } else return -1;

    }

    /*TASK-2 – findSingleNumber() method
Write a method that takes a int[] array as an argument and returns the element occurs only once.
You will be given a non-empty array in which all the elements appears twice except for one.
 Test data 2:
 [5, 3, -1, 3, 5, 7, -1]
 Expected output 2:
 7

     */
    public static Integer findSingleNumber(int[] arr2) {
        int single = 0;
        Arrays.sort(arr2);
        if (arr2.length == 1) return arr2[0];
        else {
            for (int i = 0; i < arr2.length - 1; i++) {
                if (arr2[i] != arr2[i + 1])
                    single = arr2[i + 1];
            }
        }
        return single;
    }

    /*
    TASK-3 - findFirstUniqueCharacter() method
    Write a method that takes a non-empty String as an argument and returns the first unique character in the String.
    This method returns a char.
    If there is no unique character in the String, then return space by default.
    This task is case-sensitive.
    Test data 2:
    abc abc d

    Expected output 2:
    d
     */
    public static char findFirstUniqueCharacter(String str3) {

        for (int i = 0; i < str3.length(); i++) {
            if (str3.indexOf(str3.charAt(i)) == str3.lastIndexOf(str3.charAt(i)))
                return str3.charAt(i);
        }
        return ' ';
    }
/*
TASK-4 – findMissingNumber() method
Write a method that takes a int[] array as an argument and returns the missing element.
You will be given an array length of 2 at least.
Array elements will be representing a sequence of numbers that increases by 1.

Test data 3:
[4, 7, 8, 6]

Expected output 2:
5
 */

    public static int findMissingNumber(int[] arr4){
        Arrays.sort(arr4);
        int num = arr4[0];

        for (int i = 0; i < arr4.length; i++) {
            if(arr4[i] == num) num++;
        }
        return num;
    }
}