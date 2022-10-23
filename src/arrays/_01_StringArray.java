package arrays;

import java.util.Arrays;

public class _01_StringArray {
    public static void main(String[] args) {
        //1.Declare a String Array called as countries, and assign size of 3
        String[] countries = new String[3];

        //2. Assigning values to specific indexes
        countries[1] = "Spain";

        //3.Print specific index from an array
        System.out.println(countries[0]);// null
        System.out.println(countries[1]);// Spain
        System.out.println(countries[2]);// null

        //4. Printing an array
        //Arrays.toString(countries);
        System.out.println(Arrays.toString(countries)); //[null, Spain, null]

            /*Assign Belgium to index of 2 and print array once again
            [null, Spain, Belgium]
             */
        countries[2] = "Belgium";
        System.out.println(Arrays.toString(countries));

        //5. Update existing element
        countries[1] = "France";
        System.out.println(Arrays.toString(countries));

        //6. Getting the length of array - how may elements-3
        System.out.println(countries.length); //3

        //7. Printing each element
        System.out.println(countries[0]);
        System.out.println(countries[1]);
        System.out.println(countries[2]);

        for (int i = 0; i <= 2 ; i++) {
            System.out.println("Country at index of " + i + " is = " + countries[i]);

        }




    }
}
