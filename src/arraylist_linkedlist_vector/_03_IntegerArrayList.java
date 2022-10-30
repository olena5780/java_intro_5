package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _03_IntegerArrayList {
    public static void main(String[] args) {
        /*
        create an Array to store below numbers
        10
        15
        20
        10
        20
        30
        print Array
        print the size

         */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);
        System.out.println(numbers.size());

        System.out.println("\n ---------contains method----------");
        System.out.println(numbers.contains(10));//true
        System.out.println(numbers.contains(20));//true
        System.out.println(numbers.contains(11));//false
        System.out.println(numbers.contains(22));//false

        System.out.println("\n ---------indexOf() method----------");
        System.out.println(numbers.indexOf(15)); //1
        System.out.println(numbers.indexOf(25)); //-1
        System.out.println(numbers.indexOf(20)); //12

        System.out.println("\n ---------lastIndexOf() method----------");
        System.out.println(numbers.indexOf(30)); //5
        System.out.println(numbers.indexOf(35)); //-1
        System.out.println(numbers.indexOf(10)); //3

        System.out.println("\n ---------Retrieving each element with fori loop---------");
        numbers.get(0);
        numbers.get(1);
        numbers.get(2);
        numbers.get(3);
        numbers.get(4);
        numbers.get(5);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        System.out.println("\n ---------Retrieving each element with fori loop---------");
        }
        for(Integer element : numbers){
            System.out.println(element);
        }



    }
}
