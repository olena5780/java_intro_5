package practice.methods;

public class StringMethodsPractice {
    public static void main(String[] args) {
        System.out.println(StringMethodsPractice.isCharExisting("John", 'o', 1));
        System.out.println(StringMethodsPractice.isCharExisting("John", 'o', 2));
        System.out.println(StringMethodsPractice.isCharExisting("John", 'e', 1));
        System.out.println(StringMethodsPractice.isCharExisting("Peter", 'r', 4));

        System.out.println(StringMethodsPractice.isCharContained("john", 't'));

    }

        /*
        Create a public static method named as "isCharExisting" which will take a String, a char, and an index
        it will return true if that char is existing in that string at the given index
         */

        public static boolean isCharExisting(String str, char c, int index){
            return str.charAt(index)== c;

        }


        public static boolean isCharContained(String name, char letter){
            return name.contains(String.valueOf(letter));
           // return name.contains("" + letter);

        }



}
