package arrays;

public class Exercise02_countWords {
    public static void main(String[] args) {




        String sentence = "I love arrays";
        int count = 0;
        for (char c : sentence.toCharArray() ) {
            if(c == ' ') count ++;


        }
        System.out.println(count +1);

     //fori loop

        int countS = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == ' ') countS++;
        }

        System.out.println(countS + 1);

        System.out.println("\n------Solution 2 with split() method------\n");

        System.out.println(sentence.split(" ").length); // 3
    }

}
