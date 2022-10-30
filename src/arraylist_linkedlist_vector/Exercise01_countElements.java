package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01_countElements {
    public static <ArraysList> void main(String[] args) {
        /*
        Create an ArrayList and store below colors
        Blue
        Brown
        Pink
        Yellow
        Red
        Purple
        Print an Arraylist
        Size
        Each element separately
        */
        System.out.println("\n------TASK-1 -------\n");

        //ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Pink", "Yellow", "Red", "Purple"));


        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Purple");

        System.out.println(colors);

        System.out.println(colors.size());

        for (String color : colors) {
            System.out.println(color);
        }

      /*
Count the elements that has length of 6

EXPECTED:
2
 */

        System.out.println("\n------TASK-2 - Elements that has length of 6-------\n");

        int count6 = 0;

        for (String color : colors) {
            if(color.length() == 6) count6++;
        }

        System.out.println(count6); // 2

        count6 = 0; // Resetting your counter

        for (int i = 0; i < colors.size(); i++) {
            if(colors.get(i).length() == 6) count6++;
        }

        System.out.println(count6); // 2


        int countO = 0;
        int countO1 =0;

        for (String color : colors){
            if(color.toLowerCase().contains("o"))
                countO++;
        }
        System.out.println(countO);

        for (int i = 0; i < colors.size(); i++) {
            if(colors.get(i).toLowerCase().contains("o"))
                countO1++;
        }
        System.out.println(countO1);


    }

}
