/*
Alice and Betty collect Pok´mon cards. The cards are printed for a game that imitates the battle system of one of the 
most popular videogames in history, but Alice and Betty are too young to actually play the game, and are only 
interested in the actual cards. To make it easier, we'll assume each card has a unique identifier, given as an integer 
number.

Both girls have a set of cards, and, like most girls their age, like to trade the cards they have. They obviously 
don't care about identical cards they both have, and they don't want to receive repeated cards in the trade. Besides, 
the cards are traded in a single operation: Alice gives Betty N distinct cards and receives back other N distinct cards.

The girls want to know what is the maximum number of cards they can trade. For instance, if Alice has cards {1, 1, 2, 
3, 5, 7, 8, 8, 9, 15} and Betty has cards {2, 2, 2, 3, 4, 6, 10, 11, 11}, they can trade at most four cards.

Write a program that given the sets of cards owned by Alice and Betty, determines the maximum number of cards they can 
trade.
*/

import java.util.Scanner;
import java.util.HashSet;

public class B1104 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        HashSet<Integer> aliceDeck = new HashSet<>();
        HashSet<Integer> bethDeck = new HashSet<>();

        while (true) {
            int allAliceCards = inp.nextInt();
            int allBethCards = inp.nextInt();

            if (allAliceCards + allBethCards == 0) break;

            for (int i = 0; i < allAliceCards; i++) {
                int newCard = inp.nextInt();
                aliceDeck.add(newCard);
            }

            for (int i = 0; i < allBethCards; i++) {
                int newCard = inp.nextInt();
                bethDeck.add(newCard);
            }

            if (aliceDeck.size() >= bethDeck.size()) {
                bethDeck.removeAll(aliceDeck);
                System.out.println(bethDeck.size());
            } else {
                aliceDeck.removeAll(bethDeck);
                System.out.println(aliceDeck.size());
            }

            aliceDeck.clear();
            bethDeck.clear();
        }

        inp.close();
    }
}