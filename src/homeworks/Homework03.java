package homeworks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        System.out.println("\n=================Task1=============\n");

       Scanner input = new Scanner(System.in);

        System.out.println("Please enter two number:");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("The difference between numbers is = " + Math.abs(num1-num2));


        System.out.println("\n=================Task2=============\n");

        System.out.println("Please enter five number: ");

        int a1 = input.nextInt();
        int a2 = input.nextInt();
        int a3 = input.nextInt();
        int a4 = input.nextInt();
        int a5 = input.nextInt();


        System.out.println("Max value = " + Math.max(Math.max(Math.max(a1, a2),Math.max(a3, a4)),a5));
        System.out.println("Min value = " + Math.min(Math.min(Math.min(a1, a2),Math.min(a3, a4)),a5));


        System.out.println("\n=================Task3=============\n");

        int randomNumber1 = (int)(Math.random() * (100- 50 + 1)+50);
        int randomNumber2 = (int)(Math.random() * (100- 50 + 1)+50);
        int randomNumber3 = (int)(Math.random() * (100- 50 + 1)+50);

        System.out.println("Number 1 = " + randomNumber1);
        System.out.println("Number 2 = " + randomNumber2);
        System.out.println("Number 3 = " + randomNumber3);
        System.out.println("The sum of numbers is = " + (randomNumber1 + randomNumber2 + randomNumber3));


        System.out.println("\n=================Task4=============\n");

        double moneyAlex = (int) 125;
        double moneyMike = (int) 220;
        double money = 25.5;

        System.out.println("Alex’s money: $" + (moneyAlex - money));
        System.out.println("Alex’s money: $" + (moneyMike + money));


        System.out.println("\n=================Task5=============\n");


        double moneyForBicycle = 390;
        double moneySavePerDay = 15.60;

        int days = (int)(moneyForBicycle / moneySavePerDay);
        System.out.println(days);


        System.out.println("\n=================Task6=============\n");

        String s1 = "5", s2 = "10";

        int number1 = Integer.parseInt(s1);
        int number2 = Integer.parseInt(s2);

        System.out.println("Sum of " + s1 + " and " + s2 + " is = " + (number1 + number2));
        System.out.println("Product of " + s1 + " and " + s2 + " is = " + (number1 * number2));
        System.out.println("Division of " + s1 + " and " + s2 + " is = " + (number1 / number2));
        System.out.println("Subtraction of  " + s1 + " and " + s2 + " is = " + (number1 - number2));
        System.out.println("Remainder of " + s1 + " and " + s2 + " is = " + (number1 % number2));


        System.out.println("\n=================Task7=============\n");

        String s11 = "200",  s22 = "-50";

        int data1 = Integer.parseInt(s11);
        int data2 = Integer.parseInt(s22);

        System.out.println("The greatest value is = " + Math.max(data1, data2));
        System.out.println("The smallest value is = " + Math.min(data1, data2));
        System.out.println("The average value is = " + (data1 + data2)/2);
        System.out.println("The absolute difference value is = " + Math.abs(data1 - data2));


        System.out.println("\n=================Task8=============\n");


        double quarter = 0.25;
        double dime = 0.1;
        double nickel = 0.05;
        double penny = 0.01;

        double moneyPerDay = 3 * quarter + 1 * dime + 2 * nickel + 1 * penny;
        double firstAmount = 24;
        double anotherAmount = 168;


        System.out.println((int) (firstAmount / moneyPerDay) + " days");
        System.out.println((int) (anotherAmount / moneyPerDay) + " days");
        System.out.println("$" + moneyPerDay * 30 * 5);


        System.out.println("\n=================Task9=============\n");

        double expectedAmount = 1250;
        double dailySavingAmount = 62.5;

        int howManyDays = (int)(expectedAmount / dailySavingAmount);

        System.out.println(howManyDays);


        System.out.println("\n=================Task10=============\n");

        double totalAmount = 14265;
        double monthlyPayment1 = 475.5;
        double monthlyPayment2 = 951;

        int howManyMonths1 = (int)(totalAmount/monthlyPayment1);
        int howManyMonths2 = (int)(totalAmount/monthlyPayment2);

        System.out.println("Option 1 will take " + howManyMonths1 + " months");
        System.out.println("Option 2 will take " + howManyMonths2 + " months");


        System.out.println("\n=================Task11=============\n");

        System.out.println("Please enter to number: ");

        int numberOne = input.nextInt();
        input.nextLine();
        int numberTwo = input.nextInt();
        input.nextLine();

        double number_1 = numberOne ;
        double number_2 = numberTwo ;

        System.out.println(number_1 /number_2);


        System.out.println("\n=================Task12=============\n");

        int i1 = (int) (Math.random() * (100 - 0 + 1) + 0);
        int i2 = (int) (Math.random() * (100 - 0 + 1) + 0);
        int i3 = (int) (Math.random() * (100 - 0 + 1) + 0);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        if((i1 > 25) && (i2 > 25) && (i3 > 25)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        System.out.println("\n=================Task13=============\n");

        System.out.println("Please enter a number between 1 to 7:");

        int inputNum = input.nextInt();

        int day1 = 1;
        int day2 = 2;
        int day3 = 3;
        int day4 = 4;
        int day5 = 5;
        int day6 = 6;
        int day7 = 7;

      String firstDay = "MONDAY";
      String secondDay = "TUESDAY";
      String thirdDay = "WEDNESDAY";
      String fourthDay= "THURSDAY";
      String fifthDay = "FRIDAY";
      String sixthDay= "SATURDAY";
      String seventhDay = "SUNDAY";

      if(inputNum == day1 ){
          System.out.println("The number entered returns " + firstDay);
      }
      else if(inputNum == day2) {
              System.out.println("The number entered returns " + secondDay);
          }
      else if(inputNum == day3) {
              System.out.println("The number entered returns " + thirdDay);
          }
      else if(inputNum == day4) {
              System.out.println("The number entered returns " + fourthDay);
          }
      else if(inputNum == day5) {
              System.out.println("The number entered returns " + fifthDay);
          }
      else if(inputNum == day6) {
              System.out.println("The number entered returns " + sixthDay);
          }
      else if(inputNum == day7) {
              System.out.println("The number entered returns " + seventhDay);
          }
      else{
          System.out.println("WRONG INPUT!!!");
      }

        System.out.println("\n=================Task14=============\n");

        System.out.println("Tell me your exam results?");

        int exam1 = input.nextInt();
        int exam2 = input.nextInt();
        int exam3 = input.nextInt();
        int averageExam = (exam1 + exam2 + exam3) /3;

        if(averageExam >= 70){
            System.out.println("YOU PASSED!");
        }
        else{
            System.out.println("YOU FAILED!");
        }

        System.out.println("\n=================Task15=============\n");

        System.out.println("Enter 3 number ");

        int c1 = input.nextInt(), c2 = input.nextInt(), c3 = input.nextInt();

        if((c1 == c2) && (c2 == c3)){
            System.out.println("TRIPLE MATCH");
        } else if ((c1 != c2) && (c2 != c3) && (c3 != c1)) {
            System.out.println("NO MATCH");
        }
        else {
            System.out.println("DOUBLE MATCH");
        }

        }

    }



