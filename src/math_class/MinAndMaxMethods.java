package math_class;

public class MinAndMaxMethods {
    public static void main(String[] args) {

        int maxNumber = Math.max(80, 27); //80
        int maxNumber2 = Math.max(maxNumber, 125);
        int maxNumber3 = Math.max(maxNumber, 625);

        System.out.println("maxNumber = " + maxNumber); //80
        System.out.println("maxNumber2 = " + maxNumber2); //125
        System.out.println("maxNumber3 = " + maxNumber3); //625

        int minNumber = Math.min(80, 27);
        int minNumber2 = Math.min(minNumber, 2);

        int mindOfTwoNeg = Math.min (-40, -60);

        System.out.println("minNumber = " + minNumber); //27
        System.out.println("minNumber = " + minNumber2); //2
        System.out.println("mindOfTwoNeg = " + mindOfTwoNeg); //-60


        double maxOfTwoDecimals = Math.max(1.7, 6.5);
        double maxOfTwoDecimals1 = Math.max(-5.4, -27.2);

        System.out.println("maxOfTwoDecimals = " + maxOfTwoDecimals); //6.5
        System.out.println("maxOfTwoDecimals = " + maxOfTwoDecimals1); //-5.4


        /*
        Find max value of the given numbers and print then
        6, 9
        17, 49
        34.2, 12.5
        -14, -32
        17, 49, 125

         */

        int maxOfTwoNumber = Math.max(6, 9);
        int maxOfTwoNumber1 = Math.max(17,49);
        double maxOfTwoNumber2 = Math.max(34.2, 12.5);
        int maxOfTwoNumber3 = Math.max(-14,-32);

        System.out.println("maxNumber = " + maxOfTwoNumber);
        System.out.println("maxNumber1 = " + maxOfTwoNumber1);
        System.out.println("maxNumber2 = " + maxOfTwoNumber2);
        System.out.println("maxNumber3 = " + maxOfTwoNumber3);

        System.out.println("Max is " + Math.max(Math.max(17, 49), 125));


        /*
Find the min value of the given numbers and print them
* 6, 9
* 17, 49
* 34.2, 12.5
* -14, -32
* 17, 49, 125
* 45, 32, 56, 89

 */



        System.out.println("Min Value = " + Math.min(6, 9));
        System.out.println("Min Value = " + Math.min(17, 49));
        System.out.println("Min Value = " + Math.min(34.2, 12.5));
        System.out.println("Min Value = " + Math.min(-14, -32));
        System.out.println("Min Value = " + Math.min(Math.min(17, 49), 125));
        System.out.println("Min Value = " + Math.min(Math.min(45, 32), Math.min(56, 89)));







    }
}
