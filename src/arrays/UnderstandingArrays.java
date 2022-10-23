package arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {
        /*
Declare a String and store a name in it
Declare different Strings and store the names of your best  friends in them
Declare different Strings and store the names of all your friends in them

         */
        //Storing a name in a String

        String name = "John";

        //Storing best friends' name;
        String bff1 = "Jane", bff2 = "Alex", bff3 = "Mike";

        //Storing more name
        int i = 26;
        char c = 'A';
        double balance = 10;

        String name1 = "James"; // that holds a single name

        String[] names = {"Beyza", "Andrii", "Vlad", "Samir", "Olena"}; // holding a collection of name

        //Retrieving an element from array - using index
        System.out.println(names[2]);
        System.out.println(names[4]);

        //ArrayIndexOutOfBoundException 0-4
        //System.out.println(names[5]);
        //System.out.println(names[-3]);

        int age = 25;

        int[] ages = {21, 23, 25};
        System.out.println(ages[2]);

    }
}
