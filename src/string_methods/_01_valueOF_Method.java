package string_methods;

public class _01_valueOF_Method {
    public static void main(String[] args) {


        /*
        1. return type
        2. returns a String
        3. static (called by the object)
        4. takes the arguments - there are many overloaded valueOf() methods
        */


        int num = 125;
        String numString = String.valueOf(num); //static

        System.out.println(num);
        System.out.println(numString);

        System.out.println(num + 5); // 125 +5 -> 130
        System.out.println(numString + 5); // 125 +5 -> 1255


    }
}
