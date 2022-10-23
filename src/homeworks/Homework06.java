package homeworks;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {
        System.out.println("\n------Task1------\n");
        int[] numbers = {89, 0, 23, 0, 12, 0, 15, 34, 0, 7};

        //int[] numbers = new numbers[3]
        //int[] numbers = new numbers[0]
        //int[] numbers = new numbers[9]
        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n------Task2------\n");
        String[] strings = {null, "abc", null, null, "xyz"};

        System.out.println(strings[3]);
        System.out.println(strings[0]);
        System.out.println(strings[4]);
        System.out.println(Arrays.toString(strings));

        System.out.println("\n------Task3------\n");

        int[] num = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.println("\n------Task4------\n");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println("\n------Task5------\n");

        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(dogs)); //search

        boolean hasPluto = false;
        for (String dog : dogs) {
            if(dog.equals("Pluto")) {
                hasPluto = true;
                break;
            }

        }
        System.out.println(false);

        /*
                Requirement:
        -Create a String array that stores cartoon cats below
        Garfield, Tom, Sylvester, Azrael

        THEN:
        -Print the entire array sorted lexicographically
        -Then, check if it contains Garfield and Felix
            if it contains both, then print true
            if it does not contain both, print false

        Expected Result:
        [Azrael, Garfield, Sylvester, Tom]
        false
                 */

        System.out.println("\n------Task6------\n");

        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));

        for (String cat : cats) {
            if(cats.equals("Garfield") && cats.equals("Felix")){
            System.out.println(true);}
            break;
        }

        System.out.println(false);

        System.out.println("\n------Task7------\n");

        double[] numS = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(numS));

        for(double num1 : numS){
            System.out.println(num1);
        }

        System.out.println("\n------Task8------\n");
        /*
                Requirement:
        -Create a char array that stores characters below
        A, b, G, H, 7, 5, &, *, e, @, 4

        THEN:
        -Print the entire array
        -Print the total count of the letters
        -Print the total count of lowercase letters
        -Print the total count of uppercase letters
        -Print the total count of digits
        -Print the total count of special characters

        Expected Result:
        [A, b, G, H, 7, 5, &, *, e, @, 4]
        Letters = 5
        Uppercase letters = 3
        Lowercase letters = 2
        Digits = 3
        Special characters = 3

         */

        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        int total = 0;
        int letter = 0;
        int lowerC = 0;
        int upperC = 0;
        int digit = 0;
        int special = 0;

        System.out.println(Arrays.toString(characters));









    }
}
