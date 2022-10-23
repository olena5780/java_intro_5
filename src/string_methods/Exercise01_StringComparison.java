package string_methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise01_StringComparison {
    public static void main(String[] args) {
        /*
Write a Java program that asks user to enter 2 strings
And store answers of user in different String variables
Finally, check if given 2 Strings are equal or not and print messages given below

Test data 1:
Java is fun
Hello World

Expected output 1:
These strings are not equal

Test data 2:
Hello
Hello

Expected output 2:
These strings are equal
 */



        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 Strings: ");
        String s1 = input.nextLine();
        String s2 = input.nextLine();

        System.out.println("These strings are not equal");

        System.out.println(s1.equals(s2));

        System.out.println("Please enter 2 Strings: ");
        String s3 = input.nextLine();
        String s4 = input.nextLine();

        System.out.println(s3.equals(s4));

        System.out.println("These strings are equal");
        */

        String s1 = ScannerHelper.getAString();
        String s2 = ScannerHelper.getAString();

        if(s1.equals(s2)) System.out.println("These strings are equal");
        else System.out.println("These strings are  not equal");


    }
}
