/* 
Robbie is a robot very charismatic, and one of things that he most like to do, besides playing with Glória, it's collect coins. 
Robbie has several coins with equal or different values, and the same size. They’re stored in na organize manner on top of each other, inside a glass cylinder. 
Robbie Always do a little game with Glória using his coins when she ask to play with him from hide and seek, or when she asks him to take her for a walk. 
The rule of the game is: Glória have to choose any number N, which will be added, then for each coin N the value of the coin Vi is added until there aren’t 
no more coins, in other words Ʃ of ((VM-(N*0))+(VM-(N*1))+(VM-(N*2))...), M it’s the number of coins. For exemple, if there’re 5 coins with values 1, 2, 3, 4 
and 5, and Glória choose 2 as a number of jump, them the coins will be added 5, 3 and 1, result in 9. In the end, Robbie checks if the sum of these coins is a 
prime number, if this happen, he do what Glória want, if doesn’t happen, the little girl convince Robbie to play again, Cause she Always convince him to do 
everything, saying that will stop to tell him stories, if he doesn’t make her wish.

You as a good developer of U.S Robots, will help this two friends, writting a computer program that will say the result of the game.
*/

import java.io.IOException;
import java.util.Scanner;

public class B2709 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int totalCoins, coinValue[];
        int incrementValue;
        int sumCoins;
        boolean isPrimeNumber;

        while (in.hasNext() ) {
            sumCoins = 0;
            isPrimeNumber = true;

            totalCoins = in.nextInt();

            coinValue = new int[totalCoins];

            for (int i = 0; i < totalCoins; i++) {
                coinValue[i] = in.nextInt();
            }

            incrementValue = in.nextInt();

            for (int i = coinValue.length - 1; i >= 0; i -= incrementValue) {
                sumCoins += coinValue[i];
            }

            for (int i = 2; i < sumCoins; i++) {
                if (sumCoins % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber && sumCoins != 1) System.out.println("You’re a coastal aircraft, Robbie, a large silver aircraft.");
            else System.out.println("Bad boy! I’ll hit you.");

            in.close();
        }
    }
}