package casting;

public class Exercise08_practising {

    public static void main(String[] args) {
        String num1 = "108", num2 = "157", num3 = "99";

        int s1 = Integer.parseInt(num1);
        int s2 = Integer.parseInt(num2);
        int s3 = Integer.parseInt(num3);


        System.out.println("The absolute of these 3 number is = " + Math.abs(Math.abs(s1-s2) - s3));
        System.out.println("The Maximum of these 3 number is = " + Math.max(Math.max(s1, s2), s3));
        System.out.println("The Minimum of these 3 number is = " + Math.min(Math.max(s1, s2), s3));



    }
}
