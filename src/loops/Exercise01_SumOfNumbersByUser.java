package loops;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise01_SumOfNumbersByUser {
    public static void main(String[] args) {
      /*
Write a Java program that asks user to enter some numbers and find the sum of numbers given by user

Example Program:
Program: Please enter how many number you want to enter
User: 3

Program: Please enter number 1
User: 10

Program: Please enter number 2
User: 7

Program: Please enter number 3
User: 8

Expected output:
25
 */

        Scanner input = new Scanner(System.in);

        System.out.println("\n___________while loop_________");

        System.out.println("Please enter how many number you want to enter:");
        int count = input.nextInt();

        int sum1 = 0;

        for (int i = 1; i <= count; i++) {

        System.out.println("Please enter number :" + i);

        sum1 += input.nextInt();}

        System.out.println(sum1);




        System.out.println("\n-----while solution-----\n");

        System.out.println("Please enter how many number you want to enter");
        int count2 = input.nextInt(); // How many numbers we are getting 3

        int sum2 = 0;

        int start = 1;

        while(start <= count2){
            System.out.println("Please enter number " + start);
            sum2 += input.nextInt();
            start++;
        }

        System.out.println(sum2);


    }
}
