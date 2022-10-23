package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {
        System.out.println("\n-----------Task1---------\n");

        String str = ScannerHelper.getAString();

        if (str.length() < 8) System.out.println("This String does not have 8 characters");
        else System.out.println(str.substring(str.length() - 4) + str.substring(4, str.length() - 4) +
                str.substring(0, 4));

        System.out.println("\n-----------Task2---------\n");

        String sentence = ScannerHelper.getAString();

        if (!sentence.contains(" ")) {
            System.out.println("This sentence does not have 2 or more words to swap");

        } else {
            String firstW = sentence.substring(0, sentence.indexOf(" "));
            String lastW = sentence.substring(sentence.lastIndexOf(" ") + 1);
            String middle = sentence.substring(sentence.indexOf(" ") + 1, sentence.lastIndexOf(" "));

            System.out.println(lastW + " " + middle + " " + firstW);
        }

        System.out.println("\n-----------Task3---------\n");

        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        System.out.println(str1.replace("stupid", "nice"));
        System.out.println(str2.replace("idiot", "nice"));
        System.out.println(str3.replace("stupid", "nice").replace("idiot", "nice"));

        System.out.println("\n-----------Task4---------\n");

        String name = ScannerHelper.getAName();

        if (name.length() >= 2) {
            if (name.length() % 2 == 0)
                System.out.println(name.substring(name.length() / 2 - 1, name.length() / 2 + 1));
            else System.out.println(name.substring(name.length() / 2, name.length() / 2 + 1));
        } else System.out.println("Invalid input!!!");

        System.out.println("\n-----------Task5---------\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a country");
        String country = input.nextLine();

        if (country.length() >= 5) System.out.println(country.substring(2, country.length() - 2));
        else System.out.println("Invalid input");

        System.out.println("\n-----------Task6---------\n");
         /*
                 TASK-6
        Write a program that asks user to enter their full address.
        Replace all letter ‘a’ or ‘A’ with ‘*’
        Replace all letter ‘e’ or ‘E’ with ‘#’
        Replace all letter ‘i’ or ‘I’ with ‘+’
        Replace all letter ‘u’ or ‘U’ with ‘$’
        Replace all letter ‘o’ or ‘O’ with ‘@’
        Then, print result after replacements
          */
        String address = ScannerHelper.getAnAddress();

        address = address.replace('a', '*').replace('A', '*').
                replace('e', '#').replace('E', '#').
                replace('i', '+').replace('I', '+').
                replace('u', '$').replace('U', '$').
                replace('o', '@').replace('O', '@');
        System.out.println(address);

        System.out.println("\n-----------Task7---------\n");
        /*
                TASK-7
        Write a program that generates 2 random numbers between 0 and 25 (0 and 25 are included), Then print all numbers between 2 random numbers that cannot be divided by 5 in ascending order.

        Test data:
        int randomNumber1 = 12;
        int randomNumber1 = 4;
        Expected output:
        4 – 6 – 7 – 8 – 9 – 11 – 12
         */

        int random1 = RandomNumberGenerator.getARandomNumber(0, 25);
        int random2 = RandomNumberGenerator.getARandomNumber(0, 25);
        System.out.println(random1);
        System.out.println(random2);

        String result = "";
        for (int i = Math.min(random1, random2); i <= Math.max(random1, random2); i++) {
            if (i % 5 != 0)
                result += i + " - ";
        }
        System.out.println(result.substring(0, result.length() - 3));

        System.out.println("\n-----------Task8---------\n");
                    /*
                    TASK-8
            Write a program that asks user to enter a sentence as a String, and count how many words that sentence has, and print it with given below message.
            NOTE: Write a program that handles any String
            NOTE: First check if the given sentence has 2 words at least. If not, then just print “This sentence does not have multiple words”.

            Test data 1:
            Java is fun

            Expected output 1:
            This sentence has 3 words.


            Test data 2:
            Hello World

            Expected output 2:
            This sentence has 2 words.


            Test data 3:
            Hi

            Expected output 3:
            This sentence does not have multiple words.


                     */
        int space = 0;

        String s = ScannerHelper.getAString();

        System.out.println("\n-----------Task10--------\n");
        String rev ="";
        String c = "";
        ScannerHelper.getAString();

        if(c.length() == 0) System.out.println("This word does not have 1 or more characters");

        for (int i = c.length() -1; i >= 0 ; i--) {
            rev += c.charAt(i); //reverse String
        }
        if(c.equals(rev)) System.out.println("This word is palindrome");
        else System.out.println("This word is not palindrome");

        System.out.println("\n-----------Task11--------\n");





    }

}