package string_methods;

public class _10_substring_Method {
    public static void main(String[] args) {
        /*
        1.return
        2.return a String
        3. non-static
        4. it is overloaded and


         */
        String s = "TechGlobal";
        // Get "Global"
        String s1 = s.substring(4); // from index 4 to the end
        System.out.println(s1);

        // Get "Tech"
        String s2 = "TechGlobal".substring(0, 4);
        System.out.println(s2);
        //System.out.println(s.substring(2, 15); // StringIndexOutOfBoundsException

    }
}
