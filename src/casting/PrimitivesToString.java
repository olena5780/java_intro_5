package casting;

public class PrimitivesToString {
    public static void main(String[] args) {
        int num1 = 5, num2 = 10;

        System.out.println(num1 + num2); // 15- primitive - number
        System.out.println("" + num1 + num2); // 510 - String - text
        System.out.println(' ' + num1 + num2); // 47 - primitive
        System.out.println("" + (num1 +num2)); // 15 -String
        System.out.println("" + (num1 +num2)); // 15 -String

        System.out.println(String.valueOf(num1) + String.valueOf(num2)); // 510- String

        String num = "245.25";
        double number = Double.parseDouble(num);
        System.out.println(number);







    }
}
