package arrays;

import java.util.Arrays;

public class _05_charArray {
    public static void main(String[] args) {
        System.out.println("\n----------Task1-------\n");
      /*
TASK-1
Create a char array and store values below
#
$
5
A
b
H

Print the array

EXPECTED:
[#, $, 5, A, b, H]
 */

        char[] characters = new char[6];
        characters[0] = '#';
        characters[1] = '$';
        characters[2] = '5';
        characters[3] = 'A';
        characters[4] = 'b';
        characters[5] = 'H';
        System.out.println(Arrays.toString(characters));


        System.out.println("\n-------TASK-2--------\n");
                    /*

           Print the size of the array with a message

           EXPECTED:
            The size of the array is = 6
             */

        System.out.println("The size of the array is = " + characters.length);

        System.out.println("\n-------TASK-3--------\n");
        //print with fori loop
        for (int i = 0;  i < characters.length; i++) {
            System.out.println(characters[i]);

        }
        System.out.println("\n-------TASK-4--------\n");
        //print with for each loop
        for (char character : characters) {
            System.out.println(character);

        }

        System.out.println("\n-------TASK-5--------\n");

       // for each loop
        for (char character : characters) {
            if(Character.isLetter(character)) System.out.println(character);
        }

        //fori loop
        for (int i = 0; i < characters.length; i++) {
            if(Character.isLetter(characters[i])) System.out.println(characters[i]);
        }
        System.out.println("\n-------TASK-6--------\n");

        int count = 0;
        for (char character : characters) {
            if(Character.isUpperCase(character))
                count++;
        }
        System.out.println(count);

        //fori loops
        int count1 = 0;

        for (int i = 0; i < characters.length; i++) {
            if(Character.isUpperCase(characters[i]))
                count1++;
        }
        System.out.println(count1);


    }
}



