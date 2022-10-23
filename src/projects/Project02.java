package projects;

import java.util.Scanner;

public class Project02 {

    public static void main(String[] args) {

        System.out.println("\n============Task-1=============\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 3 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        input.nextLine();

        System.out.println("The product of the numbers entered is = " + (num1 * num2 *num3));

        System.out.println("\n============Task-2=============\n");

        int currentYear = 2022;

        System.out.println("What is your first name?");
        String firstName = input.nextLine();

        System.out.println("What is your last name?");
        String lastName = input.nextLine();

        System.out.println("What is your year of birth?");
        int yearOfBirth = input.nextInt();
        input.nextLine();

        System.out.println(firstName + " " + lastName + "'s age is = " + (currentYear - yearOfBirth) +".");

        System.out.println("\n============Task-3=============\n");

        System.out.println("What is your full name? ");
        String fullName = input.nextLine();

        System.out.println("What is your weight?");
        double kgWeight = input.nextDouble();
        input.nextLine();

        System.out.println(fullName + "'s weight is = " + (kgWeight * 2.205) + " lbs.");

        System.out.println("\n============Task-4=============\n");

        System.out.println("What is your full name? ");
        String fullName1 = input.nextLine();

        System.out.println("What is your age?");
        int age1 = input.nextInt();
        input.nextLine();

        System.out.println("What is your full name? ");
        String fullName2 = input.nextLine();

        System.out.println("What is your age?");
        int age2 = input.nextInt();
        input.nextLine();

        System.out.println("What is your full name? ");
        String fullName3 = input.nextLine();

        System.out.println("What is your age?");
        int age3 = input.nextInt();
        input.nextLine();

        int eldestAge = Math.max(Math.max(age1, age2), age3);
        int youngestAge = Math.min(Math.min(age1, age2),age3);

        System.out.println(fullName1 +"'s age " + age1 + ".");
        System.out.println(fullName2 +"'s age " + age2 + ".");
        System.out.println(fullName3 +"'s age " + age3 + ".");
        System.out.println("The average age is " + ((age1 + age2 + age3) /3) + ".");
        System.out.println("The eldest age is " + eldestAge + "." );
        System.out.println("The youngest age is " + youngestAge + ".");







    }
}
