package strings;

public class PracticeConcatenation {
    public static void main(String[] args) {
        String wordPart1 ="le";
        String wordPart2 ="ar";
        String wordPart3 ="ning";

// Concatenating with plus operator
        String word = wordPart1 + wordPart2 + wordPart3;
        System.out.println(word);

// Concatenating with .concat() method
        System.out.println(wordPart1.concat(wordPart2).concat(wordPart3));



/*
TASK-2
String sentencePart1 = "I can";
String sentencePart2 = "learn Java";

Expected output:
I can learn Java
 */
        String sentencePart1 = "I can";
        String sentencePart2 = "learn Java";
        String sentence = sentencePart1.concat(" ").concat(sentencePart2);

        System.out.println(sentence);





    }
}
