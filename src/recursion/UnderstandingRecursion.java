package recursion;

public class UnderstandingRecursion {
   /* public static void print(){
        System.out.println("Hello");
       // print();
    }

    */
// Create a method that prints a number from 1 to given  positive number -
    public static void main(String[] args) {
        // print();// StackOverFlowError

        printNumbers(5);
        printNumbersRecursively(5);


    }
    //
    public static void printNumbers(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }


    public static void printNumbersRecursively(int n){
        if(n == 1) return;
        printNumbersRecursively(-1);

    }
}
