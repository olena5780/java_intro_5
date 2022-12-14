package arraylist_linkedlist_vector;

import java.util.Arrays;
import java.util.LinkedList;

public class Exercise03_removeElements {
    public static void main(String[] args) {

        LinkedList<String> languages = new LinkedList<>(Arrays.asList("Java","JavaScript","C#", "Python", "C++"));

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");

        /*
        TASK
        Remove all elements that starts with J and print the list
        EXPECTED:
        [C#, Python, C++]
         */

        /*
        for (String language : languages) { // ConcurrentModificationException
            if(language.startsWith("J")) languages.remove(language);
        }
         */

        /*
        for (int i = 0; i < languages.size(); i++) {
            if(languages.get(i).startsWith("J")) {
                languages.remove(languages.get(i));
                i--;
            }
        }
        */

        languages.removeIf(x -> !x.startsWith("C"));
        System.out.println(languages.size()); // 2


    }
}
