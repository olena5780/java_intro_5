package casting;

public class CastingNegativeNumbersIntoChar {
    public static void main(String[] args) {
        int negative = -32;
        char myChar = (char) negative;
        char zero = 48;
        char upperA= 65;
        char upperZ = 90;
        char myCharO = 'O';
        int oAsciiValue = myCharO;



        System.out.println(myChar);
        System.out.println("Negative number char value = " + negative);
        System.out.println("Zero" + zero);

        System.out.println("Uppercase A = " + upperA);
        System.out.println("Uppercase Z = " + upperZ);

        System.out.println("Uppercase O = " + myCharO);
        System.out.println("O ASCII Value = " + oAsciiValue);

        if(oAsciiValue >= 65 && oAsciiValue <= 90);
        System.out.println();

    }
}
