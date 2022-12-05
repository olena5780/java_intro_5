package homeworks;
import java.util.ArrayList;
import java.util.Arrays;

public class Homework11 {
    public static void main(String[] args) {
        System.out.println("\n------------Task1-------------");
        String str1 = " Hello World   ";
        System.out.println(noSpace(str1));
        System.out.println("\n------------Task2-------------");
        String str2 = "Tech Global";
        System.out.println(replaceFirstLast(str2));
        System.out.println("\n------------Task3-------------");
        String str3 = "ABC";
        System.out.println(hasVowel(str3));
        System.out.println("\n------------Task4-------------");
        int dateOfBirth = 2006;
        checkAge(dateOfBirth);
        System.out.println("\n------------Task5-------------");
        int n1 = 10, n2 = 13, n3 = 20;
        System.out.println(averageOfEdges(n1, n2, n3));
        System.out.println("\n------------Task6-------------");
        String[] str6 = {"appium", "123", "ABC", "java"};
        System.out.println(Arrays.toString(noA(str6)));
        System.out.println("\n------------Task7-------------");
        int[] arr7 = {3, 4, 5, 6};
        System.out.println(Arrays.toString(no3or5(arr7)));

        System.out.println("\n------------Task8-------------");
        int [] arr8 = {41, 53, 19, 47, 67};
        System.out.println(countPrimes(arr8));

    }

    /*
    Requirement:
-Create a method called noSpace()
-This method will take one String argument and it will return a new String with all spaces removed from the original String

Test Data 4: “ Hello World   ”
Expected Result 4: “HelloWorld”

     */

    //////////////////////Task1////////////////////

    public static String noSpace(String str1){
        String newStr = "";
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != ' ')
                newStr += str1.charAt(i);

        }
            return newStr;
    }

    /*
    Requirement:
-Create a method called replaceFirstLast()
-This method will take one String argument and it will return a new String with first and last characters replaced

NOTE: if the length is less than 2, then return empty String
NOTE: Ignore all before and after spaces (get actual String only)

Test Data 5: “Tech Global”
Expected Result 5: “lech GlobaT”

     */
    //////////////////////Task2////////////////////

    public static String replaceFirstLast(String str2){
        String middle = str2.substring(1, str2.length()-1);
        if(str2.length()<= 1) return "";
        else if (str2.length()== 2) return str2.substring(str2.length()-1) +  str2.substring(0, 1);
        else return str2.substring(str2.length()-1) + middle  + str2.substring(0, 1);
    }

/*    -Create a method called hasVowel()
-This method will take one String argument and it will return a boolean checking if String has any vowel or not
    Test Data 4: “ABC”
    Expected Result 4: true
 */
    //////////////////////Task3////////////////////
    public static boolean hasVowel(String str3){

        boolean vowel = false;
        for (int i = 0; i < str3.length(); i++) {
            if(str3.charAt(i) == 'a'|| str3.charAt(i) == 'e' ||
                    str3.charAt(i) == 'o' || str3.charAt(i) == 'i' ||
                    str3.charAt(i) == 'A'|| str3.charAt(i) == 'E' ||
                    str3.charAt(i) == 'O' || str3.charAt(i) == 'I')
                vowel = true;


        }
        return vowel;
    }

    /*
    Requirement:
-Create a method called checkAge()
-This method will take an int yearOfBirth as  argument and it will print message below based on the entry
If the age is less than 16, then print “AGE IS NOT ALLOWED”
If the age is 16 or more, then print “AGE IS ALLOWED”
If the age is more than 100 or a future year entered, print “AGE IS NOT VALID”
NOTE: Calculate the age taking base year as current year in a dynamic way. You can use Date class.

Test Data 2: 2006
Expected Result 2: AGE IS ALLOWED


     */
    //////////////////////Task4////////////////////
    public static void checkAge(int yearOfBirth){

        int currentYear = 2022;
        int age =  currentYear - yearOfBirth;
        if( age >= 0 && age < 16 ) System.out.println("AGE IS NOT ALLOWED");
        else if(age >= 16 && age <= 100) System.out.println("AGE IS ALLOWED");
        else System.out.println("AGE IS NOT VALID");

    }

    /*
    Requirement:
-Create a method called averageOfEdges()
-This method will take three int arguments and it will return average of min and max numbers

Test Data 4: 10, 13, 20
Expected Result 4: 15

     */
     //////////////////////Task5////////////////////
    public static int averageOfEdges(int n1, int n2, int n3){

        int max = Math.max(Math.max(n1, n2), n3);
        int min = Math.min(Math.min(n1, n2), n3);

        return (min + max) / 2;

    }
    /*
    Requirement:
-Create a method called noA()
-This method will take a String array argument and it will return a new array with all elements starting with A or a replaced with “###”
NOTE: Assume length will always be more than zero
NOTE: Ignore cases

Test Data 2: [“appium”, “123”, “ABC”, “java”]
Expected Result 2: [“###”, “123”, “###”, “java”]


     */
    //////////////////////Task6////////////////////
    public static String[] noA(String[] str6){

        for (int i= 0; i< str6.length; i++) {
            if(str6[i].toLowerCase().startsWith("a"))
           str6[i]= "###";

        }
     return str6;
    }

    /*
 -Create a method called no3or5()
-This method will take an int array argument and it will return a new array with some elements replaced as below
    If element can be divided by 5, replace it with 99
    If element can be divided by 3, replace it with 100
    If element can be divided by both 3 and 5, replace it with 101
    NOTE: Assume length will always be more than zero
    Test Data 2: [3, 4, 5, 6]
    Expected Result 2: [100, 4, 99, 100]

     */
    //////////////////////Task7////////////////////
    public static int[]no3or5(int [] arr7){
        for (int i = 0; i < arr7.length; i++) {
            if (arr7[i] % 5 == 0 && arr7[i] % 3 == 0) arr7[i] = 101;
            else if (arr7[i] % 5 == 0) arr7[i] = 99;
            else if (arr7[i] % 3 == 0) arr7[i] = 100;

            }
        return arr7;
        }
        /*
        Requirement:
-Create a method called countPrimes()
-This method will take an int array argument and it will return how many elements in the array are prime numbers

NOTE: Prime number is a number that can be divided only by 1 and itself
NOTE: Negative numbers cannot be prime
Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
NOTE: Smallest prime number is 2

Test Data 3: [41, 53, 19, 47, 67]
Expected Result 3:  5
 */

    //////////////////////Task8////////////////////

    public static int countPrimes(int [] arr8){

        int counter = 0;
        for (int num : arr8) {
            if(num == 2 && num == 3) counter++;
            else if (num > 3) {
                boolean prime = true;
                for (int j = 2; j < num ; j++) {
                 if(num % j == 0){
                     prime = false;
                 }
                }
                if(prime) counter++;
            }

        }
        return counter;

    }







}

