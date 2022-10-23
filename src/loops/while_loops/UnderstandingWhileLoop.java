package loops.while_loops;

import java.sql.SQLOutput;

public class UnderstandingWhileLoop {
    public static void main(String[] args) {

        //Print numbers from 1 to 10
        System.out.println("\n______ForI loop_______\n");
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i);
        }

        System.out.println("\n______While loop_______\n");
        int start = 1;

        while(start <= 10) {
            System.out.println(start);

            start++;
        }

    }
}
