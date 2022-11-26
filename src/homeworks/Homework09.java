package homeworks;

import com.sun.corba.se.impl.encoding.CDROutputObject;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework09 {
    public static void main(String[] args) {
        System.out.println("\n------------------Task1--------------\n");

        int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};

        ArrayList<Integer> numberList = new ArrayList<>();
        for (int number : numbers) {
        if(numberList.contains(number)){
            System.out.println(number);
            break;
        }
        else numberList.add(number);
        }

       /*
        boolean isDuplicate = false;
        int firstDuplicate = 0;

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && !isDuplicate) {
                    firstDuplicate = numbers[i];
                    isDuplicate = true;
                    break;
                }
            }
        }
        if(isDuplicate) System.out.println(firstDuplicate);
        else System.out.println("There is no duplicates");

        */


        System.out.println("\n------------------Task2--------------\n");

        String[] words = {"Z", "abc", "z", "123", "#"};

        boolean isDup = false;
        String firstDup = "";
        for (int i = 0; i < words.length-1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if(words[i].equalsIgnoreCase(words[j]) && !isDup) {
                    firstDup = words[i];
                    isDup = true;
                    break;
                }
            }
        }
        if(isDup) System.out.println(firstDup);
        else System.out.println("There is no duplicates");


        System.out.println("\n------------------Task3--------------\n");

        int[] n = {0, -4, -7, 0, 5, 10, 45, -7, 0};

        ArrayList<Integer> dup = new ArrayList<>();
        for (int i = 0; i < n.length-1; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if(n[i] == n[j] && !dup.contains(n[i])) {
                    dup.add(n[i]);

                }
            }
        }
        if(dup.isEmpty()) System.out.println("There is no duplicates");
        else dup.forEach(System.out::println);



        System.out.println("\n------------------Task4--------------\n");

        String[] words4 = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};

       /* String d = "";
        ArrayList<String> container =new ArrayList<>();
        for (String s : container) {
            if(!container.contains(toUpperCase()) || !container.contains())

        }

        */
        ArrayList<String> d = new ArrayList<>();
        for (int i = 0; i < words4.length - 1 ; i++) {
            for (int j = i + 1; j< words4.length; j++) {
                if (words4[i].equalsIgnoreCase(words4[j]) && !d.contains(words4[i].toLowerCase())) {
                   d.add(words4[i].toLowerCase());
                   System.out.println(words4[i]);
                }
            }
        }
        if(d.isEmpty()) System.out.println("There is no duplicates");


        System.out.println("\n------------------Task5--------------\n");

        String[] words1 = {"abc", "foo", "bar"};

       ArrayList<String> rev = new ArrayList<>();
        for (int i = words1.length-1; i >= 0; i--) {
            rev.add(words1[i]);
        }
        System.out.println(rev);

        /*
        Collections.reverse(Arrays.asList(words1));
        System.out.println(Arrays.toString(words1));
         */

        System.out.println("\n------------------Task6--------------\n");

        String str = "Java is fun";
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(str.split(" ")));
        System.out.println(arr);
        String reverse = "";
        for (String s : arr) {
            StringBuilder sb = new StringBuilder(s);
           reverse += sb.reverse() + " ";

        }
        System.out.println(reverse.trim()); //(reverse.substring(0, reverse.length() -1));

    }
}