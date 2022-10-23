package practice.methods;

import utilities.ScannerHelper;

import java.lang.reflect.Method;
import java.util.Locale;

public class MethodPractices {
    public static void main(String[] args) {
        System.out.println();
        printStringDesc("John");
        System.out.println();
        printStringDesc("");
        System.out.println();
        printStringDesc("JavaScript");
        System.out.println();
        printStringDesc("Scrpt");

        MethodPractices.printMiddle("toyota");
        MethodPractices.printMiddle("civic");
        MethodPractices.printMiddle("s" );

        MethodPractices.printIsFirstLastTwoSame("whatever");
        MethodPractices.printIsFirstLastTwoSame("xyxy");
        MethodPractices.printIsFirstLastTwoSame("x");



    }

    public static void printStringDesc(String str){
        /*
        is empty -> "Length is zero"
        else
            print the length
            print the first char
            print the last char
            check if it has vowels
         */

        // "JavaScript",  some action --> 't' index 9, length 10
        // "Java",  some action --> 'a' index 3, length 4

        if (str.isEmpty()){
            System.out.println("Length is zero");
        }else{
            System.out.println("Length is = " + str.length() +
                    "\nFirst char is = " + str.charAt(0) +
                    "\nLast char is = " + str.charAt(str.length() -1)//str.substring(str.length() -1)
            );

            // a, e, i, o, u, A, E, I, O, U
//            if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i")
//            || str.toLowerCase().contains("o") || str.toLowerCase().contains("u")){
//                System.out.println("This String has vowel");
//            }else{
//                System.out.println("This String doesn't have vowel");
//            }
            MethodPractices.printHasVowel(str);
        }
    }

    public static void printHasVowel(String str){
        // a, e, i, o, u, A, E, I, O, U
        if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i")
                || str.toLowerCase().contains("o") || str.toLowerCase().contains("u")){
            System.out.println("This String has vowel");
        }else{
            System.out.println("This String doesn't have vowel");
        }
    }

    public static void printMiddle(String str){


        if(str.length() < 3){
            System.out.println("Length is less than tree");
        }
        else{
           // conditon ? option if its true : option 2 if its false
            System.out.println(str.length() % 2 == 0 ?
                    str.substring(str.length() / 2 - 1, str.length() / 2 + 1) :
                    str.charAt(str.length() / 2));
        }
    }



    public static void printFirstLastMiddle(String input) {
        if (input.length() < 4) {
            System.out.println("INVALID INPUT");
        } else {
            /*
            First 2 characters are = Ja
            Last 2 characters are = va
            The other characters are =
             */
            System.out.println(
                    "First 2 characters are = " + input.substring(0, 2) +
                            "\nLast 2 characters are = " + input.substring(input.length() - 2) +
                            "\nThe other characters are = " + input.substring(2, input.length() - 2)
            );
        }
    }

    public static void printIsFirstLastTwoSame(String word){
//        if (word.length() < 2){
//            System.out.println("Length is less than 2");
//        }else{
//            System.out.println(word.substring(0, 2).equals(word.substring(word.length() - 2)));
//        }
        // condition ? option if its true : option 2 if its false
        System.out.println(
                word.length() < 2 ?
                        "Length is less than 2" :
                        word.substring(0, 2).equals(word.substring(word.length() - 2))
        );

    }
}





