package regex;

import jdk.nashorn.internal.parser.DateParser;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Exercises {
    public static void main(String[] args) {

        System.out.println("\n=================Task1=================\n");
        System.out.println(Pattern.matches("[A-Za-z0-9_-]{8,15}", "JohnDoe_123")); //true

        System.out.println("\n=================Task2=================\n");

        System.out.println(Pattern.matches("[A-Za-z0-9_\\-]{1,}","JavaFun123"));
        System.out.println(Pattern.matches("[\\w\\- ]{8,15}","JavaFun123")); //true

        System.out.println(Pattern.matches("[\\d]{8,15}","asdfghjkl;")); //true
        System.out.println(Pattern.matches("[0-9]{8,15}","asdfghjkl;")); //true

        System.out.println("\n=================Task3=================\n");

        System.out.println(Pattern.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}","000-00-0000"));//true

        System.out.println(Pattern.matches("\\([\\d]{3}\\)-[\\d]{3}-[\\d]{4}","(000)-000-0000")); //true
        System.out.println(Pattern.matches("\\([\\d]{3}\\)-[\\d]{3}-[\\d]{4}","000-000-0000")); //true

        String str = " abc 123 $#^ ";

        System.out.println("\n=================Task4=================\n");

        System.out.println(str.replaceAll("[ $#^]","")); // works but not dynamic
        System.out.println(str.replaceAll("[\\W]","")); // works , but _ still will be there
        System.out.println(str.replaceAll("[\\W_]","")); // works
        System.out.println(str.replaceAll("[^a-zA-Z0-9]","")); // works

        System.out.println(Pattern.matches("[a-zA-Z0-9_-][@][a-zA-Z]\\.[a-zA-Z]", "olena578@gmail.com"));

        System.out.println("\n=================Task5=================\n");

        System.out.println(Pattern.matches("[A-Za-z]{3,} [A-Za-z]{3,}","Joe Doe"));
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{2,} [A-Z]{1}[a-z]{2,}","Joe Doe"));
        /*
Assume you are given a String that contains Letters and numbers
Using REGEX, print out 2 Arrays, one with the letters of the string and 1 with
the numbers
TestData1:
String str = “A1b2C#”;
Program:
[A, b, C]
[1, 2, 3]
TestData2:
String str = “%ABC123#”;
Program:
[A, B, C]
[1, 2, 3]
TestData3:
String str = “abc”;
Program:
[a, b, c]
         */
        String str1 = "A1b2C3";

        System.out.println(Arrays.toString(str1.replaceAll("[^A-Za-z]", "").toCharArray()));//AbC
        System.out.println(Arrays.toString(str1.replaceAll("[\\D]", "").split(""))); //A123



    }
}
