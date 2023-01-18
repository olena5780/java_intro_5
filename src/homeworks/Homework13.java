package homeworks;

import practice.arrayListPactices.ArrayListPractices;
import sun.plugin.javascript.navig.Array;

import java.util.*;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("\n---------------Task1------------");
        System.out.println(hasLowercase(""));
        System.out.println(hasLowercase("JAVA"));
        System.out.println(hasLowercase("125$"));
        System.out.println(hasLowercase("hello"));

        System.out.println("\n---------------Task2------------");
        ArrayList<Integer>numbers =  new ArrayList<>(Arrays.asList(0, 10, 15));
        System.out.println(noZero(numbers));
        System.out.println(noZero(new ArrayList<>(Arrays.asList())));
        System.out.println(noZero(new ArrayList<>(Arrays.asList(0, 0, 0))));
        System.out.println(noZero(new ArrayList<>(Arrays.asList(1, 1, 10))));

        System.out.println("\n---------------Task3------------");
        int[] arr3a = {1, 2, 3};
        System.out.println(Arrays.deepToString(numberAndSquare(arr3a)));
        int[] arr3b = {0, 3, 6};
        System.out.println(Arrays.deepToString(numberAndSquare(arr3b)));
        int[] arr3c = {1, 4};
        System.out.println(Arrays.deepToString(numberAndSquare(arr3c)));

        System.out.println("\n---------------Task4------------");
        System.out.println(containsValue(new String[]{"abc", "foo", "java"}, "Java"));
        System.out.println(containsValue(new String[]{"abc", "foo", "Java"}, "Java"));
        System.out.println(containsValue(new String[]{"abc", "foo", "ava"}, "Java"));

        System.out.println("\n---------------Task5------------");
        System.out.println(reverseSentence(""));
        System.out.println(reverseSentence("Hello"));
        System.out.println(reverseSentence("This is a sentence"));//Didn't do First word upper case

        System.out.println("\n---------------Task6------------");
        System.out.println(removeStringSpecialsDigits("123Java #$%is fun"));
        System.out.println(removeStringSpecialsDigits("Selenium"));
        System.out.println(removeStringSpecialsDigits("Selenium 123#$%Cypress"));


        System.out.println("\n---------------Task7------------");
        String[]arr7 ={"Selen ium", "123$%", "###"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(arr7)));

        System.out.println("\n---------------Task8------------");
        System.out.println(removeAndReturnCommons
                (new ArrayList<>(Arrays.asList("Java", "is", "fun")), new ArrayList<>(Arrays.asList("Java", "Java", "C#", "Python"))));


        System.out.println("\n---------------Task9------------");
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("abc", "xx", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("aXx", "123", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList(""))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("xxx", "XXX", "xXx"))));



    }
    //---------------Task1------------
