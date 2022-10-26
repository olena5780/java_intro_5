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

        String address = ScannerHelper.getAnAddress();

        address = address.replace('a', '*').replace('A', '*').
                replace('e', '#').replace('E', '#').
                replace('i', '+').replace('I', '+').
                replace('u', '$').replace('U', '$').
                replace('o', '@').replace('O', '@');

        System.out.println(address);

        System.out.println("\n-----------Task7---------\n");

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


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sen = scan.nextLine();

        if (sen.contains(" ")) {
            int space = 1;
            for (int i = 0; i < sen.length(); i++) {
                char c = sen.charAt(i);
                if (Character.isWhitespace(c)) {
                    space++;
                }
            }
            System.out.println("This sentence has " + space + " words.");
        } else {
            System.out.println("This sentence does not have multiple words");
        }


        System.out.println("\n-----------Task9--------\n");

        int r = ScannerHelper.getANumber();

        for (int i = 1; i <= r; i++) {
            if (i % 6 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
        }


        System.out.println("\n-----------Task10--------\n");

        String x = ScannerHelper.getAString();
        String rev = "";
        if (x.length() == 0){System.out.println("This word does not have 1 or more characters");
        }else {
            for (int i = x.length() - 1; i >= 0; i--) {
                rev += x.charAt(i); //reverse String
            }

            if (x.equals(rev)) System.out.println("This word is palindrome");
            else System.out.println("This word is not palindrome");
        }

                System.out.println("\n-----------Task11--------\n");

        int countA = 0;
        String z = ScannerHelper.getAString();
       if(z.length() == 0){System.out.println("This sentence does not have any characters.");
       }else {
           for (int i = 0; i < z.length(); i++) {
               if (z.charAt(i) == 'a' || z.charAt(i) == 'A')
                   countA++;
           }

           System.out.println("This sentence has " + countA + " a or A letters.");
       }

    }
}
