package collections;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.HashMap;

public class _07_Map_Implementation {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Beyza");
        map.put(1, "Malek");

        System.out.println(map);//{1=Malek}
        System.out.println(map.size());//1

        map.put(2, "Malek");
        System.out.println(map);//{1=Malek, 2=Malek}
        System.out.println(map.size()); //2

        map.put(null, "Andrii");
        map.put(null, "Vlad");
        System.out.println(map); //{null=Vlad, 1=Malek, 2=Malek}

        map.put(3, "Viktoria");
        map.put(4, null);
        map.put(5, null);
        map.put(3, null);
        map.put(-5, "Ashraf");
        map.put(0, "Filiz");
        System.out.println(map); //{null=Vlad, 0=Filiz, 1=Malek, 2=Malek, 3=null, 4=null, -5=Ashraf, 5=null}

    }
}
