package loops.while_loops;

public class Exercise01_PrintOutOddNumbers {
    public static void main(String[] args) {
        /*
        Print odd numbers from 1 to 10 (both included) using while loop
         */
        int i = 1;

        while(i <= 10){
            if(i % 2 == 1) System.out.println(i);
            i++;
        }
    }
}
