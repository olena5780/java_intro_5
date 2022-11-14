package homeworks;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("\n-----------------------Task1------------------\n");
        String str = "JAVA";
        System.out.println(countConsonants(str));

        System.out.println("\n-----------------------Task2------------------\n");
        String str1 = "java  is    fun";
        System.out.println(Arrays.toString(wordArray(str1)));

        System.out.println("\n-----------------------Task3------------------\n");
        String s = "java  is    fun";
        System.out.println(removeExtraSpaces(s));

        System.out.println("\n-----------------------Task4------------------\n");
        String x = "Hi, my name is John Doe";
       // System.out.println(count3OrLess(x));

        System.out.println("\n-----------------------Task5------------------\n");
        System.out.println("\n-----------------------Task6------------------\n");
        System.out.println("\n-----------------------Task7------------------\n");
        System.out.println("\n-----------------------Task8------------------\n");
    }

    // System.out.println("\n-----------------------Task1------------------\n");
        public static int countConsonants(String str){

           int countConsonants = str.replaceAll("[auioeAUIOE]", "").trim().length();

           return countConsonants;

        }

    // System.out.println("\n-----------------------Task2------------------\n");
    public static String[]wordArray(String str1){

       str1 =  str1.replaceAll("\\s+", " ").trim();
       String[] wordArray = str1.split(" ");
       return wordArray;


    }
    // System.out.println("\n-----------------------Task3------------------\n");

    public static String removeExtraSpaces(String s){

       String removeExtraSpaces = s.replaceAll("\\s+", " ").trim();

       return removeExtraSpaces;
    }

    /*
    Requirement:
Write a method named count3OrLess() that asks the user to enter a sentence. Return a count of how many words are 3 characters long or less.
NOTE: You must use regex

Example program1:
String str = “I go to TechGlobal”;
Program: 3

Example program2:
String str = “Hi, my name is John Doe”;
Program: 4

Example program2:
String str = “Hello guys”;
Program: 0

     */
    /* System.out.println("\n-----------------------Task4------------------\n");
    public static int count3OrLess(String x){
        String sen = ScannerHelper.getAString();

        Pattern pattern = Pattern.compile("[^A-Za-z0-9]{1,3}");
        Matcher matcher = pattern.matcher(sen);
        int count3OrLess = 0;




    }

     */

}
