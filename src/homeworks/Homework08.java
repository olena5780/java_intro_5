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
        String str4 = "Hi, my name is John Doe";
        System.out.println(count3OrLess(str4));

        System.out.println("\n-----------------------Task5------------------\n");
        String dateOfBirth = "01/19/1988";
        System.out.println(isDateFormatValid(dateOfBirth));

        System.out.println("\n-----------------------Task6------------------\n");
        String email = "abc@student.techglobal.com";
        System.out.println(validateEmailAddress(email));

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

    //System.out.println("\n-----------------------Task4------------------\n");
    public static int count3OrLess(String str4){
        String[] arr = str4.split("[A-Za-z]{4,}");
        Pattern pattern = Pattern.compile("[A-Za-z]{1,3}");
        Matcher matcher = pattern.matcher(Arrays.toString(arr));
        int counter = 0;
        while(matcher.find()){
            counter++;
        }
        return counter;
    }
    //System.out.println("\n-----------------------Task5------------------\n");
    public static boolean isDateFormatValid(String dateOfBirth) {
      return Pattern.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}", dateOfBirth );

    }
    //System.out.println("\n-----------------------Task6------------------\n");
    public static boolean validateEmailAddress(String email) {

        return (Pattern.matches("[\\w]{2,}[@][\\w]{2,}\\.[.\\w]{2,}", email));
    }

}
