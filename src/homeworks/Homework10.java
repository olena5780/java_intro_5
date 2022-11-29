package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Homework10 {
    public static void main(String[] args) {
        System.out.println("\n-------------------------Task1----------------------");
        String str = "Selenium is the most common UI automation tool.   ";

        System.out.println(countWords(str));
        System.out.println("\n-------------------------Task2----------------------");
        String str2 = "TechGlobal is a QA bootcamp";
        System.out.println(countA(str2));
        System.out.println("\n-------------------------Task3----------------------");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-23, -4, 0, 2, 5, 90, 123));
        System.out.println(countPos(numbers));
        System.out.println("\n-------------------------Task4----------------------");
        ArrayList<Integer> numbers4 = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        System.out.println(removeDuplicateNumbers(numbers4));
        System.out.println("\n-------------------------Task5----------------------");
        ArrayList<String> elements = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        System.out.println(removeDuplicateElements(elements));
        System.out.println("\n-------------------------Task6----------------------");
        String str6 = "   I   am      learning     Java      ";
        System.out.println(removeExtraSpaces(str6));
        System.out.println("\n-------------------------Task7----------------------");
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        System.out.println(Arrays.toString(add(arr1, arr2)));
        System.out.println("\n-------------------------Task8----------------------");
        int[] num8 = {10, -13, 5, 70, 15, 57};
        System.out.println(findClosestTo10(num8));



    }
    //-------------------------Task1----------------------
    /*
Write a method countWords() that takes a String as an argument,
and returns how many words there are in the given String
Test data 2:
String str = “Selenium is the most common UI automation tool.   ”;
Expected output 2:
8

     */
    public static int countWords(String str){
        int counter = 0;
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') counter++;
        }
        if(str.length() == 0) return 0;
        return counter + 1 ;

    }
    //-------------------------Task2----------------------
    /*
Write a method countA() that takes a String as an argument,
and returns how many A or a there are in the given String
Test data 1:
String str = “TechGlobal is a QA bootcamp”;
Expected output 1:
4
     */
    public static int countA(String str2){
        int container = 0;
        str2 = str2.trim();
        for (int i = 0; i < str2.length(); i++) {
            if(str2.charAt(i) == 'a'|| str2.charAt(i) == 'A'){
                container++;
            }
        }
        return container;
    }
    //-------------------------Task3----------------------
    /*
Write a method countPos() that takes an ArrayList of Integer as an argument,
and returns how many elements are positive
Test data 2:
[-23, -4, 0, 2, 5, 90, 123]
Expected output 2:
4

     */
    public static int countPos(ArrayList<Integer> numbers){
        int pos = 0;
        for (Integer number : numbers) {
            if(number > 0) pos++;
        }
        return pos;
    }

    //-------------------------Task4----------------------
    /*
Write a method removeDuplicateNumbers() that takes an ArrayList of Integer as an argument,
and returns it back with removed duplicates
Test data 1:
[10, 20, 35, 20, 35, 60, 70, 60]
Expected output 1:
[10, 20, 35, 60, 70]
     */
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers4){

        ArrayList<Integer> c = new ArrayList<>();
        for (Integer n : numbers4) {
            if(!c.contains(n)) c.add(n);
        }
        return c;
    }
    //-------------------------Task5----------------------
    /*
Write a method removeDuplicateElements() that takes an ArrayList of String as an argument, and returns it back with removed duplicates
Test data 1:
[“java”, “C#”, “ruby”, “JAVA”, “ruby”, “C#”, “C++”]
Expected output 1:
[“java”, “C#”, “ruby”, “JAVA”,  “C++”]

     */
    public static ArrayList<String> removeDuplicateElements(ArrayList<String>elements){

        ArrayList<String> uniques = new ArrayList<>();

        for (String element : elements) {
            if(!uniques.contains(element)) uniques.add(element);

        }
        return uniques;


    }
    //-------------------------Task6----------------------
    /*
Write a method removeExtraSpaces() that takes a String as an argument, and returns a String with removed extra spaces
Test data 1:
String str = “   I   am      learning     Java      ”;
Expected output 1:
I am learning Java
     */

    public static String removeExtraSpaces(String str6){
        return str6 = str6.replaceAll("\\s+", " ").trim();
    }
    //-------------------------Task7----------------------
    /*
Write a method add() that takes 2 int[] arrays as arguments and returns a new array with sum of given arrays elements.
Test data 1:
int[] arr1 = {3, 0, 0, 7, 5, 10};
int[] arr2 = {6, 3, 2};

Expected output 1:
[9, 3, 2, 7, 5, 10]

     */

    public static int[] add(int[] arr1, int[] arr2){
       if(arr1.length > arr2.length){
           for (int i = 0; i < arr2.length; i++) {
               arr1[i] += arr2[i];
           }
       }else{
           for (int i = 0; i < arr1.length; i++) {
               arr2[i] += arr1[i];
       }
       }

     if(arr1.length > arr2.length)return arr1;
     else return arr2;

    }

    //-------------------------Task8----------------------
/*
Write a method findClosestTo10() that takes an int[] array as an argument, and returns the closest element to 10 from given array

Test data 1:
int[] numbers = {10, -13, 5, 70, 15, 57};
Expected output 1:
5
 */
    public static int findClosestTo10(int[] num8){
        int absDifference = Integer.MAX_VALUE;

        for (int num : num8) {
            if (Math.abs(10 - num) <= Math.abs(absDifference - 10) && num != 10) {
                if (Math.abs(10 - num) == Math.abs(absDifference - 10)) absDifference = Math.min(num, absDifference);
                else absDifference = num;
            }
        }
        return absDifference;
    }
}
