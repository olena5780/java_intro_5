package arrays;

import com.sun.xml.internal.org.jvnet.fastinfoset.EncodingAlgorithmIndexes;

public class Exercise01_countChar {
    public static void main(String[] args) {
     /*
        int countA = 0;

        String word = "Java";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a')countA++;

            System.out.println(countA);
        }


 */
        String word = "Java"; // [J, a, v, a]

        int countA = 0;

        for(char element : word.toCharArray()){
            if(element == 'a') countA++;
        }

        System.out.println(countA);



    }
}