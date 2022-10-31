package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {
        System.out.println("\n------Task1------\n");
        int[] numbers = {89, 0, 23, 0, 12, 0, 15, 34, 0, 7};

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
            if (dog.equals("Pluto")) {
                hasPluto = true;
                break;
            }

        }
        System.out.println(false);

        System.out.println("\n------Task6------\n");

        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));

        for (String cat : cats) {
            if (cats.equals("Garfield") && cats.equals("Felix")) {
                System.out.println(true);
            }
            break;
        }

        System.out.println(false);

        System.out.println("\n------Task7------\n");

        double[] numS = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(numS));

        for (double num1 : numS) {
            System.out.println(num1);
        }

        System.out.println("\n------Task8------\n");

        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        int letter = 0;
        int lowerC = 0;
        int upperC = 0;
        int digit = 0;
        int special = 0;

        System.out.println(Arrays.toString(characters));
        for (char element : characters) {
            if (Character.isLetter(element)) {
                if (Character.isLowerCase(element)) lowerC++;
                else upperC++;
                letter++;
            } else if (Character.isDigit(element)) digit++;
            else special++;

        }
        System.out.println("Letters = " + letter);
        System.out.println("Uppercase letters = " + upperC);
        System.out.println("Lowercase letters = " + lowerC);
        System.out.println("Digits = " + digit);
        System.out.println("Special characters = " + special);


        System.out.println("\n------Task9------\n");
        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};

        System.out.println(Arrays.toString(objects));

        int countUpCase = 0;
        int countLowCase = 0;
        int countBOrP = 0;
        int countBookOrPen = 0;

        for (String object : objects) {
            if (Character.isUpperCase(object.charAt(0))) {
                countUpCase++;
            } else if (Character.isLowerCase(object.charAt(0))) {
                countLowCase++;
            }
            if ((object.toUpperCase().charAt(0) == 'B') || (object.toUpperCase().charAt(0) == 'P')) {
                countBOrP++;
            }
            if (object.toLowerCase().contains("book") || object.toLowerCase().contains("pen")) {
                countBookOrPen++;
            }
        }

        System.out.println("Elements starts with uppercase = " + countUpCase);
        System.out.println("Elements starts with lowercase = " + countLowCase);
        System.out.println("Elements starting with B or P = " + countBOrP);
        System.out.println("Elements having \"book\" or \"pen\" = " + countBookOrPen);


        System.out.println("\n------Task10------\n");

        int[] n = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};

        int more10 = 0;
        int less10 = 0;
        int ten = 0;
        System.out.println(Arrays.toString(n));

        for (int i : n) {
            if (i > 10) more10++;
            else if (i < 10) less10++;
            else ten++;

        }
        System.out.println("Elements that are more than 10 = " + more10);
        System.out.println("Elements that are less than 10 = " + less10);
        System.out.println("Elements that are 10 = " + ten);

        System.out.println("\n------Task11------\n");

        int[] first = {5, 8, 13, 1, 2};
        int[] second = {9, 3, 67, 1, 0};
        int[] third = new int[5];

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        for (int i = 0; i < third.length; i++) {
            third[i] = Math.max(first[i], second[i]);
        }
        System.out.println(Arrays.toString(third));

        String[] names = {"Mila", "Liam", "Olena", "Ljupcho"};


    }
}
