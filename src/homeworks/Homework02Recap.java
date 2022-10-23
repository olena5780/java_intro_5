package homeworks;

import java.util.Scanner;

public class Homework02Recap {
    public static void main(String[] args) {

        System.out.println("\n============Task1==============\n");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();


        System.out.println("The number 1 entered by user is " + num1);
        System.out.println("The number 2 entered by user is " + num2);
        System.out.println("The sum of number 1 and 2 entered by user is " + (num1 +num2));

        System.out.println("\n============Task2==============\n");

        System.out.println("Please enter 2 numbers: ");

        int numProduct1 = input.nextInt();
        int numProduct2 = input.nextInt();

        System.out.println("The product of the given 2 number is : " + (numProduct1 * numProduct2));

        System.out.println("\n============Task3============\n");
        double floatNumber1, floatNumber2;


        System.out.println("Please enter 2 numbers; ");

        floatNumber1 = input.nextDouble();
        floatNumber2 = input.nextDouble();

        System.out.println("The remainder of given number is = " + floatNumber1 % floatNumber2);

        System.out.println("\n============Task8==============\n");

        System.out.println("Please enter a side of the square; ");
        int side= input.nextInt();
        int perimeter = input.nextInt();
        int area = input.nextInt();

        System.out.println("Perimeter of the square = " + perimeter);
        System.out.println("Area of the square = " + area);


        System.out.println("\n============Task9==============\n");

        double yearlySalary = 90_000;
        double avg3YearSalary = yearlySalary * 3;

        System.out.println("A Software Engineer in Test can earn $" + avg3YearSalary + " in 3 years.");

        System.out.println("\n============Task10==============\n");


        System.out.println("What is your favorite book?");
        String favBook = input.nextLine();
        input.nextLine();

        System.out.println("What is your favorite color?");
        String favColor = input.nextLine();

        System.out.println("What is your favorite number?");
        int favNumber = input.nextInt();

        System.out.println("User's favorite book is : " + favBook +
                "\nUser's favorite color is : " + favColor +
                "\nUser's favorite Number is :" + favNumber + " \n");



        System.out.println("\n============Task10==============\n");

        String firstName;
        String lastName;
        int age;
        String emailAddress;
        String phoneNumber;
        String address;

        System.out.println();

        System.out.println("What's your first name?");
        firstName = input.next();

        System.out.println("What's your last name?");
        lastName = input.next();

        System.out.println("What's your age?");
        age = input.nextInt();

        System.out.println("What's your email address?");
        emailAddress= input.next();

        System.out.println("What's your phone number?");
        phoneNumber = input.next();

        System.out.println("What's your address?");
        address = input.next();

        System.out.println("\tUser who joined this program is " + firstName + " " + lastName + "." +
                "\nJohn’s age is " + age + ". John’s email address is " + emailAddress + ", phone number " +
                "is " + phoneNumber + ", and address is " + address + ".");









    }

}
