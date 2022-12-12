package projects;

import java.util.Arrays;

public class Prac {
    public static void main(String[] args) {


        String str = "day yak";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.endsWith("y")|| str.endsWith("z"))
                count++;

        }
        System.out.println(count);


    }
}