package utilities;

public class MathHelper {
    /*
   Write a method that to returns the max number of 3 int numbers
   */
    public static int maxOfThree(int num1, int num2, int num3){
        return Math.max(Math.max(num1, num2), num3);
    }


    /*
   Write a method that to returns the max number of 3 int numbers
   */

    public static int minOfThree(int num1, int num2, int num3){
        return Math.min(Math.min(num1, num2), num3);
    }
     /*
   Write a method that to returns the middle number of 3 int numbers
   Assume numbers can never be equal to each other

   */
   public static int middleOfThree(int num1, int num2, int num3){
       int max = maxOfThree(num1, num2, num3);
       int min = minOfThree(num1, num2, num3);

       if(num1 != min && num1 != max) return num1;
       else if(num2 != min && num2 != max) return num2;
       else return num3;
   }

   public static boolean isEven(int num){
       return num % 2 == 0;
   }

    public static boolean isOdd(int num){
        return num % 2 == 1;
    }

    /*
    create a method that takes 2 int arguments and returns their sum
    Method name= sum

    public static
     */

    public static int sum (int num1, int num2){
        return num1 + num2;
    }

    // Overloading a method

    public static int sum (int num1, int num2, int num3){
        return num1 + num2 + num3;
    }






}
