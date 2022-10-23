package conditional_statements.if_else_statements;

public class IfElseSyntax {
    public static void main(String[] args) {
        /*
        - If or else statements are used to control the flow of the program based on conditions
        - conditions are always boolean statements(true of false)
        - if block can be ud=sed without else block
        - else block CAN NEVER be used without if
         */

        boolean condition = true;
        if(condition){
            //This is the if block , and it executes if the condition is true
            System.out.println("AAA");

        }
        else{
            //This is the else block , and it executes if the condition is False
            System.out.println("BBB");
        }

        System.out.println("End of the program");

    }
}
