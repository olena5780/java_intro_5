package string_methods;

public class _07_indexOf_lastIndexOf_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. returns an int which matching
        3. non-static
        4. It takes char from String  - there are overloaded methods
         */

        String company = "TechGlobal School";

        int firstIndexOfo = company.indexOf('o'); //6
        int lastIndexOfo= company.lastIndexOf('o'); //6

        System.out.println(firstIndexOfo);
        System.out.println(lastIndexOfo);


        int firstIndexOfl = company.indexOf('l'); //6
        int lastIndexOfl= company.lastIndexOf('l'); //6

        System.out.println(firstIndexOfl); //5
        System.out.println(lastIndexOfl); //16

        System.out.println(company.indexOf('X'));//-1(NOT FOUND)

        /*if you attempt to get an index of non-existing character ir a sequence
        of character from a String happens, then indexOf() or lastIndexOf() methods
        return -1(NOT FOUND)
        */

        System.out.println(company.indexOf("School")); //11


    }
}
