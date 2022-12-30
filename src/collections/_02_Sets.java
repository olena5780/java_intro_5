package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.println("\n-------HashSet---------");
        hashSet.add(5);
        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(0);
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);//[0, null, 5, 10] random order, no duplicated, one null

        System.out.println("\n-------LinkedHashSet---------");
        linkedHashSet.add(5);
        linkedHashSet.add(5);
        linkedHashSet.add(10);
        linkedHashSet.add(0);
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);//[5, 10, 0, null] insertion order, no duplicates, one null

        System.out.println("\n-------TreeSet---------");
        treeSet.add(5);
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(0);
        //treeSet.add(null);//NullPointerException
        //treeSet.add(null);//NullPointerException
        System.out.println(treeSet);//[0, 5, 10] // sorted order, no duplicates, no nulls

    }
}
