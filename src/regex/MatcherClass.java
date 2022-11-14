package regex;

import utilities.ScannerHelper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {
    public static void main(String[] args) {

        System.out.println("\n-------------Task1-----------\n");

        Pattern pattern = Pattern.compile("[A-Za-z]{2,}");
        Matcher matcher = pattern.matcher("hello");
        System.out.println(matcher.matches()); // true

/*
        pattern = Pattern.compile("SDET");
        System.out.println(matcher.matches()); // false

        System.out.println(matcher.find());
        System.out.println(matcher.group());
        System.out.println("Starting index " + matcher.start());
        System.out.println("Ending index " + matcher.end());

 */

        System.out.println("\n-------------Task2-----------\n");

        String sen = ScannerHelper.getAString();

        pattern = Pattern.compile("[A-Za-z]{1,}");
        matcher = pattern.matcher(sen);
        int wordCounter = 0;


        while(matcher.find()) {
            System.out.println(matcher.group());
            wordCounter++;
        }
        System.out.println("This sentence contains " + wordCounter+ " words\n");

        Pattern.matches("[A-Za-z0-9_-]{9,15}", "Tech_Global"); // true




    }
}
