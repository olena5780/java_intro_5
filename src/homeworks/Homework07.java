package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {
        System.out.println("\n----------------Task1---------------\n");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 23, 67, 23, 78));

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("\n----------------Task2---------------\n");

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Red", "White", "Black", "Purple"));

        System.out.println(colors.get(0));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println("\n----------------Task3---------------\n");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(23, -34, -56, 0, 89, 100));
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);

        System.out.println("\n----------------Task4---------------\n");

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Istanbul", "Berlin", "Madrid", "Paris"));

        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("\n----------------Task5---------------\n");

        ArrayList<String> marvels = new ArrayList<>(Arrays.asList("Spider Man", "Iron Man", "Black Panter", "Deadpool", "Captain America"));

        System.out.println(marvels);
        System.out.println(marvels.contains("Wolwerine"));

        System.out.println("\n----------------Task6---------------\n");

        ArrayList<String> avengers = new ArrayList<>(Arrays.asList("Hulk", "Black Widow", "Captain America", "Iron Man"));
        Collections.sort(avengers);
        System.out.println(avengers);
        System.out.println(avengers.contains("Hulk") && avengers.contains("Iron Man"));

        System.out.println("\n----------------Task7---------------\n");

        ArrayList<Character> characters = new ArrayList<>(Arrays.asList('A', 'x', '$', '%', '9', '*', '+', 'F', 'G'));
        System.out.println(characters);
        for (char character : characters){
            System.out.println(character);
        }

        System.out.println("\n----------------Task8---------------\n");

        ArrayList<String> objects = new ArrayList<>(Arrays.asList("Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"));
        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);

        int countM = 0;
        int countNoAE = 0;
        for(String element : objects){
            if(element.toLowerCase().startsWith("m")){
                countM++;
            }
            if(!element.toLowerCase().contains("a") && !element.toLowerCase().contains("e")){
                countNoAE++;
            }
        }
        System.out.println(countM);
        System.out.println(countNoAE);

        System.out.println("\n----------------Task9---------------\n");

        int countUpperC = 0;
        int countLowerC = 0;
        int countP = 0;
        int countStartAndEndsWithP = 0;
        ArrayList<String> kitchenObjects = new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixer"));
        System.out.println(kitchenObjects);

        for (String a : kitchenObjects) {
            if(a.charAt(0) >= 'A' && a.charAt(0) <= 'Z')
                    countUpperC++;
            else if(a.charAt(0) >= 'a' && a.charAt(0) <= 'z')
                    countLowerC++;
            if(a.toLowerCase().contains("p")) {
                countP++;
            }
            if(a.toLowerCase().startsWith("p") || a.toLowerCase().endsWith("p")){
                    countStartAndEndsWithP++;
            }

        }
        System.out.println("Elements starts with uppercase = " + countUpperC);
        System.out.println("Elements starts with lowercase = " + countLowerC);
        System.out.println("Elements having P or p = " + countP);
        System.out.println("Elements starting or ending with P or p = " + countStartAndEndsWithP);

        System.out.println("\n----------------Task10---------------\n");

        ArrayList<Integer> numTask10 = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));

        System.out.println(numTask10);

        int countDividedBy10 = 0;
        int countEvenGreaterThan15 = 0;
        int countOddLessThan20 = 0;
        int countLess15OrMore50 = 0;


        for (Integer n : numTask10) {
            if((int)n % 10 == 0){
                countDividedBy10++;
            }
            if((int)n % 2 == 0 && (int) n > 15){
                countEvenGreaterThan15++;
            }
            if((int)n % 2 == 1 && (int) n < 20){
                countOddLessThan20++;
            }
            if((int)n < 15 || (int)n > 50){
                countLess15OrMore50++;
            }

        }
        System.out.println("Elements that can be divided by 10 = " + countDividedBy10 +
                        "\nElements that are even and greater than 15 = " + countEvenGreaterThan15 +
                        "\nElements that are odd and less than 20 = " + countOddLessThan20 +
                        "\nElements that are less than 15 or greater than 50 = " +countLess15OrMore50);





    }
}
