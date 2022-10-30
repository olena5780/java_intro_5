package arrays;

public class _12_PartialArray_Practices {
    public static void main(String[] args) {

        int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        int[] numbers1 = {10, -3, -7, 0, 0, 7, 22};

        System.out.println(sumOfFirstThree(numbers));
        System.out.println(sumOfLastTFive(numbers1));

    }

    public static int sumOfFirstThree(int[] numbers) {

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum++;
        }

        return sum;
    }

    public static int sumOfLastTFive(int[] numbers1) {

        int sum1 = 0;
        for (int i = numbers1.length - 1; i > numbers1.length - 6; i--) {
            sum1 += numbers1[i];
        }
        return sum1;
    }

}