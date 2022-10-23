package conditional_statements.ternary_operator;

import java.util.Random;

public class Exercise2_FindMin {
    public static void main(String[] args) {
        /*
TASK
Write a program that generates 2 random numbers bt 1 and 10
Find and print the smallest number

USE TERNARY


 */
        Random random = new Random();
        int a1= random.nextInt(10) +1; // 1 to 10
        int a2= random.nextInt(10) +1; // 1 to 10

        System.out.println("Random 1 =" + a1);
        System.out.println("Random 2 =" + a2);

        int maxNumber = a1 > a2 ? a1 : a2;

        System.out.println("The minimum number is = " + maxNumber);

        int num1 = (int) (Math.random() * 10) + 1;
        int num2 = (int) (Math.random() * 10) + 1;

        int min = num1 < num2 ? num1 : num2;

        System.out.println("Random 1 = " + num1);
        System.out.println("Random 2 = " + num2);

        System.out.println("The minimum number is = " + min);


    }
}
