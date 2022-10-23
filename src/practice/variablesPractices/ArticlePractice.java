package practice.variablesPractices;

public class ArticlePractice {
    public static void main(String[] args) {
        String myName = "Lola";
        int myAge = 25;
        int myWeight = 100;
        double myHeight = 5.9;
        String myHobby1 = "dance";
        String myHobby2 = "sing";
        String myHobby3 = " to go for a walks";

        System.out.println("Hello, guys!" +
                "\nMy name is "+ myName + ". I weight " + myWeight + " pounds." +
                " I am " + myHeight + " feet tall." +
                " I love to " + myHobby1 + ", " + myHobby2 + ", and" + myHobby3 + ". And I enjoy my live to the fullest."
        );

 /*
The United States of America , commonly known as the United States or America,
is a transcontinental country located primarily in North America.
It consists of 50 states, a federal district, five major unincorporated territories,
nine minor outlying islands, and 326 Indian reservations with limited sovereignty.
It is the third-largest country by both land and total area.
The United States shares land borders with Canada to its north and with Mexico to its south.
It maintains maritime borders with the Bahamas, Cuba, Russia, and other nations.
It has a population of over 331 million, and is the third most populous country in the world after China and India.


  */
        String firstCountry = "United States of America";
        String secondCountry = "America";
        String thirdCountry = "North America";
        String fourthCountry = "Canada";
        String sixthCountry = "Bahamas";
        String seventhCountry = "Cuba";
        String eighthCountry = "Russia";
        String ninthCountry = "China";
        String tenthCountry = "India";


        int firstNumber = 50;
        int secondNumber = 326;
        int thirdNumber = 331;


        System.out.println(

        );

        System.out.println("\tThe " + firstCountry + ", commonly known as the " + secondCountry + ",\n" +
                "is a transcontinental country located primarily in North " + secondCountry + ".\n" +
                "It consists of " + firstNumber + " states, a federal district, five major unincorporated territories,\n" +
                "nine minor outlying islands, and " + secondNumber + " Indian reservations with limited sovereignty.\n" +
                "It is the third-largest country by both land and total area.\n" +
                "The United States shares land borders with Canada to its north and with Mexico to its south.\n" +
                "It maintains maritime borders with " + seventhCountry + ", " + eighthCountry + ", and other nations.\n" +
                "It has a population of over " + thirdNumber + " million, and is the third most populous country in the world after " + ninthCountry + " and " +
                tenthCountry + ".");

        String s = " Victory";
            int s1 = s.indexOf(1);
        System.out.println(s1);
    }
}
