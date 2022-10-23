package math_class;

import java.util.Scanner;

public class MixAndMaxMethodsPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type two numbers .And what is the maximum number between these two?");
        int maxNumber1 = input.nextInt();
        int maxNumber2 = input.nextInt();
        int maxNumber = Math.max(maxNumber1, maxNumber2);

        System.out.println("The maximum number is : " + maxNumber);



    }
}
