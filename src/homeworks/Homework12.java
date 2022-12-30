package homeworks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("\n-----------Task1------------");
        String str1 = "123Tech456Global149";
        System.out.println(noDigit(str1));
        System.out.println("\n-----------Task2------------");
        String str2 = "123Tech456Global149";
        System.out.println(noVowel(str2));
        System.out.println("\n-----------Task3------------");
        String str3 = "john’s age is 29";
        System.out.println(sumOfDigits(str3));
        System.out.println("\n-----------Task4------------");
        System.out.println(hasUpperCase(str3));
        System.out.println("\n-----------Task5------------");
        int n1 = -1, n2 = 25, n3 = 10;
        System.out.println(middleInt(n1, n2, n3));
        System.out.println("\n-----------Task6------------");
        int[] arr6 = {13, 2, 3};
        System.out.println(Arrays.toString(no13(arr6)));
        System.out.println("\n-----------Task7------------");
        int[] arr7 = {120, 1, 720};
        System.out.println(Arrays.toString(arrFactorial(arr7)));
        System.out.println("\n-----------Task8------------");
        String str8 = "12ab$%3c%";
        System.out.println(Arrays.toString(categorizeCharacters(str8)));

    }

    /*
    Requirement:
-Create a method called noDigit()
-This method will take one String argument and it will return a new String with all digits removed from the original String

Test Data 1: “”
Expected Result 1: “”

Test Data 2: “Java”
Expected Result 2: “Java”

Test Data 3: “123Hello”
Expected Result 3: “Hello”

Test Data 4: “123Hello World149”
Expected Result 4: “Hello World”

Test Data 5: “123Tech456Global149”
Expected Result 5: “TechGlobal”

     */

    /////////////////////Task1///////////////////
    public static String noDigit(String str1) {
        String newStr = "";
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (!Character.isDigit(c))
                newStr += c;
        }
        return newStr;
    }


    /*
    Create a method called noVowel()
-This method will take one String argument and it will return a new String with all vowels removed from the original String

Test Data 1: “”
Expected Result 1: “”

Test Data 2: “xyz”
Expected Result 2: “xyz”

Test Data 3: “JAVA”
Expected Result 3: “JV”

Test Data 4: “125$”
Expected Result 4: “125$”

Test Data 5: “TechGlobal”
Expected Result 5: “TchGlbl”

     */


    /////////////////////Task2///////////////////
    public static String noVowel(String str2) {
        return str2.replaceAll("[aouieAOUEI]", "");

    }


    /*
    Requirement:
-Create a method called sumOfDigits()
-This method will take one String argument and it will return an int sum of all digits from the original String.

NOTE: Return zero if there is no digits in the String

Test Data 3: “John’s age is 29”
Expected Result 3: 11

Test Data 4: “$125.0”
Expected Result 4: 8

     */

    /////////////////////Task3///////////////////
    public static int sumOfDigits(String str3) {
        int sum = 0;
        for (int i = 0; i < str3.length(); i++) {
            char c = str3.charAt(i);
            if (Character.isDigit(c)) {
                //sum += Integer.parseInt(String.valueOf(c));
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }

    /*
    Requirement:
-Create a method called hasUpperCase()
-This method will take one String argument and it will return boolean true if there is an uppercase letter and false otherwise.

Test Data 3: “John’s age is 29”
Expected Result 3: true

     */

    /////////////////////Task4///////////////////
    public static boolean hasUpperCase(String str4) {
        boolean hasUpperCase = false;
        for (int i = 0; i < str4.length(); i++) {
            char c = str4.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
                break;
            }
        }
        return hasUpperCase;
    }
    /*
    Requirement:
-Create a method called middleInt()
-This method will take three int arguments and it will return the middle int.

Test Data 4: -1, 25, 10
Expected Result 4: 10

     */

    /////////////////////Task5///////////////////
    public static int middleInt(int n1, int n2, int n3) {
        int[] numbers = {n1, n2, n3};
        Arrays.sort(numbers);
        return numbers[numbers.length / 2];

    }

    /*
    Requirement:
-Create a method called no13()
-This method will take an int array as argument and it will return a new array with all 13 replaced with 0.

NOTE: Assume length will always be more than zero.

Test Data 2: [13, 2, 3 ]
Expected Result 2: [0, 2, 3 ]

     */

    /////////////////////Task6///////////////////

    public static int[] no13(int[] arr6) {

        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] == 13)
                arr6[i] = 0;
        }

        return arr6;
    }




    /*
    -Create a method called arrFactorial()
-This method will take an int array as argument and it will return the array with every number replaced with their factorials.

NOTE: If given array is empty, then return it back empty.
NOTE: 0! equals to 1

Test Data 1: [1, 2, 3, 4]
Expected Result 1: [1, 2, 6, 24]

Test Data 2: [0, 5]
Expected Result 2: [1, 120]

Test Data 3:[5 , 0, 6]
Expected Result 3: [120, 1, 720]

Test Data 4:[]
Expected Result 4: []

     */


    /////////////////////Task7///////////////////
    public static int[] arrFactorial(int[] arr7) {
        int[] numbers2 = new int[arr7.length];

        for (int i = 0; i < arr7.length; i++) {
            int f = 1;
            for (int j = 1; j <= arr7[i]; j++) {
                f = f * j;
            }
            numbers2[i] = f;
        }
        return numbers2;
    }



    /*
    Requirement:
-Create a method called categorizeCharacters()
-This method will take String as an argument and return a String array as letters at index of 0, digits at index of 1 and specials at index of 2.
NOTE: IGNORE SPACES

NOTE: Assume length will always be more than zero.

Test Data 1: “     ”
Expected Result 3: [ , , ]

Test Data 2: “abc123$#%”
Expected Result 2: [abc, 123, $#%]

Test Data 3: “12ab$%3c%”
Expected Result 3: [abc, 123, $%%]

     */


    /////////////////////Task8///////////////////


    /*
       public static String[]categorizeCharacters(String str8){
           String[] arr8= {"", "", ""};

           for (int i = 0; i < str8.length(); i++) {
               char c = str8.charAt(i);
               if(Character.isLetter(c))
                   arr8[0]+=c;
              else if (Character.isDigit(c))
                   arr8[1] += c;
                   else arr8[2]+=c;


           }
           return arr8;
           }


     */
    public static String[] categorizeCharacters(String str) { // str = 123abcABC#$%
        return new String[]{
                str.replaceAll("[^a-zA-Z]", ""),//abcABC
                str.replaceAll("[^0-9]", ""),//123
                str.replaceAll("[A-Za-z0-9 ]", "")//#$%
        };


    }


}
