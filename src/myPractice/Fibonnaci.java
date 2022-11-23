package myPractice;

public class Fibonnaci {
    public static void main(String[] args) {
        int n = 10;
        int fNum = 0;
        int sNum = 1;


        String f = "O - ";

        for (int i = 0; i <= n; i++) {
            int sum = fNum + sNum;
            fNum = sNum;
            sNum = sum;

            f += fNum + " - ";
        }
        System.out.println(f);
    }
}