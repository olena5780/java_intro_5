package utilities;

import java.util.Scanner;

public class ScannerHelper {
    /*
    We will create a method that asks user to enter a name and RETURN it
     */

    static Scanner input = new Scanner(System.in);
    public static String getAName(){

        System.out.println("Please enter a name:");
        String name = input.nextLine();

        return name;

    }

    /*
    We will create a method that asks user to enter an age and RETURN it
     */
    public static int getAnAge(){
        System.out.println("Please enter an age: ");
        int age = input.nextInt();
        input.nextLine();

        return age;
    }

/*
create a method that asks user to enter an address and return
 */

    public static String getAnAddress(){
        System.out.println("Please enter an address: ");
        String address = input.nextLine();

        return address;
    }

    public static String getAString(){
        System.out.println("Please enter a String");
        return input.nextLine();
    }

    public static String getFavColor(){
        System.out.println("Please enter 4 of your favorite color: ");
        String favColor= input.nextLine();
        input.nextLine();

        return favColor;
    }

    public static int getANumber(){
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        input.nextLine();

        return number;
    }


    public static String getAFullName(){
        System.out.println("Please enter your full name:");
        String fullName = input.nextLine();

        return fullName;
    }


}








