
package strings;

import javax.sound.midi.Soundbank;

public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        String s3 = s1 + " " + s2; // "Hello" + "World"

        System.out.println(s3); // Hello World

/*
TASK
Create 2 strings to store your firstName and lastName
Then concatenate them with a third String called as fullName
Then print the full name
 */

        System.out.println("\n--------------Concatenation with + operator--------------\n");
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        System.out.println("\n--------------Concatenation with concat() method--------------\n");

        String fullName2 = firstName.concat(" ").concat(lastName); //.concat(" ") =  ,.concat(lastName) = Doe
        System.out.println(fullName2);

        String fName = "Olena";
        String lName = "Shovgeniuk";
        String fullName3 = fName.concat(" ").concat(lName);
        System.out.println("My name is " + fullName3);int num = 5;



    }
}