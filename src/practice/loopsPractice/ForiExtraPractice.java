package practice.loopsPractice;

public class ForiExtraPractice {
    public static void main(String[] args) {


        System.out.println("\n hard coded print examples\n");

        System.out.println("Number: " + "1");
        System.out.println("Number: " + "-1");

        System.out.println("Number: " + "2");
        System.out.println("Number: " + "-2");

        System.out.println("Number: " + "3");
        System.out.println("Number: " + "-3");

        System.out.println("Number: " + "4");
        System.out.println("Number: " + "-4");

        System.out.println("Number: " + "5");
        System.out.println("Number: " + "-5");

        System.out.println("\n fori print examples v1\n");

        for (int i = 1, j = -1; i < 6 && j > -6; i++, j--) {
            System.out.println("Number: " + i);
            System.out.println("Number: " + j);
        }
    }
}