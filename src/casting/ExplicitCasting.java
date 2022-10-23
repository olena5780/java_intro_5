package casting;

public class ExplicitCasting {
    public static void main(String[] args) {
        //Explicit casting - narrowing - down casting

        int age = 25;
        byte b = (byte) age;
        System.out.println(b); // 25

        //BUT, we will lose data if bigger primitive hold a data that cannot be stored in small one
        int num1 = 5000;
        byte num2 = (byte) num1; // it seems okay to compiler/runtime error
        System.out.println(num2);



    }
}
