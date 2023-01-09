package homeworks;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String str1 = "a1b4c  6#";
        str1 = str1.replaceAll("[^0-9]", " ");
        System.out.println(str1);
        String [] arr = str1.split(" ");
        System.out.println(Arrays.toString(arr));


    }
}
