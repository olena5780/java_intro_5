package scanner_programers;

import java.util.Scanner;

public class PracticeScanner {
    public static void main(String[] args) {
        int age = 34;
        int age1 = 3;
        int age2 = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        age = input.nextInt();

        System.out.println("I am " + age + " years old");

        System.out.println("How old are your kids?");
        age1 = input.nextInt();
        age2 = input.nextInt();

        System.out.println("They are "+ age1 + " and " + age2 + " years old");



    }

}
