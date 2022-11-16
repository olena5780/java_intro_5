package projects;

import utilities.ScannerHelper;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Project06 {
    public static void main(String[] args) {
        System.out.println("\n=======================Task1======================\n");
        String[] arr = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
        System.out.println(countMultipleWords(arr));

        System.out.println("\n=======================Task2======================\n");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        System.out.println(removeNegatives(numbers));

        System.out.println("\n=======================Task3======================\n");
        String password = "Abcd123!";
        System.out.println(validatePassword(password));


        System.out.println("\n=======================Task4======================\n");
        String email = "olena578@gmail.com";
        System.out.println(validateEmailAddress(email));

    }

    //=======================Task1======================
    public static int countMultipleWords(String[] arr) {
        /*
        int counter = 0;
        for (String s : arr) {
            if (s.trim().contains(" ")) counter++;
        }
        return counter;
         */
        int counter = 0;
        for(int i = 0; i > arr.length; i++){

            String word = arr[i].trim();
            if(Pattern.matches("[\\w]]+ [\\w]+", word)) counter++;
        }
      return counter;
    }

    //=======================Task2======================
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers) {
   // for(int i = 0; i < numbers.size(); i++){

       Iterator<Integer> numbersIterator = numbers.iterator();
        while (numbersIterator.hasNext()) {
            Integer num = numbersIterator.next();
            if (num < 0) numbersIterator.remove();
        }
        return numbers;
    }

    //=======================Task3======================

    public static boolean validatePassword(String password) {

        return (Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[\\d])(?=.*[@#%&*!+_])[\\S]{8,16}", password));

    }
    /*
    public static boolean validatePassword1(String password){
    int upperCase = 0;
    int lowerCase = 0;
    int digit = 0;
    int whiteSpase = 0;
    int spacialChar=0;

    for (int i = 0; i < password.length(); i++){
        if (password.length() >= 8 && password.length() <= 16) {
            if (Character.isUpperCase(password.charAt(i))) upperCase++;
            if (Character.isLowerCase(password.charAt(i))) lowerCase++;
            if (Character.isDigit(password.charAt(i))) digit++;
            if (Character.isWhitespace(password.charAt(i))) whiteSpase++;
            if (!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i))
                    && !Character.isWhitespace(password.charAt(i))) spacialChar++;
        }

    }
     */

    //=======================Task4======================
    public static boolean validateEmailAddress(String email) {

        return (Pattern.matches("[\\w]{2,}[@][\\w]{2,}\\.[\\w]{2,}", email));
    }

}
