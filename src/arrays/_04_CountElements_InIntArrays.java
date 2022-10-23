package arrays;

public class _04_CountElements_InIntArrays {
    public static void main(String[] args) {
        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};
        /*
        negatives:2
        positives: 5
        zeros: 3
        even: 6
        odd: 4
         max:
         min:
         sum:
         # fibonacci:
         # unique
         # prime
         # number dived 5
         average 2
         absolute difference between max and min 17
         closest number to 9:(take the smallest if you have 2 ) 8

         */

        int negatives = 0;

        for (int number : numbers) {
            if(number < 0) negatives++;

        }
        System.out.println("Negative count is = " + negatives);

        int positives = 0;

        for (int number : numbers) {
            if(number > 0) positives++;

        }
        System.out.println("Positive count is = " + positives);

        int zero = 0;
        for (int number : numbers) {
            if(number == 0) zero++;

        }
        System.out.println("Zero count is = " + zero);

        int even = 0;
        for (int number : numbers) {
            if(number % 2 == 0) even++;

        }
        System.out.println("Even count is = " + even);

        int even1 = 0;


        int odd = 0;
        for (int number : numbers) {
            if(number % 2 == 1 || number % 2 == -1) odd++;

        }
        System.out.println("Odd count is = " + odd);


    }
}
