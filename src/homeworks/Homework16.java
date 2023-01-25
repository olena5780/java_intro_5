package homeworks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework16 {
    public static void main(String[] args) {
        System.out.println("---------------------Task1-------------------");
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));

        System.out.println("---------------------Task2-------------------");
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Apple", 3);
        map1.put("Mango", 1);
        System.out.println(calculateTotalPrice1(map1));

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Apple", 2);
        map2.put("Pineapple", 1);
        map2.put("Orange", 3);
        System.out.println(calculateTotalPrice1(map2));

        System.out.println("---------------------Task3-------------------");
        HashMap<String, Integer> map3 = new HashMap<>();
        map3.put("Apple", 3);
        map3.put("Mango", 5);
        System.out.println(calculateTotalPrice2(map3));

        HashMap<String, Integer> map4 = new HashMap<>();
        map4.put("Apple", 4);
        map4.put("Mango", 8);
        map4.put("Orange", 3);
        System.out.println(calculateTotalPrice2(map4));
    }
    //////////////////////////Task1////////////////////////
    /*
         Requirement:
     Write a method called as parseData() which takes a String has some keys in {}
     and values after between }{ and returns a collection that has all the keys and values as entries.
     NOTE: The keys should be sorted!

     Test Data:
     {104}LA{101}Paris{102}Berlin{103}Chicago{100}London

     Expected Output:
     {100=London, 101=Paris, 102=Berlin, 103=Chicago, 104=LA}

     */

    public static TreeMap<Integer, String> parseData(String str1) {
        String[] strArray = str1.replaceAll("[{}]", " ").trim().split(" ");
        //[104, LA, 101, Paris, 102, Berlin, 103, Chicago, 100, London]
        TreeMap<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < strArray.length - 1; i += 2) {
            map.put(Integer.parseInt(strArray[i]), strArray[i + 1]);
        }
        return map;
    }

    //////////////////////////Task2////////////////////////
    /*
          Requirement:
      Write a method called as calculateTotalPrice1() which takes a Map of some shopping items with their amounts and calculates the total prices as double. Item prices are given below
      Apple = $2.00
      Orange = $3.29
      Mango = $4.99
      Pineapple = $5.25

      Test Data 2:
      {Apple=2, Pineapple = 1, Orange=3}

      Expected Output 2:
      19.12
     */
    public static double calculateTotalPrice1(HashMap<String, Integer> shoppingBag) {
        HashMap<String, Double> priceList = new HashMap<>();
        priceList.put("Apple", 2.00);
        priceList.put("Orange", 3.29);
        priceList.put("Mango", 4.99);
        priceList.put("Pineapple", 5.25);

        double totalPrice = 0.0;

        for (Map.Entry<String, Integer> product : shoppingBag.entrySet()) {

            totalPrice += priceList.get(product.getKey()) * product.getValue();
        }
        return totalPrice;

    }

    //////////////////////////Task3////////////////////////
    /*
      Requirement:
      Write a method calculateTotalPrice2() which takes a Map of some shopping items with
      their amounts and calculates the total prices as double. Item prices are given below
      Apple = $2.00
      Orange = $3.29
      Mango = $4.99

      BUT there will be some discounts as below
      There will be %50 discount for every second Apple
      There will be 1 free Mango if customer gets 3. So, fourth one is free.

      Test Data 2:
      {Apple=4, Mango = 8, Orange=3}

      Expected Output 2:
      45.81

     */
    public static double calculateTotalPrice2(HashMap<String, Integer> shoppingBag) {
        HashMap<String, Double> priceList = new HashMap<>();
        priceList.put("Apple", 2.00);
        priceList.put("Orange", 3.29);
        priceList.put("Mango", 4.99);

        double totalPrice = 0.0;

        for (Map.Entry<String, Integer> product : shoppingBag.entrySet()) {
            if (product.getKey().equalsIgnoreCase("Apple"))
                totalPrice += product.getValue() * priceList.get(product.getKey()) - product.getValue() / 2;
            else if (product.getKey().equalsIgnoreCase("Mango"))
                totalPrice += (product.getValue() - (product.getValue() / 4)) * priceList.get(product.getKey());
            else totalPrice += product.getValue() * priceList.get(product.getKey());
        }
        return totalPrice;

    }


}