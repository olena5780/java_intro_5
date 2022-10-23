package homeworks;


import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args){
        System.out.println("=============Task1============");

    int num1 = 5, num2 = 10;


        Scanner input = new Scanner(System.in);

        System.out.println("The number 1 entered by user is = ");
        num1 = input.nextInt();

        System.out.println("The number 2 entered by user is = " );
        num2 = input.nextInt();

        System.out.println("The number 1 entered by user is = " + num1 );
        System.out.println("The number 2 entered by user is = " + num2 );
        System.out.println("The sum of number 1 and 2 entered by user is = " + (num1 + num2));


        System.out.println("\n=============Task2============");

        int num3 = 3, num4 = 5;

        System.out.println("Please enter first number: ");
        num3 = input.nextInt();

        System.out.println("Please enter second number: ");
        num4 = input.nextInt();

        System.out.println("The product of given 2 numbers is: " + num3 * num4);


        System.out.println("\n=============Task3============");

        double input1 = 24, input2 = 10;

        System.out.println("Please enter first floating number: ");
        input1 = input.nextDouble();

        System.out.println("Please enter second floating number: ");
        input2 = input.nextDouble();


        System.out.println("The sum of given numbers is = " + (input1 + input2));
        System.out.println("The product of the given numbers is = " + input1 * input2);
        System.out.println("The subtraction of the given numbers is = " + (input1 - input2));
        System.out.println("The division of the given numbers is = " + input1 / input2);
        System.out.println("The remainder of the given numbers is = " + input1 % input2);


        System.out.println("\n=============Task4============");

        int firstCalculation = -10 + 7 * 5;
        System.out.println("1.\t" + firstCalculation);
        int secondCalculation = (72+24) % 24;
        System.out.println("2.\t" + secondCalculation);
        int thirdCalculation = 10 + -3 * 9 / 9;
        System.out.println("3.\t" + thirdCalculation);
        int fourthCalculation = 5 + 18 / 3 * 3 - (6 % 3);
        System.out.println("4.\t" + fourthCalculation);


        System.out.println("\n=============Task5============");

        int input3 = 7, input4 = 11;

        System.out.println("Please enter first number: ");
        input3 = input.nextInt();

        System.out.println("Please enter another number: ");
        input4 = input.nextInt();

        System.out.println("The average of given number is: "+ ( input3 + input4 ) / 2);


        System.out.println("\n=============Task6============");

        int input5 = 6, input6 = 10, input7 = 12, input8 = 15, input9 = 17;

        System.out.println("Please enter 5 numbers: ");

        input5 = input.nextInt();
        input6 = input.nextInt();
        input7 = input.nextInt();
        input8 = input.nextInt();
        input9 = input.nextInt();

        System.out.println("The average of given number is: "+ ( input5 + input6  + input7 + input8 + input9) / 5);


        System.out.println("\n=============Task7============");

        int input10 = 5, input11 = 6, input12 = 10;

        System.out.println("Please enter 3 numbers: ");

        input10 = input.nextInt();
        input11 = input.nextInt();
        input12 = input.nextInt();

        System.out.println("The " + input10 + " multiplied with " + input10 + " is = " + input10 * input10);
        System.out.println("The " + input11 + " multiplied with " + input11 + " is = " + input11 * input11);
        System.out.println("The " + input12 + " multiplied with " + input12 + " is = " + input12 * input12);


        System.out.println("\n=============Task8============");

        System.out.println("Please enter the number of  the side of square's perimeter and area: ");

        int side= 7;
        side = input.nextInt();

        System.out.println("Perimeter of the square = " + 4 * side);
        System.out.println("Area of the square = " + side * side);


        System.out.println("\n=============Task9============");

        double yearlySalary = 90_000;
        int year = 3;
        System.out.println("A Software Engineer in Test can earn $" + yearlySalary * year + " in " + year + " years.");


        System.out.println("\n=============Task10============");

            /*
        User’s favorite book is: Java 101
        User’s favorite color is: Blue
        User’s favorite number is: 7
            */

        String favBook = "Java 101", favColor = "Blue";
        int favNumber = 7;

        input.nextLine();

        System.out.println("What is your favorite book?");
        favBook = input.nextLine();

        System.out.println("What's your favorite color?");
        favColor = input.next();

        System.out.println("What's  your favorite number?" );
        favNumber =input.nextInt();

        System.out.print("\nUser's favorite book is = " + favBook + "." +
                "\nUser's favorite color is: " + favColor + "." +
                "\nUser's favorite number is: " + favNumber + ".\n");


        System.out.println("\n=============Task11============");

        /*
    firstName = John
	lastName = Doe
	age = 45
	emailAddress = johndoe@gmail.com
	phoneNumber = (123) 123 1234
	address = 123 St Chicago IL 12345

	Output:
	  User who joined this program is John Doe. John’s age is 45.
	   John’s email address is johndoe@gmail.com, phone number is (123) 123
	    1234, and address is 123 St Chicago IL 12345.
	    */

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
                "\nJohn’s age is " + age + ". John’s email address is " + emailAddress + ", phone number is (123) 123 " +
                "\n1234, and address is " + address + ".");



    }
}




