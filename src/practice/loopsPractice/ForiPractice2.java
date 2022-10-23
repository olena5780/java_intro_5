package practice.loopsPractice;

public class ForiPractice2 {
    public static void main(String[] args) {

        System.out.println("\nHard coded example\n");

        System.out.println("Number :" + "1");
        System.out.println("Number :" + "2");
        System.out.println("Number :" + "3");
        System.out.println("Number :" + "4");
        System.out.println("Number :" + "5");


        System.out.println("\nFori  coded example v1:\n");
        for (int i = 1; i < 6; i++) {
            System.out.println("Number :" + i);
        }


        System.out.println("\nFori coded example v2\n");
        for (int i = 0; i < 5; i++) {   //0,1,2,3,4
                                        //1,2,3,4,5
            System.out.println("Number :" + (i + 1));

        }
    }
}
