package arrays;

import java.util.Arrays;

public class SearchingInArrays {
    public static void main(String[] args) {

        int[] numbers = {3,5,8,10};

        //Search for 7 and return true if it exists in array , return false otherwise

        boolean has7 = false;
        for (int number : numbers) {
            if(number == 7){
                has7 = true;
            break;
            }
        }
        System.out.println(has7);
//Search for 5 and return true if it exists in this array, return false otherwise -> true

        boolean has5 = false;
        for (int number : numbers) {
            if(number == 5){
                has5 = true;
                break;
            }
        }
        System.out.println(has5);

        System.out.println("\nBinary search in arrays");
// NOTE: BINARY SEARCH CAN BE USED IF THE ARRAY SORTED OTHERWISE WE WILL GET WRONG RESULTS
        // if the index returned is zero or positive , it means the element exists
        // if the index returned is negative , it means the element doesn't exist
        //

        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 5)); //1
        System.out.println(Arrays.binarySearch(numbers, 10)); //3
        System.out.println(Arrays.binarySearch(numbers, 1)); // -something






    }



}