/*
Requirement:
-Create a method called hasLowerCase()
-This method will take a String argument,
and it will return boolean true if there is lowercase letter and false if it doesn’t.

 */



    public static boolean hasLowercase(String str1) {
      /*
    if(str1.length() == 0) return false;
      for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if(!Character.isLowerCase(c))
                return false;
        }
        return true;

    }
       */
        return str1.replaceAll("[^a-z]", "").length() != 0;
    }

    /*
      //////////////////////TASK1
    public static boolean hasLowerCase(String str){
        return !str.replaceAll("[^a-z]", "").isEmpty();
    }
     */



    //---------------Task2------------
    /*
    Requirement:
-Create a method called noZero()
-This method will take one Integer ArrayList argument and it will return an ArrayList with all zeros removed from the original Integer ArrayList.
NOTE: Assume that ArrayList size will be at least 1.

     */
    public static ArrayList<Integer>noZero(ArrayList<Integer>numbers){
        numbers.removeIf(x -> x.equals(Integer.parseInt("0")));
        return numbers;

    }
    /*
      //////////////////////TASK2
    public static ArrayList<Integer> noZero(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                arr.remove(i);
                i--;
            }

        }
        return  arr;
    }
     */
    //---------------Task3------------
    /*
    Requirement:
-Create a method called numberAndSquare()
-This method will take an int array argument and it will return a multidimensional array with all numbers squared.
NOTE: Assume that array size is at least 1.

     */

    public static int[][]numberAndSquare(int[] arr3){
        int[][] n = new int[arr3.length][2];
        for (int i = 0; i < arr3.length; i++) {
           n[i][0]= arr3[i];
           n[i][1]= arr3[i] * arr3[i];

        }
        return n;
    }


    //---------------Task4------------
    /*
    Requirement:
-Create a method called containsValue()
-This method will take a String array and a String argument, and it will return a boolean. Search the variable inside of the array and return true if it exists in the array. If it doesn’t exist, return false.
NOTE: Assume that array size is at least 1.
NOTE: The method is case-sensitive

Hint: Use binarySearch() for easy solution

     */

    public static boolean containsValue(String[]array, String argument){
        for (String s : array) {
            if (s.equals(argument)) return true;
        }
         return false;
    }
    /*
        //////////////////////TASK3
    public static int[][] numberAndSquare(int[] arr){
        int[][] arr2D = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            arr2D[i][0] = arr[i];
            arr2D[i][1] = arr[i] * arr[i];
        }
        return arr2D;
    }
     */
    /*
       //////////////////////TASK4
    public static boolean containsValue(String str, String[] arr){
        return Arrays.asList(arr).contains(str);
    }
     */

    //---------------Task5------------
    /*
    Requirement:
-Create a method called reverseSentence()
-This method will take a String argument and it will return a String with changing the place of every word. All words should be in reverse order. Make sure that there are two words inside the sentence at least. If there is no two words return “There is not enough words!”.
NOTE: After you reverse, only first letter must be uppercase and the rest will be lowercase!
Hint: Use split() for easy solution
Note: Make the new first word’s first letter upper case and make the old first word’s first letter lower case

     */
    public static String reverseSentence(String str){
        String reversedSent = "";
        String[] arr = str.toLowerCase().split(" ");
        if(arr.length < 2) return "There is not enough words!";
        for (int i = arr.length-1; i >= 0; i--) {
            reversedSent += arr[i] + " ";
        }
        return reversedSent.substring(0,1).toUpperCase() + reversedSent.substring(1, reversedSent.length()-1);
    }
    /*
      //////////////////////TASK5
    public static String reverseSentence(String str){
        String reversedSent = "";
        String[] arr = str.toLowerCase().split(" ");
        if(arr.length < 2) return "There is not enough words!";
        for (int i = arr.length-1; i >= 0; i--) {
            reversedSent += arr[i] + " ";
        }
        return reversedSent.substring(0,1).toUpperCase() + reversedSent.substring(1, reversedSent.length()-1);
    }
     */


    //---------------Task6------------
    /*
    Requirement:
-Create a method called removeStringSpecialsDigits()
-This method will take a String as argument, and it will return a String without the special characters or digits.
NOTE: Assume that String length is at least 1.
NOTE: Do not remove spaces.

     */
    public static String removeStringSpecialsDigits(String str6){
        return str6.replaceAll("[^ A-Za-z]", "");

    }
    /*
        //////////////////////TASK6
    public static String removeStringSpecialsDigits(String str){
        return str.replaceAll("[^a-zA-Z ]", "");
    }


     */

    //---------------Task7------------
    /*
    Requirement:
-Create a method called removeArraySpecialsDigits()
-This method will take a String array as argument, and it will return a String array without the special characters or digits from the elements.
NOTE: Assume that array size is at least 1.

Test Data 1: [“123Java”, “#$%is”, “fun”]
Expected Result 1: [“Java”, “is”, “fun”]

     */
    public static String[]removeArraySpecialsDigits(String[]arr7){
        /*String[] answer = new String [arr7.length];

        for (int i = 0; i < arr7.length; i++) {
            String str = "";
            for (int j = 0; j < arr7[i].length(); j++) {
                if(Character.isLetter(arr7[i].charAt(j)) || Character.isWhitespace(arr7[i].charAt(j)))
                    str += arr7[i].charAt(j);
            }
            answer[i] = str;
        }
        return answer;


    }

         */
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr7) {
            s = s.replaceAll("[^A-Za-z]", "");
            list.add(s);
        }
        return list.toArray(new String[0]);
    }
    /*
        //////////////////////TASK7
    public static ArrayList<String> removeArraySpecialsDigits(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i).replaceAll("[^a-zA-Z]", ""));
        }
        return arr;
    }
     */


    //---------------Task8------------
    /*

    Requirement:
-Create a method called removeAndReturnCommons()
-This method will take two String ArrayList and it will return all the common words as String ArrayList.
NOTE: Assume that both ArrayList sizes are at least 1.

Test Data 1: [“Java”, “is”, “fun”], [“abc”, “xyz”, “123”]
Expected Result 1: []

 */
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : list1) {
                for (String c : list2) {
                    if (s.equals(c) && !list.contains(s))
                        list.add(c);
                }
            }

            return list;
        }
        /*

        //////////////////////TASK8
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> arr1, ArrayList<String> arr2){
        ArrayList<String> newArr = new ArrayList<>();
        for (String s1 : arr1) {
            for (String s2 : arr2) {
                if(s1.equals(s2) && !newArr.contains(s1)) {
                    newArr.add(s1);
                    break;
                }
            }
        }
        return newArr;
    }
         */


    //---------------Task9------------
    /*

   Requirement:
-Create a method called noXInVariables()
-This method will take an ArrayList argument, and it will return an ArrayList with all the x or X removed from elements.
If the element itself equals to x or X or contains only x letters, then remove that element.
NOTE: Assume that ArrayList size is at least 1.

Test Data 1: [abc, 123, #$%]
Expected Result 1: [abc, 123, #$%]

     */

    public static ArrayList<String>noXInVariables(ArrayList<String>arg9){
        /*
        ArrayList<String> newArg = new ArrayList<>();

        for (String s : arg9) {
            if(s.toLowerCase().contains("x"))
             s = s.replaceAll("x", "");
            newArg.add(s);
        }
        return newArg;

         */
        Iterator<String> itr = arg9.iterator();
        while(itr.hasNext()){
            String s = itr.next();
            if(s.toLowerCase().contains("x"))itr.remove();
        }
       return arg9;

    }
    /*
       //////////////////////TASK9
    public static ArrayList<String> noXInVariables(ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).replaceAll("[xX]", "").equals("")){
                arr.remove(i);
                i--;
            } else arr.set(i, arr.get(i).replaceAll("[xX]",""));
        }
        return arr;
    }
     */

}