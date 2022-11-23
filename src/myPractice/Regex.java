package myPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Regex {
    public static void main(String[] args) {
        String s = "a1B2C3";
        // [a, B, C]
        // [1, 2, 3]
        String letter = s.replaceAll("[0-9]", "");//aBC
        String number = s.replaceAll("[A-Za-z]", "");//123

        // converting String to Array
        String[] l = {letter};
        String[] n = {number};

        //Printing Array
        System.out.println(Arrays.toString(l)); // [aBC]
        System.out.println(Arrays.toString(n)); // [123]

        //Converting array toCharArray and printing with the help of array.toString
        System.out.println(Arrays.toString(letter.toCharArray()));//[a, B, C]
        System.out.println(Arrays.toString(number.toCharArray())); //[1, 2, 3]



    }
}
