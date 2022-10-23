package practice.ifElseStatements;

import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number 0 to 99 :");
        int myInt = scan.nextInt();

        if(myInt >=0 && myInt<25){
            System.out.println("First Quarter");
        } else if (myInt>=25 && myInt<50 ) {
            System.out.println("Second Quarter");
        } else if (myInt>=50 && myInt<75) {
            System.out.println("Third Quarter");
        }
        else if(myInt >=75 && myInt< 100){
            System.out.println("Fourth Quarter");
        }
        else{
            System.out.println("None of this above");
        }

        /*
         if the number is between -50 / -1 print "number is in negative part"
         if the number is between 0 print "number is zero"
         if the number is between 1 / 50 print "number is in positive part"
         */

        if(myInt<0 && myInt >= -50) {
            System.out.println("number is in negative part");
        }
        else if(myInt>0 && myInt <= -50){
            System.out.println("number is in positive part");
        }
        else if(myInt == 0){
            System.out.println("number is zero");
        }
        else{}


    }
}
