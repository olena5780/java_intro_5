package casting;

public class CastingCharacters {
    public static void main(String[] args) {
        int i1 = 65;
        System.out.println(i1);
        char c1 = (char) i1;
        System.out.println(c1);
        System.out.println(51); //51
        System.out.println((char) 51); // 3
        System.out.println((char) 123); //{
        System.out.println((char) 32);
        System.out.println((char) 400);

        char char1 = 'A';
        char char2 = 97; // 'a'

        System.out.println( char1 + char2); //65 + 97 ->163
        System.out.println("" + char1 + char2); //Aa
        System.out.println("" + (char1 + char2)); //162






    }
}
