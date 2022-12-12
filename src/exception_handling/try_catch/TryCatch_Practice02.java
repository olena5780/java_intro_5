package exception_handling.try_catch;

import utilities.ScannerHelper;

public class TryCatch_Practice02 {
    public static void main(String[] args) {
        /*
        Write a program that gets 2 numbers from the user as int
        Then dived these numbers and print as the result

        Print the message saying "End of the program"

         */
            int n1 = ScannerHelper.getANumber();
            int n2 = ScannerHelper.getANumber();
            try {
                System.out.println(n1 / n2);
            }
            catch(ArithmeticException e){
                e.printStackTrace();
            }
            System.out.println("End of the program");


    }
}
