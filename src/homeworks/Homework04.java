package homeworks;

import com.sun.javaws.exceptions.BadVersionResponseException;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {

        System.out.println("\n===========Task-1===========\n");

        String name= ScannerHelper.getAName();

        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length() -1));
        System.out.println("The first 3 characters in the name are = " + name.substring(0, 3));
        System.out.println("The last 3 characters in the name are = " + name.substring(name.length()-3));

        if(name.startsWith("a") || name.startsWith("A")){ // (name.toLowerCase().startsWith("a"))
            System.out.println("\"You are in the club!\"");
        }
        else{
            System.out.println("\"Sorry, you are not in the club\"");
        }

        System.out.println("\n===========Task-2===========\n");

        String address = ScannerHelper.getAnAddress();

        String city1 = "Chicago";
        String city2 = "Des Plaines";
        String c1 = city1.toLowerCase();
        String c2 = city2.toLowerCase();


        if(address.toLowerCase().contains(c1)){
        System.out.println("You are in the club");}
        else if(address.toLowerCase().contains(c2)){
            System.out.println("You are welcome to join to the club");
        }
        else{
            System.out.println("Sorry, you will never be in the club");
        }



        System.out.println("\n===========Task-3===========\n");

        Scanner c = new Scanner(System.in);

        System.out.println("Please enter 4 favorite colours :");

        String favcol = c.nextLine();

        String colour1 = "Red";
        String colour2 = "Green";



        if(favcol.toLowerCase().contains(colour1.toLowerCase()) && favcol.toLowerCase().contains(colour2.toLowerCase())) {
            System.out.println(colour2 + " and " + colour1 + " are in the list");}
        else if(favcol.toLowerCase().contains(colour2.toLowerCase())){
                System.out.println(colour2 + " is in the list");}
        else if(favcol.toLowerCase().contains(colour1.toLowerCase())) {
                System.out.println(colour1 + " is in the list");}
        else{
            System.out.println(colour2 + " and " + colour1 + " are not in the list");
        }

        System.out.println("\n===========Task-4===========\n");

        String str = "   Java is FUN   ";

        System.out.println("The first word in the str is = " + str.substring(3, 7).toLowerCase());
        System.out.println("The second word in the str is = " + str.substring(8, 10).toLowerCase());
        System.out.println("The third word in the str is = " + str.substring(11, 14).toLowerCase());

    }
}
