package conditional_statements.if_else_statements;

import java.util.Scanner;

public class Exercise2_Even_Or_Odd {
    public static void main(String[] args) {
        /*
Write a program that asks user to enter a number.
If the number entered is even, then print message "The number you entered is even!"
If the number entered is odd, then print message "The number you entered is odd!"


EXAMPLE PROGRAM 1
Program: Please enter a number?
User: 6

Program: The number you entered is even!

EXAMPLE PROGRAM 2
Program: Please enter a number?
User: 13

Program: The number you entered is odd!
 */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number?");

        int userEnter = input.nextInt();

        if (userEnter % 2 == 0) {
            System.out.println("The number you entered is even!");
        } else {
            System.out.println("The number you entered is odd!");
        }

        System.out.println("End of the program");

    }
}