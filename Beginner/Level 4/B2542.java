/*
Iu-di-oh! is a card game really popular among kids! Every Iu-di-oh! player has his own deck containing many cards. Each card contains N 
attributes (such as power, speed, smartness, etc.). Attributes are numbered from 1 to N and are given as positive integers.

A match of Iu-di-oh! is always played by two players. At the beginning of the match, each player chooses exactly one card from his deck. 
Then, an attribute is randomly chosen. The player whose the chosen attribute is greater in the card he choose wins the match. If the such 
attribute is equal in both cards, there is a tie.

Marcos and Leonardo are in the big final of the Brazilian Iu-di-oh! championship. The great prize is a Dainavision (that is almost as good 
as a Plaisteition 2!). Given the deck of both players, the card each one chooses and the chosen attribute, determine the winner!
*/

import java.util.Scanner;

public class B2542 {

    public static void main(String[] args) throws Exception {
        Scanner inp = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        while (inp.hasNext()) {
            int attributes = inp.nextInt();
            int marCards = inp.nextInt();
            int leoCards = inp.nextInt();

            int marDeck[][] = new int[marCards][attributes];
            int leoDeck[][] = new int[leoCards][attributes];

            for (int i = 0; i < marCards; i++) {
                for (int j = 0; j < attributes; j++) {
                    marDeck[i][j] = inp.nextInt();
                }
            }

            for (int i = 0; i < leoCards; i++) {
                for (int j = 0; j < attributes; j++) {
                    leoDeck[i][j] = inp.nextInt();
                }
            }

            int marChoice = inp.nextInt() - 1;
            int leoChoice = inp.nextInt() - 1;
            int chosenAttribute = inp.nextInt() - 1;

            if (marDeck[marChoice][chosenAttribute] > leoDeck[leoChoice][chosenAttribute]) {
                result.append("Marcos");
            } else if (marDeck[marChoice][chosenAttribute] < leoDeck[leoChoice][chosenAttribute]) {
                result.append("Leonardo");
            } else {
                result.append("Empate");
            }

            System.out.println(result);

            result.setLength(0);
        }

        inp.close();
    }
}