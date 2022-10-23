package primitives;

public class Numbers {
    public static void main(String[] args) {
      /*
      there are 6 primitives used to store numbers as data
      byte, short, int, long-> used to store absolute numbers (3)
      float, double -> used for floating numbers (10.5)


      byte ->1 byte
      short-> 2 bytes
      int -> 4 bytes
      long -> 8 bytes


      NOTE:
      Most of the cases we use int
      John
      his age -> 45
      his favorite number = 70
      his balance -> 400.45

       */
        //dataType variable Name = value

        System.out.println("\n---------Numbers - byte-short-int-long-------\n");

        byte age = 45;
        System.out.println(age);  // 45

        long favNumber = 2_147_483_648L;
        System.out.println(favNumber);  // 45

        /*
        Floating Numbers
        float-> 4 bytes
        double -> 8 bytes
        NOTE: Most of the case we use double
         */
        System.out.println("\n---------Floating Numbers - float - double-------\n");
float balance1 = 23.2345678909876F;
double balance2 = 23.234567890975;

double price = 23.5;
        System.out.println(balance1); //23.287624
        System.out.println(balance2); //23.28762385762384
        System.out.println(price);    //23.5

        //0.00000122312

        double transaction =20;
        System.out.println("double transaction");



    }
}
