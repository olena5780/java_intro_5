package homeworks;

public class Homework14 {
    public static void main(String[] args) {
        System.out.println("\n---------------Task-1-----------------\n");
        fizzBuzz1(17);

        System.out.println("\n---------------Task-2-----------------\n");
        System.out.println(fizzBuzz2(4));
        System.out.println(fizzBuzz2(9));
        System.out.println(fizzBuzz2(10));
        System.out.println(fizzBuzz2(15));
        System.out.println(fizzBuzz2(17));

        System.out.println("\n---------------Task-3-----------------\n");
        System.out.println(findSumNumbers("abc$"));
        System.out.println(findSumNumbers("a1b4c  6#"));
        System.out.println(findSumNumbers("ab110c045d"));
        System.out.println(findSumNumbers("525"));

        System.out.println("\n---------------Task-4-----------------\n");
        System.out.println(findBiggestNumber("abc$"));
        System.out.println(findBiggestNumber("a1b4c  6#"));
        System.out.println(findBiggestNumber("ab110c045d"));
        System.out.println(findBiggestNumber("525"));

        System.out.println("\n---------------Task-5-----------------\n");
        System.out.println(countSequenceOfCharacters(""));
        System.out.println(countSequenceOfCharacters("abc"));
        System.out.println(countSequenceOfCharacters("abbcca"));
        System.out.println(countSequenceOfCharacters("aaAAa"));

    }

    //--------------Task-1-----------------
       /*
         Requirement:
         -Create a method called fizzBuzz1()
         -This method will take an int argument, and it will print numbers starting from 1 to given argument.
          BUT, it will print “Fizz” for the numbers divided by 3, “Buzz” for the numbers divided by 5,
          and “FizzBuzz” for the numbers divided both by 3 and 5.

         Test Data 1: 3
         Expected Result 1:
         1
         2
         Fizz

         */
    public static void fizzBuzz1(int num1){
        for (int i = 1; i <= num1 ; i++) {
            if(i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
    //--------------Task-2-----------------
    /*
    Requirement:
-Create a method called fizzBuzz2()
-This method will take an int argument, and it will return a String.
BUT it will return “Fizz” if the given number is divided by 3,
“Buzz” if the number is divided by 5,
and “FizzBuzz” if the number is divided both by 3 and 5.
Otherwise, it will return number itself.

Test Data 5: 15
Expected Result 5: FizzBuzz

     */
    public static String fizzBuzz2(int num2){
        if(num2 % 3 == 0 && num2 % 5 == 0) return("FizzBuzz");
        if(num2 % 3 == 0) return("Fizz");
        if(num2 % 5 == 0) return("Buzz");
        return num2 + "";

    }
    //--------------Task-3-----------------
    /*
    Requirement:
-Create a method called findSumNumbers()
-This method will take a String argument and it will return an int which is the sum of all numbers presented in the String.

NOTE: If there are no numbers represented in the String, return 0.

Test Data 3: “ab110c045d”
Expected Result 3: 155


     */

    public static int findSumNumbers(String str3){ // "a1b4c  6#"
        int sum = 0;
        str3 = str3.replaceAll("[^0-9]"," "); // " 1 4  6 "
        String[] array = str3.split(" ");//[, 1, 4, , , 6]
        for (String a : array) {
            if (!a.isEmpty()) {
                sum += Integer.parseInt(a);
            }
        }
        return sum;
    }
    /*
    int num = 0;
int sum = 0;

for (int i = 0; i < str.length(); i++) {
    if(Character.isDigit(str.charAt(i)))
        num += num * 10 + str.charAt(i) - '0';
    else {
        sum += num;
        num = 0;
    }
}

return sum+num;
     */
    //--------------Task-4-----------------
    /*
    -Create a method called findBiggestNumber()
-This method will take a String argument and it will return an int which is the number presented in the String.

NOTE: If there are no numbers represented in the String, return 0.

Test Data 3: “ab110c045d”
Expected Result 3: 155

     */
    public static int findBiggestNumber(String str4){
        int biggestNum = 0;
        str4 = str4.replaceAll("[^0-9]"," "); // " 1 4  6 "
        String[] array = str4.split(" ");//[, 1, 4, , , 6]
        for (String a : array) {
            if (!a.isEmpty() && biggestNum < Integer.parseInt(a)) {
                biggestNum = Integer.parseInt(a);
            }
        }
        return biggestNum;

    }
    /*
    if(str.isEmpty()) return 0;
int max = Integer.MIN_VALUE;
String[] arr = str.split("[^0-9-]");
for (String s : arr) {
    if(!s.isEmpty()){
        if(s.startsWith("-")){
            String[] arr1 = s.split("-");
            for (String s1 : arr1) {
                if(!s1.isEmpty()) {
                    int number = Integer.parseInt(s1) - Integer.parseInt(s1) - Integer.parseInt(s1);
                    max = Math.max(max, number);
                }
            }
        }else if(!s.contains("-")) max = Math.max(max, Integer.parseInt(s));
        else max = Math.max(max, Integer.parseInt(s.substring(0,s.indexOf("-"))));
    }
}
return max;

     */


    //--------------Task-5-----------------

    /*
    Create a method called countSequenceOfCharacters()
-This method will take a String argument,
 and it will return a String which is the count of repeated characters in a sequence in the String.
NOTE: If given String is empty, then return empty String.
NOTE: It is case sensitive!!!

Test Data 2: “abbcca”
Expected Result 2: “1a2bb2cc1a”
     */

    public static String countSequenceOfCharacters(String str5){ //
        int count = 1;
        String newStr = "";

            for (int i = 0; i < str5.length()-1; i++) {
                if(str5.charAt(i) == str5.charAt(i+1)) {
                    count++;
                }else {
                    newStr += "" + count + str5.charAt(i);
                    count = 1;

                }if(i == str5.length()-2) newStr += String.valueOf(count) + str5.charAt(i+1);

            }
        
        return newStr;


    }
}
