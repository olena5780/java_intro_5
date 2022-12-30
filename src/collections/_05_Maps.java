package collections;

import java.util.HashMap;

public class _05_Maps {
    public static void main(String[] args) {

        /*
        Key      Value
        IL       Illinois
        WI       Wisconsin
        CA       California

        1        Vlad
        2        Andrii
        3        Vlad


         */
        HashMap<String, String> map = new HashMap<>();
        map.put("IL", "Illinois");
        map.put("WI", "Wisconsin");
        map.put("CA", "California");
        map.put("CA", "abc"); // will keep the updated the value
        map.put(null, "xxx");
        map.put(null, "yyy");// no duplicate keys are allowed
        map.put("A", null);
        map.put("B", null);// the same value is allowed
        map.put("C", null);


        System.out.println(map.size()); // 7
        System.out.println(map);// {null=yyy, A=null, WI=Wisconsin, B=null, IL=Illinois, C=null, CA=abc}
    }
}
