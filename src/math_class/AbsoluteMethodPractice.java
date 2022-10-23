package math_class;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class AbsoluteMethodPractice {
    public static void main(String[] args){
        int num1 = 100;
        int num2 = 69;
        System.out.println("What is the absolute number between " + Math.abs(num1 -num2));
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your favorite number?");
        int favNumber = scan.nextInt();

        System.out.println("What is your another favorite number?");
        int favNumber2 = scan.nextInt();

        System.out.println("What is the absolute number between these two numbers?");
        System.out.println("The absolute number between these 2 numbers is: " + Math.abs(favNumber - favNumber2));

    }
}
