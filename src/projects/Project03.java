package projects;

public class Project03 {
    public static void main(String[] args) {
        System.out.println("\n===========Task1==========\n");

        String s1 = "24", s2 = "5";
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println("The sum of " + i1 + " and " + i2 + " = " + (i1 + i2));
        System.out.println("The subtraction of " + i1 + " and " + i2 + " = " + (i1 - i2));
        System.out.println("The division of " + i1 + " and " + i2 + " = " + ((double) i1 / (double)i2));
        System.out.println("The multiplication of " + i1 + " and " + i2 + " = " + (i1 * i2));
        System.out.println("The remainder of " + i1 + " and " + i2 + " = " + (i1 % i2));

        System.out.println("\n===========Task2==========\n");

        int randomNum = (int)(Math.random()*(35-1+1)+1);

        System.out.println(randomNum);
        if(randomNum==2){
            System.out.println(randomNum +" IS A PRIME NUMBER");
        }
        else if(randomNum % 2 != 0) {
            System.out.println(randomNum + " IS A PRIME NUMBER");
        }
        else{
            System.out.println(randomNum +" IS NOT A PRIME NUMBER");
        }

        System.out.println("\n===========Task3==========\n");

        int n1 =(int)(Math.random()*(50-1+1)+1);
        int n2 =(int)(Math.random()*(50-1+1)+1);
        int n3 =(int)(Math.random()*(50-1+1)+1);

        System.out.println("Random number 1 = " + n1);
        System.out.println("Random number 2 = " + n2);
        System.out.println("Random number 3 = " + n3);

        int min = Math.min(Math.min(n1,n2), n3);
        int max = Math.max(Math.max(n1,n2), n3);


        System.out.println("Lowest number is = " + min);

       if(n1 != max && n1 != min){
           System.out.println("Middle number is = " + n1);
       }
       else if(n2 != max &&  n2 != min){
           System.out.println("Middle number is = " + n2);
       }
       else{
           System.out.println("Middle number is = " + n3);
       }

        System.out.println("Greatest number is = " + max);

        System.out.println("\n===========Task4==========\n");

        char a = '9';
        System.out.println("Assume you are given " + a);

        if((a >= 65 &&  a <= 90) || (a >= 96 && a<= 122)){
            if(a >= 65 && a <= 90){
                System.out.println("The letter is uppercase");
            }
            else{
                System.out.println("The letter is lowercase");}
        }
        else{
            System.out.println("Invalid character detected!!!");
        }


        System.out.println("\n===========Task5==========\n");

        char i = 'O';
        System.out.println("Assume you are given " + i);


         if(i > 64 && i < 123){
             if(i==65 || i==69 || i==73 || i==79 || i==85 || i==97 || i==101 || i==111 || i==117)
             {
                 System.out.println("The letter is vowel");
             }
             else{
                 System.out.println("The letter is  consonant");
             }
         }
         else{
             System.out.println("Invalid character detected!!!");
         }

        System.out.println("\n===========Task6==========\n");

         char z = '*';
        System.out.println("Assume you are given " + z);

        if(z > 47 && z < 58 && z > 64 && z > 91 && z > 96 && z < 123){
            System.out.println("Invalid character detected!!!");
        }
        else {
            System.out.println("Special character is = " + z);
        }


        System.out.println("\n===========Task7==========\n");

        char e = '@';

        System.out.println("Assume you are given " + e);
        if(e>64 && e<91 || e>96 && e<123){
            System.out.println("Character is a letter");
        } else if (e>47 && e<58) {
            System.out.println("Character is a digit");
        }else{
            System.out.println("Character is a special character");
        }


    }
}
