package string_methods;

public class _09_trim_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. string
        3. non-static
        4. doesn't take any argument , not overloaded
         */

        String s1 = "  Hello   ";
        System.out.println(s1.length()); //10
        System.out.println(s1.trim().length()); //5

        System.out.println("Hello World".trim().length()); //11
    }
}
