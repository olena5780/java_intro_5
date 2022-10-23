package string_methods;

public class _06_charAt_method {
    public static void main(String[] args) {

        /*
        1. return
        2.  returns char at given index
        3. no -static
        4. it takes one argument as index
        */
        String sentence = "java is fun";

        char c1 = sentence.charAt(3); // 'a'
        char c2 = sentence.charAt(4); // ' ' space

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(sentence.charAt(9)); //u

        //NOTE: Runtime error - String IndexOutOfBoundsException
        //System.out.println(sentence.charAt(-5));
        //System.out.println(sentence.charAt(50));

        //System.out.println(sentence.chatAt(1).toUpperCase()); // NOT POSSIBLE- compiler error
        //because toUppercase() method cannot be invoked with a char data-variable

        System.out.println("End of program");


    }
}
