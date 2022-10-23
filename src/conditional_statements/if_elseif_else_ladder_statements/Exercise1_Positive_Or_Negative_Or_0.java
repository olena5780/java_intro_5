package conditional_statements.if_elseif_else_ladder_statements;

import java.util.Scanner;

public class Exercise1_Positive_Or_Negative_Or_0 {
    public static void main(String[] args) {
        /*
Write a program that asks user to enter a number
if number is more than zero, print "POSITIVE"
if number is less than zero, print "NEGATIVE"
Otherwise, print "ZERO"
 */

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter the number : ");
        int num1 = input.nextInt();

        if (num1 > 0){
            System.out.println("\"POSITIVE\"");
            }

            else if(num1 < 0){
            System.out.println("\"NEGATIVE\"");
            }

            else{
            System.out.println("\"ZERO\"");
            }



    }
}
