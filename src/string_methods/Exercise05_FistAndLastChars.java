package string_methods;

import utilities.ScannerHelper;

public class Exercise05_FistAndLastChars {
    public static void main(String[] args) {


        String name = ScannerHelper.getAString();

        char fChar = name.charAt(0);
        System.out.println(fChar);

        char lChar = name.charAt(name.length() - 1);

        System.out.println("First character in the name " + fChar);
        System.out.println("Last Character in the name is " + lChar);
    }

}
