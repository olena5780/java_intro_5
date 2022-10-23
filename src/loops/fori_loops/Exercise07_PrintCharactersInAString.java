package loops.fori_loops;

public class Exercise07_PrintCharactersInAString {
    public static void main(String[] args) {
        String str = "TechGlobal School";
      /*
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2);
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(7));

       */

        for (int i = 0; i <= str.length()-1; i++) {
            System.out.println(str.charAt(i));

        }


    }
}
