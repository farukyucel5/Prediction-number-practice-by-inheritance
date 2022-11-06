package Guess_number;

import java.util.Random;
import java.util.Scanner;

public class Child_guess extends Guess_number {



    public static void main(String[] args) {

        Child_guess obj=new Child_guess();
        int the_number_picked=obj.getPick();//I called the number picked by the method  getter

        Scanner scan=new Scanner(System.in);
        System.out.println("Please guess a number between 1 and 10: ");
        int guess=scan.nextInt();       //The user tapped in their guess.
        int result=obj.guessNumber(guess);


        if (result == 0)
             System.out.println("you won! the number that I picked: " + the_number_picked);

         else if (result == 1)
             System.out.println("Lower than the number I picked! The number that I picked : " + the_number_picked);

         else
             System.out.println("Higher than the number I picked! The number that I picked : " + the_number_picked);

    }
}
