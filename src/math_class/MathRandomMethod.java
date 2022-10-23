package math_class;

public class MathRandomMethod {
    public static void main(String[] args) {

        double myRandom = Math.random();
        int myRandomBetween0To10 = (int)(Math.random() * 11); //0, 10 (both included)

        int myDice = (int) (Math.random() * 6) + 1;



        // 0.0, 0.1, 0.2..... 0.9999
        //0, 1, 2, 3, 4.... 9
        //System.out.println("Random number is = " + Math.random());


        System.out.println("Random number is = " + Math.random());
        System.out.println("Random number between 0 to 10 is = " + myRandomBetween0To10);
        System.out.println("My dice value is = " + myDice);

        int MyRandomBetween50To100 = (int)(Math.random() * (100 - 50 + 1) + 50);

        int MyRandomBetween20To40 = (int)(Math.random() * (40 - 20 + 1) + 20);

        System.out.println("Random number between 20 and 40 is = " + MyRandomBetween20To40);




    }
}
