package practice.ifElseStatements;

import java.util.Scanner;

public class IfElseRandom {
    public static void main(String[] args) {

        /*
// Scanner//
Is it raining (true/false)
Do you have umbrella? (true/false)
Are you hungry? (true/false)

// if elses //
it is raining -> it is raining outside
    if you have umbrella -> you can go outside
    otherwise -> you stay home

it is not raining -> it is not raining outside
    if you are hungry -> you go to chick-fil-a
    otherwise -> you are riding a bike
 */



Scanner input = new Scanner(System.in);



        System.out.println("Is it raining? ");
        boolean isItRaining = input.nextBoolean();

        System.out.println("Do you have umbrella? ");
        boolean doYouHaveUmbrella = input.nextBoolean();

        System.out.println("Are you hungry?  ");
        boolean areYouHungry = input.nextBoolean();

        if(isItRaining){
            System.out.println("it is raining outside");
            if(doYouHaveUmbrella){
                System.out.println("you can go outside");
            }
            else{
                System.out.println("you stay home");
            }
        }
        else{
            System.out.println("it is not raining outside");
            if (areYouHungry){
                System.out.println("you go to chick-fil-a");
            }
            else{
                System.out.println("you are riding a bike");
            }

        }

    }
}
