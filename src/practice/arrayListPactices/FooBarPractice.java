package practice.arrayListPactices;

public class FooBarPractice {
    public static void main(String[] args) {
        printLucky();
        printFooBar();

    }
    /*
    Create public static method which will take an ArrayList , and it will print "lucky"
    it is dividable by "3"

     */


    public static void printLucky(){
        for (int i = 0; i <= 10; i++) {
            if(i % 3 == 0) System.out.println("Lucky");
            else System.out.println(i);
        }
    }

    public static void printFooBar(){
        for (int i = 1; i <= 10; i++) {
            if(i % 10 == 0) System.out.println("FooBar");
            else if(i % 5 == 0) System.out.println("Bar");
            else if(i % 2 == 0) System.out.println("Foo");
            else System.out.println(i);
        }
    }



}
