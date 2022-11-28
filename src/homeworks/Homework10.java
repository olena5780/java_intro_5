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
        //System.out.println(Arrays.toString(add(arr1, arr2));
        System.out.println("\n-------------------------Task8----------------------");


    }
    //-------------------------Task1----------------------
    /*
    Requirement:
Write a method countWords() that takes a String as an argument, and returns how many words there are in the the given String

Test data 1:
String str = “      Java is fun       ”;
Expected output 1:
3
Test data 2:
String str = “Selenium is the most common UI automation tool.   ”;
Expected output 2:
8

NOTE: Make your code dynamic that works for any given String
NOTE: Be careful about empty String
NOTE: Be careful about before and after white spaces

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
    Requirement:
Write a method countA() that takes a String as an argument, and returns how many A or a there are in the the given String

Test data 1:
String str = “TechGlobal is a QA bootcamp”;
Expected output 1:
4

Test data 2:
String str = “QA stands for Quality Assurance”;
Expected output 2:
5


NOTE: Make your code dynamic that works for any given String
NOTE: Be careful about empty String
NOTE: Be careful about uppercase and lowercase


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
    Requirement:
Write a method countPos() that takes an ArrayList of Integer as an argument, and returns how many elements are positive

Test data 1:
[-45, 0, 0, 34, 5, 67]

Expected output 1:
3

Test data 2:
[-23, -4, 0, 2, 5, 90, 123]

Expected output 2:
4

NOTE: Make your code dynamic that works for any given ArrayList of Integer

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
    Write a method removeDuplicateNumbers() that takes an ArrayList of Integer as an argument, and returns it back with removed duplicates

Test data 1:
[10, 20, 35, 20, 35, 60, 70, 60]

Expected output 1:
[10, 20, 35, 60, 70]

Test data 2:
[1, 2, 5, 2, 3]

Expected output 2:
[1, 2, 5, 3]

NOTE: Make your code dynamic that works for any given ArrayList of Integer

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

Test data 2:
[“abc”, “xyz”, “123”, “ab”, “abc”, “ABC”]

Expected output 2:
[“abc”, “xyz”, “123”, “ab”, “ABC”]

NOTE: Make your code dynamic that works for any given ArrayList of String
NOTE: Be careful about lowercase and uppercases, this method is case sensitive

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

Test data 2:
String str = “Java  is fun    ”;

Expected output 2:
Java is fun

NOTE: Make your code dynamic that works for any given String
NOTE: Be careful about empty String
NOTE: Be careful about before and after white spaces

     */

    public static String removeExtraSpaces(String str6){
        return str6 = str6.replaceAll("\\s+", " ").trim();
    }
    //-------------------------Task7----------------------
    /*
    Requirement:
Write a method add() that takes 2 int[] arrays as arguments and returns a new array with sum of given arrays elements.
Test data 1:
int[] arr1 = {3, 0, 0, 7, 5, 10};
int[] arr2 = {6, 3, 2};

Expected output 1:
[9, 3, 2, 7, 5, 10]

Test data 1:
int[] arr1 =  {10, 3, 6, 3, 2};
int[] arr2 = {6, 8, 3, 0, 0, 7, 5, 10, 34};

Expected output 1:
[16, 11, 9,  3, 2, 7, 5, 10, 34]

NOTE: Make your code dynamic that works for any given arrays
NOTE: You will assume that length of arrays are always more than zero
NOTE: Be careful about arrays length, if they were equal, it would be an easy task, but they can be different as given in the example above.


    public static int[] add(int[] arr1, int[] arr2){
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if()


            }

        }

    }
   */
    //-------------------------Task8----------------------
}
