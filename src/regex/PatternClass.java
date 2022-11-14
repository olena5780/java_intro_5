package regex;

import utilities.ScannerHelper;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z0-9]{5,10}");

        System.out.println(pattern); // return pattern[a-z0-9]{5,10}
        System.out.println(pattern.pattern()); // return pattern as aString [a-z0-9]{5,10}
        System.out.println(pattern.toString());// return pattern as aString [a-z0-9]{5,10}

        System.out.println(Pattern.matches(pattern.toString(), "Apple")); // false
        System.out.println(Pattern.matches(pattern.pattern(), "hello word")); // false


        System.out.println("\n-------------Task1-----------\n");
        /*
                    Ask the user to enter a username.

            If the username matches the format of [a-zA-Z0-9]{5,10}, print out “Valid Username”.

            If it does not match the desired format then print out “Error! Username must be 5 to 10 characters long and can only contain letters and numbers”

            Scenario 1:
            Program: Please enter a username
            User: JDoe123
            Program: Valid Username

            Scenario 2:
            Program: Please enter a username
            User: John Doe
            Program: Error! Username must be 5 to 10 characters long and can only contain letters and numbers

                     */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a username");

        pattern = Pattern.compile("[a-zA-Z0-9]{5,10}");
        String userName = input.nextLine();


        if(Pattern.matches(pattern.pattern(), userName))
            System.out.println("Valid Username");
        else System.out.println("Error! Username must be 5 to 10 characters long and can only contain" +
                "letters and numbers");





    }
}
