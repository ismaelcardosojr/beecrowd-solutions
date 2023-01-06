/*
Matheus was talking to his bride by text message, when she sent the following message:

1-4-3

He did not understand the message, so he asked what it meant, and she said it means 'I Love You', and soon he realized that each separate number by a ' - ' 
is the number of letters for each of words composing the phrase. With that, he had the idea of creating a program that entering certain phrase, it calculates 
the size of each word and separates the values by ' - '. But he still had the idea that the program should receive several phrases line by line and at the end 
of the program the word with the greatest number of characters should be displayed.
*/

import java.io.IOException;
import java.util.Scanner;

public class B2108 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);
        StringBuilder wordsLength = new StringBuilder();

        String phrase, phraseWords[];
        String biggestWord = "";
        int biggestWordLength = 0;

        while (true) {
            phrase = inp.nextLine();
            phraseWords = phrase.split(" ");

            if (phrase.equals("0")) break;

            for (int i = 0; i < phraseWords.length; i++) {
                String thisWord = phraseWords[i];
                int thisWordLength = thisWord.length();

                if (thisWordLength >= biggestWordLength) {
                    biggestWord = thisWord;
                    biggestWordLength = thisWordLength;
                }

                if (i != 0) {
                    wordsLength.append("-");
                }

                wordsLength.append(thisWordLength);
            }

            wordsLength.append("\n");
        }

        System.out.println(wordsLength);
        System.out.println("The biggest word: " + biggestWord);

        inp.close();
    }
}